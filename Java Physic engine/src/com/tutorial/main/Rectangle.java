package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Rectangle extends GameObject{
    private int width;
    private int height;
    
    
    private double prevTime;

    private double initVel;
    private double finalVel;
    private double timePassed = 0.0;
    private double currS = 0.0;
    private double startTime;
    private double scale = 100;
    private boolean initialQ = false;

    public Rectangle(double  x, double y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;
        initVel = 1;
        setVelX(0);
        setVelY(initVel);


        
        
        


        

    }
    
    public void tick(){
        if (initialQ != true){
            startTime = System.currentTimeMillis();
            initialQ = true;
        }
        currS = ((System.currentTimeMillis()-startTime)/1000D);

        System.out.println(currS +": seconds & y: "+ getY());

        
        //System.out.println( (  (initVel*(Game.miliseconds /1000)) + ((1/2)*(Constants.acceleration)*((Game.miliseconds) /1000)) * (Game.miliseconds /1000)));
        //System.out.println(currenttimemili);

        setY(  scale * ( (initVel*currS) + ((1/2)*((Constants.acceleration) * (currS*currS)))) );

        
        
        
        
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