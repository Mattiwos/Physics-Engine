package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Rectangle extends GameObject{
    private int width;
    private int height;
    private Constants constants;

    public Rectangle(double  x, double y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;

        setVelX(5);
        setVelY(5);
        

    }
    public void tick(){

        
            //setVelX(getVelX() * Constants.Gravity);
        setVelY(getVelY()* Constants.Gravity);
        print(Double.toString(getVelY())); 
        

        
        setY(getY()+getVelY());
        
        if (getY() >= Constants.windowHeight - height || getY() <= 0){
            setVelY(getVelY()*-1);
            //print(Double.toString(getVelY()));
        }

        

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