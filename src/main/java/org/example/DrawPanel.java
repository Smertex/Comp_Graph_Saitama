package org.example;

import org.example.Elements.Background;
import org.example.Elements.Saitama;
import org.example.Elements.Stones;
import org.example.Elements.Wires;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final Saitama saitama;
    private final Background background;
    private final Wires[] wires = new Wires[10];
    private final Stones stones;
    public DrawPanel(){
        background = new Background();
        saitama = new Saitama(220,120,220,300);

        for(int i = 0, j = 600; i < 10; i++, j -= 90){
            wires[i] = new Wires(j, -123);
        }
        stones = new Stones(800, 500);
    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        background.drawBackground(g);
        saitama.drawSaitama(g);

        wires[0].drawWires(g);

        stones.drawStones(g);

        repaint();
    }
}
