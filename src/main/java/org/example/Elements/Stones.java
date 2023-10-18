package org.example.Elements;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Stones {
    private int x;
    private int y;
    private int swapStone;
    public Stones(int x, int y) {
        setX(x);
        setY(y);
    }

    public void drawStones(Graphics2D g) {
        flyStone();
        if(this.swapStone == 0){
            stone1(g);
        }
        else if(this.swapStone == 1){
            stone2(g);
        }
        else if(this.swapStone == 2){
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
    private void flyStone(){
        Random rand = new Random();
        if(this.x != -50){
            this.x -= 5;
        }
        else{
            this.x = 800;
            this.y = rand.nextInt(600);
            this.swapStone = rand.nextInt(3);
        }
    }


}
