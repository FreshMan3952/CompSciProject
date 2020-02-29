package Gamme;

import processing.core.*;

public class Girl extends Updatables{

    public Animation girl;
    public double x = 0;
    public double y = 0;
    public int xSize = 150;
    public int ySize = 200;
    public double speed = 3;
    public long animationSpeed = 200;


    public Girl (PApplet p) {
        girl = new Animation();
        girl.init(p,"girl",4);
    }
    public Girl (PApplet p, double x, double y) {
        girl = new Animation();
        girl.init(p,"girl",4);
        this.x = x;
        this.y = y;
    }

    public void update( PApplet p) {

        if (Gamme.Polling.isKeyPressed("UP")){
            y -= speed;
            girl.setAnimationState(animationSpeed, true);
        }else
        if (Gamme.Polling.isKeyPressed("DOWN")){
            girl.setAnimationState(animationSpeed, true);
            y += speed;
        }else
        if (Gamme.Polling.isKeyPressed("LEFT")){
            girl.setAnimationState(animationSpeed, true);
            x -= speed;
        }else
        if (Gamme.Polling.isKeyPressed("RIGHT")){
            girl.setAnimationState(animationSpeed, true);
            x += speed;
        }else girl.setAnimationState(animationSpeed,false);

    }

    public boolean isFinished () {
        return x > 1000;
    }

    public void show (PApplet p){
        girl.show(p, x, y, xSize, ySize);
    }


}
