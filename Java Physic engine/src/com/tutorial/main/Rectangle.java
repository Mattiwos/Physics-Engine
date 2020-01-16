package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Rectangle extends GameObject{
    private int width;
    private int height;

    public Rectangle(int  x, int y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;

        setVolX(5);
        setVolY(5);
        

    }
    public void tick(){
        setX(getX()+getVelX());
        setY(getY()+getVelY());
        
        if (getY() >= Constants.windowHeight.getConst() - height || getY() <0){
            setVolY(getVelY()*-1);
        }

        if (getX() >= Constants.windowWidth.getConst() - width || getX() <= 0){
            
            setVolX(getVelX()*-1);
        }

    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x,y,width,height);

    }
    public void print(String arg){
        System.out.println(arg);

    }

//javac com/tutorial/main/Game.java 
//updates all files



}