package Gamme;

import processing.core.*;

public class Girl extends Animation {

    public Animation animate;
    public int x = 0;
    public int y = 0;
    public int xSize = 0;
    public int ySize = 0;


    public Girl (PApplet p) {
        animate = new Animation();
        animate.init(p,"girl",4);
    }

    public void update(PApplet p) {

    }

    public void show (PApplet p){
        animate.show(p,200, p.mouseX, p.mouseY, y, x);
    }


}
