package Gamme;

import processing.core.*;


public abstract class Entity extends PApplet {

    public Entity (){
        //empty for now ?
    }


    public abstract void show(PApplet p);
    public abstract void init(PApplet p);
    public abstract void update(PApplet p);

}
