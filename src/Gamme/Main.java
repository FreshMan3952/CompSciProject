package Gamme;

import processing.core.*;

public class Main extends PApplet {

    public Girl girl;
    public Polling poll;

    public void settings() {
        size(1800, 900);

    }

    public void setup (){
        girl = new Girl(this);
        poll = new Polling();
    }


    public void draw(){

        background(64);
        ellipse(mouseX, mouseY, 20, 20);
        girl.update(this);
        girl.show(this);

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