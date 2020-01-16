package com.tutorial.main;

public enum Constants{
    windowWidth(640), windowHeight(480);
    private final int num;

    Constants(int num){
        this.num = num;
    }
    public int getConst(){
        return this.num;
    }

}