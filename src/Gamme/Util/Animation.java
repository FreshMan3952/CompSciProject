package Gamme.Util;
import processing.core.*;
import java.io.File;
public class Animation extends PApplet  {

    PImage[] images;

    public Animation() {}

    public int animationState;

    long start;
    long finish ;
    long timeElapsed ;
    int length;
    boolean run;
    boolean showing;

    public void init (PApplet p, String name, int length) {
        init(p,name,length,false);
    }

    public void init (PApplet p, String name) {
        init(p,name,1,true);
    }

    public void init (PApplet p, String name, int length,boolean single) {
        run = false;
        this.length = length;
        images = new PImage[length];
        File file = new File("CompSciGameResource");
        String path = "C:\\Users\\haoyan\\Documents\\CompSciProject\\src\\CompSciGameResource\\0x72_DungeonTileset_v1.1_individual_sprites";
        animationState = 0;

        for (int i = 0; i < length; i ++){
            if (!single) {
                images[i] = p.loadImage(path + "\\" + name + Integer.toString(i) + ".png");
            }else images [0] = p.loadImage(path + "\\" + name);
        }
        start = System.currentTimeMillis();

    }
    public void setAnimationState(long speed, boolean running) {
        setAnimationState(speed,running,true,false);
    }

    public void setAnimationState(boolean animate) {
        showing = animate;
    }


    public void setAnimationState(long speed, boolean running, boolean interruptable, boolean single){
        showing = true;
        if (running) {
            run = true;
        }
        if (run) {
            finish = System.currentTimeMillis();
            timeElapsed = finish - start;
            if (timeElapsed > speed) {
                start = System.currentTimeMillis();
                animationState++;
            }
            // RESETING ANIMATION STATE, ONLY INTERRUPTABLE WHEN ANIMATION LOOP IS FINIHSED
            if (interruptable && !running){
                run = false;
            }
            if (animationState >= length) {
                animationState = 0;
                if (!running){
                    run = false;
                }
            }
        }
        if (single){
            animationState =0;
        }
    }

    public void show(PApplet p, double posX, double posY, int sizeY, int sizeX) {
        if (showing)
        p.image( images[animationState] , (int)posX, (int)posY,sizeY,sizeX);
    }

}
