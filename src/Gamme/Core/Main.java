package Gamme.Core;

import Gamme.Updatables.Floor;
import Gamme.Util.Constants;
import Gamme.Util.Polling;
import Gamme.Updatables.Girl;
import processing.core.PApplet;

public class Main extends PApplet {

    public Polling poll;
    public Schedular schedular;
    public Girl girl;

    public void settings() {
        size(1800, 900, P3D);
    }



    public void setup (){
        poll = new Polling();
        schedular = new Schedular(this);
        schedular.add(new Floor(this, Constants.level1));
        schedular.add(new Girl(this,width/2,height/2));
        colorMode(HSB, 100);

    }




    public void draw(){

        background(64);
        pointLight(0, 0, 200, width/2, height/2, 500);
        sphere(30);

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
        String[] appletArgs = new String[] { "Gamme.Core.Main" };
        PApplet.main(appletArgs);
    }
}