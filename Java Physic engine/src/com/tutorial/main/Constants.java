package com.tutorial.main;

public enum Constants{
    windowWidth(1000), windowHeight(640);
    private final int num;

    Constants(int num){
        this.num = num;
    }
    public int getConst(){
        return this.num;
    }

}