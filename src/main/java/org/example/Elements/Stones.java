package org.example.Elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Stones {
    private int x;
    private int y;
    public Stones(int x, int y) {
        setX(x);
        setY(y);
    }

    public void drawStones(Graphics2D g, int check) {
        if(check == 0){
            stone1(g);
        }
        else if(check == 1){
            stone2(g);
        }
        else if(check == 2){
            stone3(g);
        }
    }

    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }

    private void stone1(Graphics2D g){
        g.setColor(Color.BLUE);
        GeneralPath stone = new GeneralPath();
        stone.moveTo(x,y);
        stone.lineTo(x + 50, y + 50);
        stone.lineTo(x + 60, y - 10);
        stone.lineTo(x + 30, y - 10);
        stone.lineTo(x,y);
        g.fill(stone);
    }
    private void stone2(Graphics2D g){
        g.setColor(Color.BLUE);
        GeneralPath stone = new GeneralPath();
        stone.moveTo(x,y);
        stone.lineTo(x + 30, y + 40);
        stone.lineTo(x + 60, y - 10);
        stone.lineTo(x + 30, y - 10);
        stone.lineTo(x,y);
        g.fill(stone);
    }

    private void stone3(Graphics2D g){
        g.setColor(Color.BLUE);
        GeneralPath stone = new GeneralPath();
        stone.moveTo(x,y);
        stone.lineTo(x + 70, y + 40);
        stone.lineTo(x + 60, y);
        stone.lineTo(x + 30, y - 10);
        stone.lineTo(x,y);
        g.fill(stone);
    }


}
