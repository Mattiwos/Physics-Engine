package com.tutorial.main;

import java.awt.Color;
import java.awt.*;

public class Player extends GameObject{
    public Player(int  x, int y, ID id){
        super(x,y,id);//constructor for gameObject
        
        

    }
    public void tick(){
        setX(getX()+1);

    }
    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x,y,32,32);

    }





}