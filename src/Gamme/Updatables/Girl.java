package Gamme.Updatables;

import Gamme.Util.Animation;
import Gamme.Util.Polling;
import processing.core.*;

public class Girl extends Updatables {

    public Animation girl;
    public double x = 0;
    public double y = 0;
    public int xSize = 60;
    public int ySize = 80;
    public double speed = 5;
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

        if (Polling.isKeyPressed("UP")){
            if (y>200) {
                y -= speed;
            }else Polling.scrollY((int)speed);
            girl.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("DOWN")){
            if (y < 600) {
                y += speed;
            }else Polling.scrollY(-(int)speed);
            girl.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("LEFT")){
            if (x > 600) {
                x -= speed;
            }else Polling.scrollX((int)speed);
            girl.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("RIGHT")){
            if (x<1200) {
                x += speed;
            }else Polling.scrollX(-(int)speed);
            girl.setAnimationState(animationSpeed, true);

        }else girl.setAnimationState(animationSpeed,false);

    }

    public boolean isFinished () {
        return false;
    }

    public void show (PApplet p){
        girl.show(p, x, y, xSize, ySize);
    }


}
