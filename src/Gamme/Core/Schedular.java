package Gamme.Core;

import Gamme.Updatables.Updatables;
import processing.core.PApplet;

import java.util.ArrayList;

public class Schedular extends PApplet {

    ArrayList<Updatables> updatable = new ArrayList<Updatables>();
    public String gameState;

    public void add(Updatables o) {
        updatable.add(o);
    }

    public void getInOrder(){
        ArrayList<Updatables> temp = new ArrayList<Updatables>();
        int lowest = 0;
        int index = 0;
        for (int i = 0; i < updatable.size(); i ++) {
            for (Updatables u : updatable) {
                if (lowest <= u.layer()) {
                    lowest = u.layer();
                    index = updatable.indexOf(u);
                }
            }
            temp.add(updatable.get(index));
            updatable.remove(index);
        }
        for (Updatables u : temp){
            updatable.add(u);
        }
    }

    public void update (PApplet p){
            getInOrder();
            for (int i = 0; i < updatable.size() ; i ++) {
                updatable.get(i).update(p);
                updatable.get(i).show(p);
                if (updatable.get(i).isFinished()) {
                    updatable.remove(i);
                }
            }

    }

    public Schedular (PApplet p){
        gameState = "Menu";
    }

}
