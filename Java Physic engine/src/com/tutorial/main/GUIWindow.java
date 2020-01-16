package com.tutorial.main;
import javax.swing.*;
import java.awt.*;

public class GUIWindow extends Canvas {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private int width;
    private int height;
    private String title;
    private Game game;
    private Constants constants;
   

    public GUIWindow(int initwidth, int initheight, String inittitle, Game initgame){
        width = initwidth;
        height = initheight;
        title = inittitle;
        game = initgame;
        

        JFrame frame = new JFrame(title); //cfreated frame of the window using java library awt.*
        frame.setPreferredSize(new Dimension(width,height)); //refers to function in Jframe class
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes when clicking x button without it it wont close the game

        frame.setResizable(false); //prevents resizing
        frame.setLocationRelativeTo(null); //can set location
        
        frame.setVisible(true); //makes frame visible
       

    }
    



}