package com.tutorial.main;

import java.awt.*;

public abstract class GameObject { //basic frame for all objects
    protected int x,y; //protected means the varables could only be changed by classes which inhierts it
    protected ID id;
    protected int velX, velY;
    private Constants constants;


    public GameObject(int x, int y, ID id){
        this.x = x;
        this.y = y;
        this.id = id;

    }
    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x){
        this.x = x; //using this. to refer to class variables
    }
    public void setY(int y){
        this.y = y;
    }
    public void setId(ID id){
        this.id = id;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public ID getId(){
        return id;
    }
    public void setVolX(int velX){
        this.velX = velX;
    }
    public void setVolY(int velY){
        this.velY = velY;
    }
    public int getVelX(){
        return this.velX;
    }
    public int getVelY(){
        return this.velY;
    }
}
