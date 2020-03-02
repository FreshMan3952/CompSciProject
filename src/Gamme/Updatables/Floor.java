package Gamme.Updatables;

import Gamme.Util.Polling;
import processing.core.PApplet;
import java.util.ArrayList;

public class Floor extends Updatables {
    public int offsetX;
    public int offsetY;
    public ArrayList<Tiles> tiles;
    public int length;

    public Floor(PApplet p, int[][] level) {
        tiles = new ArrayList<Tiles>();
        length = level.length * level[0].length;
        for (int i = 0; i < level.length; i ++){
            for (int j =0; j < level[i].length; j++){
                tiles.add(new Tiles(p,i,j,0));
            }
        }
    }

    public void update (PApplet p){
        for (Tiles t: tiles){
            t.tile.setAnimationState(true);
            t.x = p.width/2 - ((20 - t.id[0]) * 64) + Polling.scroll[0];
            t.y = p.height/2 - ((10 - t.id[1]) * 64) + Polling.scroll[1];
        }
    }
    public boolean isFinished (){
        return false;
    }
    public void show (PApplet p){
        for (Tiles t: tiles){
            t.tile.show(p,t.x,t.y,64,64);
        }
    }
}
