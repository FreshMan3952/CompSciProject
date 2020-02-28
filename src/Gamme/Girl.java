package Gamme;

import processing.core.*;

public class Girl extends Animation {

    public Animation animate;
    public int x = 100;
    public int y = 0;
    public int xSize = 80;
    public int ySize = 100;


    public Girl (PApplet p) {
        animate = new Animation();
        animate.init(p,"girl",4);
    }

    public void update( PApplet p) {
        y = p.mouseY;
        animate.setAnimationState(200,true);
        if (Gamme.Polling.anyKeys()) {
            x = 1000;
        }
    }

    public void show (PApplet p){
        animate.show(p, x, y, xSize, ySize);
    }


}
