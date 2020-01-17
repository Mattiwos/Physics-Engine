package com.tutorial.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    private Handler handler;
    private Constants constants;
    
    public KeyInput(Handler handler){
        this.handler = handler;

    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        System.out.println(key);

        playerMovement(key);
        


    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        System.out.println(key);

    }
    public void playerMovement(int key){
        for (int i = 0; i < handler.object.size(); i++){
            if (handler.object.get(i).getId() == ID.Player){
                

            }

        }
    }



}