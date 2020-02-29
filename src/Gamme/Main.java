package Gamme;

import processing.core.*;

public class Main extends PApplet {

    public Polling poll;
    public Schedular schedular;
    public Girl girl;

    public void settings() {
        size(1800, 900, P2D);

    }



    public void setup (){
        poll = new Polling();
        schedular = new Schedular(this);
        schedular.add(new Girl(this));
    }




    public void draw(){

        background(64);
        schedular.update(this);
        text(frameRate,50,50);
    }










    //updates pressed keys
    public void keyPressed()
    {
        poll.updatePressedKeys(this);
    }
    //updates released keys
    public void keyReleased()
    {
        poll.updateReleasedKeys(this);
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "Gamme.Main" };
        PApplet.main(appletArgs);
    }
}