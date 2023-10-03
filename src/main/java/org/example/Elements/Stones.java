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
        Random rand = new Random();

        g.fillRect(x, y, rand.nextInt(100) + 1, rand.nextInt(100) + 1);

    }

    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }

}
