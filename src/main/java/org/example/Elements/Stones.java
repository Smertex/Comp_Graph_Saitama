package org.example.Elements;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Stones {

    private int x;
    private int y;

    public Stones(int x, int y) {
        setX(x);
        setY(y);
    }

    public void drawStones(Graphics2D g) {
        GeneralPath stone = new GeneralPath();
        Random rand = new Random();
        
        stone.moveTo(x,y);
        stone.lineTo(rand.nextInt(101) + 104, rand.nextInt(101) + 104);
        stone.lineTo(rand.nextInt(105) + 108, rand.nextInt(105) + 108);
        stone.lineTo(rand.nextInt(108) + 111, rand.nextInt(108) + 111);
        stone.lineTo(x, y);

        g.fill(stone);
    }

    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }

}
