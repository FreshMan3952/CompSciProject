package Gamme;

import processing.core.*;

public class Main extends PApplet {

    public Girl girl;

    public void settings() {
        size(1800, 900);

    }

    public void setup (){
        girl = new Girl(this);
    }


    public void draw(){

        background(64);
        ellipse(mouseX, mouseY, 20, 20);
        girl.update(this);

    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "Gamme.Main" };
        PApplet.main(appletArgs);
    }
}