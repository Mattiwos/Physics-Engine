package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Player extends GameObject{
    private int width;
    private int height;

    public Player(int  x, int y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;

        setVolX(1);
        

    }
    public void tick(){
        setX(getX()+getVelX());
        
        

        if (getX() >= 640 - width || getX() <= 0){
            
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