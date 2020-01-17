package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Rectangle extends GameObject{
    private int width;
    private int height;
    
    
    private int prevTime;

    private double initVel;
    private double finalVel;
    private int timePassed;

    public Rectangle(double  x, double y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;

        setVelX(0);
        setVelY(.9);
        

    }
    public void tick(){
        
        if (Game.seconds - prevTime>= 1){
            
        //setVelY(getVelY() + (-1) * Constants.acceleration);
        
        timePassed +=1;
        
        }
        
        System.out.println(getY());
        setY( ((getVelY()*timePassed) + (1/2)*(Constants.acceleration)*(timePassed * timePassed)) );
        

        
        
        
        if (getY() >= Constants.windowHeight - height || getY() <= 0){
            setVelY(getVelY()*-1);
            //print(Double.toString(getVelY()));
        }

        prevTime = Game.seconds;

    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect((int)x,(int)y,width,height);

    }
    public void print(String arg){
        System.out.println(arg);

    }

//javac com/tutorial/main/Game.java 
//updates all files



}