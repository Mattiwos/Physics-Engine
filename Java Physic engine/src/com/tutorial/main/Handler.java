package com.tutorial.main;

import java.util.LinkedList;

public class Handler { //maintanes and updates all objects
    //will loop throgh all objects
    LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void tick(){
        for(int i = 0; i < object.size(); i++){ //loops through all obejcts
            GameObject tempObject = object.get(i);
            tempObject.tick(); //updates all objects

        }
    }
    public void render(Graphics g){
        for(int i =0; i < objects.size(); i++){
            GameObject tempObject = object.get(i);
            tempObject.render(g); //renders all objects
        }


    }

    public void addObject(GameObject object){ //adds and removes objects in the list
        this.object.add(object);
    }
    public void removeObject(GameObject object){
        this.object.remove(object);
    }

}
