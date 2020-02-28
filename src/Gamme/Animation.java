package Gamme;
import processing.core.*;
import java.io.File;
public class Animation extends PApplet  {

    PImage[] images = new PImage[4];

    public Animation() {}

    public int animationState;

    long start;
    long finish ;
    long timeElapsed ;
    int length;
    

    public void init (PApplet p, String name, int length) {
        this.length = length;
        File file = new File("CompSciGameResource");
        String path = "C:\\Users\\haoyan\\Documents\\CompSciProject\\src\\CompSciGameResource";
        animationState = 0;

        for (int i = 0; i < length; i ++){
            images[i] = p.loadImage(path+ "\\" + name + Integer.toString(i) + ".png");
        }
        start = System.currentTimeMillis();

    }

    public void setAnimationState(long speed, boolean running){
        if (running) {
            finish = System.currentTimeMillis();
            timeElapsed = finish - start;
            if (timeElapsed > speed) {
                start = System.currentTimeMillis();
                animationState++;
            }
            if (animationState >= length) {
                animationState = 0;
            }
        }
    }

    public void show(PApplet p, int posX, int posY, int sizeY, int sizeX) {

        p.image( images[animationState] , posX, posY,sizeY,sizeX);
    }

}
