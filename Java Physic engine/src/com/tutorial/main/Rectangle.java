package com.tutorial.main;

import java.awt.Color;
import java.awt.*;
import java.lang.Object;

public class Rectangle extends GameObject{
    private int width;
    private int height;
    
    
    private double prevTime;

    private double initVel;
    private double finalVel;
    private double timePassed = 0.0;
    private double currS = 0.0;
    private double startTime;
    private double scale = 10;
    private boolean initialQ = false;

    public Rectangle(double  x, double y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;
        initVel = 50;
        setVelX(0);
        setVelY(initVel);


        
        
        


        

    }
    
    public void tick(){
        if (initialQ != true){
            startTime = System.currentTimeMillis();
            initialQ = true;
        }
 

        currS = ((System.currentTimeMillis()-startTime)/1000D);

        //System.out.println(currS +": seconds & y: "+ getY());
        
        /**
        y = distance
        y = (inital Velocity)x +(1/2)(accelration)(time^2) 
        dY/dt = (inital Velocity) + (accelration)(time)
        

         */
        
       
        if (getY() <= 0){
            /** 
            double maxheight = (-initVel)/Constants.acceleration; //y = 12x +(1/2)(accelration)(time^2) and dY/dt = 12 + (accelration)(time)
            maxheight = ( (initVel * maxheight) + ( (0.5)*(Constants.acceleration)*(maxheight *maxheight)) );

            System.out.println("Max height: " + maxheight);
            
            initVel = Math.sqrt(Math.abs((double) (2 * (maxheight * Constants.acceleration) ) )) ;
            */
            initVel = initVel/2;
            System.out.println("New initVel: " + initVel);

            startTime = System.currentTimeMillis();


        }
        double distY = scale*( (initVel*currS) + ((0.5)*((Constants.acceleration) * (currS*currS))));
        setY(distY);

        
        

        
        if (getY() >= Constants.windowHeight - height || getY() <= 0){
            setVelY(getVelY()*-1);
            //print(Double.toString(getVelY()));
        }

        prevTime = System.currentTimeMillis();


    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect((int)getX(),(int)getY(),width,height);

    }
    public void print(String arg){
        System.out.println(arg);

    }

//javac com/tutorial/main/Game.java 
//updates all files



}