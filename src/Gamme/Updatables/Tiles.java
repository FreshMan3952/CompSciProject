package Gamme.Updatables;

import Gamme.Util.Animation;
import processing.core.PApplet;

public class Tiles{
    public int[] id;
    //note tag values are as follows
    //1 = passable
    //2 = blocking
    public Animation tile;
    public int x;
    public int y;
    public Tiles(PApplet p, int x, int y, int tag) {
        id = new int[3];
        tile = new Animation();
        tile.init(p,"floor_1.png");
        id[0] = x;
        id[1] = y;
        id[2] = tag;
    };
}
