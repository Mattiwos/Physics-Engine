package com.tutorial.main;

import java.awt.*;

public abstract class GameObject { //basic frame for all objects
    protected double x,y; //protected means the varables could only be changed by classes which inhierts it
    protected ID id;
    protected double velX, velY;
    private Constants constants;


    public GameObject(double x, double y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;

    }
    public abstract void tick();
    public abstract void render(Graphics g);
    public void setId(ID id){
        this.id = id;
    }
    public ID getId(){
        return id;
    }


    public void setX(double x){
        this.x = x; //using this. to refer to class variables
    }
    public void setY(double y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    

    public void setVelX(double velX){
        this.velX = velX;
    }
    public void setVelY(double velY){
        this.velY = velY;
    }

    public double getVelX(){
        return this.velX;
    }
    public double getVelY(){
        return this.velY;
    }


}
