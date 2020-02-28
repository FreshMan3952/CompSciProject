package Gamme;
import processing.core.*;
import java.io.*;
import java.util.*;

import static processing.core.PConstants.*;


public class Polling {


    public static ArrayList<String> queue = new ArrayList<String>();
    public Polling(){};


    public void updatePressedKeys(PApplet p){
        switch(p.key)
        {
            case '\n':
                queue.add("ENTER");
                return;
            case '\r':
                queue.add("ENTER");
                return;
            case ' ':
                queue.add("SPACE");
                return;
        }
        if(p.key != CODED)
            queue.add(Character.toString(p.key));
        else
        {
            switch(p.keyCode)
            {
                case UP:
                    queue.add("UP");
                    break;
                case DOWN:
                    queue.add("DOWN");
                    break;
                case LEFT:
                    queue.add("LEFT");
                    break;
                case RIGHT:
                    queue.add("RIGHT");
                    break;
                case ALT:
                    queue.add("ALT");
                    break;
                case CONTROL:
                    queue.add("CONTROL");
                    break;
                case SHIFT:
                    queue.add("SHIFT");
                    break;
                case BACKSPACE:
                    queue.add("BACKSPACE");
                    break;
                case RETURN:
                    queue.add("ENTER");
                    break;
                case ENTER:
                    queue.add("ENTER");
                    break;
                case ESC:
                    queue.add("ESC");
                    break;
                case DELETE:
                    queue.add("DELETE");
                    break;
            }
        }
    }
    public void updateReleasedKeys(PApplet p){
        switch(p.key)
        {
            case '\n':
                queue.remove("ENTER");
                return;
            case '\r':
                queue.remove("ENTER");
                return;
            case ' ':
                queue.remove("SPACE");
                return;
        }
        if(p.key != CODED)
            queue.remove(Character.toString(p.key));
        else
        {
            switch(p.keyCode)
            {
                case UP:
                    queue.remove("UP");
                    break;
                case DOWN:
                    queue.remove("DOWN");
                    break;
                case LEFT:
                    queue.remove("LEFT");
                    break;
                case RIGHT:
                    queue.remove("RIGHT");
                    break;
                case ALT:
                    queue.remove("ALT");
                    break;
                case CONTROL:
                    queue.remove("CONTROL");
                    break;
                case SHIFT:
                    queue.remove("SHIFT");
                    break;
                case BACKSPACE:
                    queue.remove("BACKSPACE");
                    break;
                case RETURN:
                    queue.remove("ENTER");
                    break;
                case ENTER:
                    queue.remove("ENTER");
                    break;
                case ESC:
                    queue.remove("ESC");
                    break;
                case DELETE:
                    queue.remove("DELETE");
                    break;
            }
        }
    }

    public static boolean anyKeys(){
        return queue.size() > 0;
    }


}
