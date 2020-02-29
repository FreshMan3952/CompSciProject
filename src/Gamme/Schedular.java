package Gamme;

import processing.core.PApplet;

import java.util.ArrayList;

public class Schedular extends PApplet {

    ArrayList<Updatables> updateable = new ArrayList<Updatables>();
    public String gameState;

    public void add(Updatables o) {
        updateable.add(o);
    }

    public void update (PApplet p){
            for (int i = 0; i < updateable.size() ; i ++) {
                updateable.get(i).update(p);
                updateable.get(i).show(p);
                if (updateable.get(i).isFinished()) {
                    updateable.remove(i);
                }
            }

    }

    public Schedular (PApplet p){
        gameState = "Menu";
    }

}
