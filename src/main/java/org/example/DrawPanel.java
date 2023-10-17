package org.example;

import org.example.Elements.Background;
import org.example.Elements.Saitama;
import org.example.Elements.Stones;
import org.example.Elements.Wires;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {
    private Saitama saitama;
    private Background background;
    private Wires[] wires = new Wires[10];
    private Stones stones;
    private int stoneX = 800;
    private int stoneY = 500;
    private int stoneRand = 0;
    public DrawPanel(){
        background = new Background();
        saitama = new Saitama(220,120,220,300);

        for(int i = 0, j = 600; i < 10; i++, j -= 90){
            wires[i] = new Wires(j, -123);
        }
    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        background.drawBackground(g);
        saitama.drawSaitama(g);

        wires[0].drawWires(g);

        flyStone(g);

        repaint();
    }
    private void flyStone(Graphics2D g){
        Random rand = new Random();

        stones = new Stones(stoneX, stoneY);
        stones.drawStones(g, stoneRand);

        if(stoneX != -50){
            stoneX -= 5;
        }
        else{
            stoneX = 800;
            stoneY = rand.nextInt(600);
            stoneRand = rand.nextInt(3);
        }
    }
}
