package com.tutorial.main;
//https://www.youtube.com/watch?v=0T1U0kbu1Sk&list=PLWms45O3n--6TvZmtFHaCWRZwEqnz2MHa&index=2
import java.awt.*;


import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public final int width = Constants.windowWidth, height = Constants.windowHeight;
    private Thread thread;
    private boolean running = false;
    private Handler handler;

    public Game(){ //consutructor
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler)); //tells the game to listen to keys

        new GUIWindow(width, height, "GUI", this);
        new Window(width, height, "Physic Engine", this);

        
        
        handler.addObject(new Rectangle(100,100,32,32,ID.Rectangle));
        handler.addObject(new Rectangle(200,100,50,50,ID.Rectangle));
        handler.addObject(new Ellipse(150,200,50,50,ID.Ellipse));
    }
   
    

    public synchronized void start() {
        thread = new Thread(this);
        
        thread.start();
        running = true;
    }
    public synchronized void stop() {
        try {
            thread.join(); //kils (stops) thread
            running = false;
        }catch (Exception e){//prints why
            e.printStackTrace();
        }
    }

    public void run(){ //game loop method
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;//nano seconds in ticks
        //
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;

        while(running)
        {
            long now = System.nanoTime(); //gets current nanoseconds passed
            delta += (now - lastTime) / ns;// current time - previous then divided by  nsper tecks
            lastTime = now;
            while(delta >=1)
            {
                tick();
                delta--;
            }
            if(running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                //System.out.println("FPS: "+ frames);
                frames = 0;
            }
        }
        stop();
        //Explanation of the long loop:
        //"lastTime", "now," and "ns" are used to calculate "delta." amountOfTicks is the amount of tics/second, and ns is the amount of nanoseconds/tick.
        //When delta is calculated, you have (now-lastTime)/(ns/tick), but now and lastTime  are in nanoseconds, so it has units "tick". We then add this to delta, and keep going.
        //Whenever delta+=1, one tick has passed, and we therefore call the command tick() [[[which is explained in the video]]], and reset delta to 0 in the while(delta>=1) loop.
        //the if(running) loop updates the window (by rendering again), and increases the frames with 1.
        //the if(System.currentTimeMillis()-timer>1000) loop writes out the FPS once per second by checking if the current time is more than 1000 milliseconds (1 second) larger than "timer" was.
        //IF so, we update "timer" to be 1 second later (timer+=1000;), and print the amount of frames that have passed, and set frames to 0. Since this event happens once every second, the value "frames" is the frames per second.
        //stop() stops the game.
    }

    private void tick(){//update loop
        handler.tick();
    }
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
                this.createBufferStrategy(3);
                return;
        }
        Graphics g = bs.getDrawGraphics();

        
        g.setColor(Color.black);
        g.fillRect(0,0, width, height);

        handler.render(g);
        
        

        g.dispose();
        bs.show();
    }

    public static void main (String arg[]){ //First called

    

    new Game();
    
    

    }


}
