package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Ellipse extends GameObject{
    private int width;
    private int height;
    
    
    public Ellipse(double  x, double y,int initwidth,int initheight, ID id){
        super(x,y,id);//constructor for gameObject
        width = initwidth;
        height = initheight;

        setVelX(5);
        
        setVelY(5);
        

    }

    public void tick(){
        // setX(getX()+getVelX());
        // setY(getY()+getVelY());
        
        // if (getY() >= Constants.windowHeight - height || getY() <0){
        //     setVelY(getVelY()*-1);
        // }

        // if (getX() >= Constants.windowWidth - width || getX() <= 0){
            
        //     setVelX(getVelX()*-1);
        // }

    }
    public void render(Graphics g){
        // g.setColor(Color.blue);
        // g.drawOval(x,y,width,height);
        // g.fillOval(x,y,width,height);

    }
    public void print(String arg){
        System.out.println(arg);

    }

}