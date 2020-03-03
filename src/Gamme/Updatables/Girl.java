package Gamme.Updatables;

import Gamme.Util.Animation;
import Gamme.Util.Constants;
import Gamme.Util.Polling;
import processing.core.PApplet;

public class Girl extends Updatables {

    public Animation running;
    public Animation idle;
    public double x = 0;
    public double y = 0;
    public int xSize = 80;
    public int ySize = 100;
    public double speed = 5;
    public long animationSpeed = 100;
    public int layer;

    public Girl (PApplet p) {
        running = new Animation();
        running.init(p,"girl",4);
    }
    public Girl (PApplet p, double x, double y, int layer) {
        this.layer = layer;
        running = new Animation();
        idle = new Animation();
        idle.init(p, "knight_f_idle_anim_f",4);
        running.init(p,"knight_f_run_anim_f",4);
        this.x = x;
        this.y = y;
    }

    public int layer(){
        return layer;
    }

    public void update( PApplet p) {
        idle.setAnimationState(false);
        if (Polling.isKeyPressed("UP")){
            if (y>200) {
                y -= speed;
            }else Polling.scrollY((int)speed);
            running.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("DOWN")){
            if (y < 600) {
                y += speed;
            }else Polling.scrollY(-(int)speed);
            running.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("LEFT")){
            if (x > 600) {
                x -= speed;
            }else Polling.scrollX((int)speed);
            running.setAnimationState(animationSpeed, true);

        }else
        if (Polling.isKeyPressed("RIGHT")){
            if (x<1200) {
                x += speed;
            }else Polling.scrollX(-(int)speed);
            running.setAnimationState(animationSpeed, true);

        }else {
            running.setAnimationState(false);
            idle.setAnimationState(animationSpeed,true);
        }


        Constants.focusX = (int)x + xSize/2;
        Constants.focusY = (int)y + ySize/2;

    }

    public boolean isFinished () {
        return false;
    }

    public void show (PApplet p){
        idle.show(p,x,y,xSize,ySize);
        running.show(p, x, y, xSize, ySize);
    }


}
