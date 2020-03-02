package Gamme.Util;
import processing.core.*;
import java.util.*;

import static processing.core.PConstants.*;


public class Polling {
    public static int[] scroll;

    public static ArrayList<String> queue;

    public Polling(){
       queue = new ArrayList<String>();
       scroll = new int[2];
    };

    public static void scrollX(int x){
        scroll[0] += x;
    }
    public static void scrollY(int y){
        scroll[1] += y;
    }

    public static boolean anyKeys(){
        return queue.size() > 0;
    }

    public static boolean isKeyPressed(char c)
    {
        return queue.contains(Character.toString(c));
    }

    public static boolean isKeyPressed(String s)
    {
        return queue.contains(s);
    }


    public void updatePressedKeys(PApplet p){
        switch(p.key)
        {
            case '\n':
                if (!queue.contains("ENTER"))
                    queue.add("ENTER");
                return;
            case '\r':
                if (!queue.contains("ENTER"))
                    queue.add("ENTER");
                return;
            case ' ':
                if (!queue.contains("SPACE"))
                    queue.add("SPACE");
                return;
        }
        if(p.key != CODED) {
            if (!queue.contains(Character.toString(p.key))) {
                queue.add(Character.toString(p.key));
            }
        }
        else
        {
            switch(p.keyCode)
            {
                case ALT:
                    if (queue.contains("ALT"))
                        queue.add("ALT");
                    break;
                case UP:
                    if (!queue.contains("UP"))
                        queue.add("UP");
                    break;
                case DOWN:
                    if (!queue.contains("DOWN"))
                        queue.add("DOWN");
                    break;
                case LEFT:
                    if (!queue.contains("LEFT"))
                        queue.add("LEFT");
                    break;
                case RIGHT:
                    if (!queue.contains("RIGHT"))
                        queue.add("RIGHT");
                    break;

                case CONTROL:
                    if (!queue.contains("CONTROL"))
                        queue.add("CONTROL");
                    break;
                case SHIFT:
                    if (!queue.contains("SHIFT"))
                        queue.add("SHIFT");
                    break;
                case BACKSPACE:
                    if (!queue.contains("BACKSPACE"))
                        queue.add("BACKSPACE");
                    break;
                case RETURN:
                    if (!queue.contains("ENTER"))
                        queue.add("ENTER");
                    break;
                case ENTER:
                    if (!queue.contains("ENTER"))
                        queue.add("ENTER");
                    break;
                case ESC:
                    if (!queue.contains("ESC"))
                        queue.add("ESC");
                    break;
                case DELETE:
                    if (!queue.contains("DELETE"))
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




}
