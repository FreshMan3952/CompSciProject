package Gamme;
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
    

    public void init (PApplet p, String name, int length) {
        run = false;
        this.length = length;
        images = new PImage[length];
        File file = new File("CompSciGameResource");
        String path = "C:\\Users\\haoyan\\Documents\\CompSciProject\\src\\CompSciGameResource";
        animationState = 0;

        for (int i = 0; i < length; i ++){
            images[i] = p.loadImage(path+ "\\" + name + Integer.toString(i) + ".png");
        }
        start = System.currentTimeMillis();

    }
    public void setAnimationState(long speed, boolean running) {
        setAnimationState(speed,running,true);
    }


    public void setAnimationState(long speed, boolean running, boolean interruptable){
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
    }

    public void show(PApplet p, double posX, double posY, int sizeY, int sizeX) {

        p.image( images[animationState] , (int)posX, (int)posY,sizeY,sizeX);
    }

}
