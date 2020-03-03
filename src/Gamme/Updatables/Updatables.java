package Gamme.Updatables;

import processing.core.PApplet;

public abstract class Updatables {


    public abstract void update (PApplet p);

    public abstract boolean isFinished();

    public abstract void show(PApplet p);

    public abstract int layer();

}
