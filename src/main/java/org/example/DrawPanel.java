package org.example;

import org.example.Elements.Background;
import org.example.Elements.Saitama;
import org.example.Elements.Stones;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Saitama saitama;
    private Background background;
    //private Stones st1, st2, st3;
    private int xStone = 800;

    public DrawPanel(){
        background = new Background();
        saitama = new Saitama(220,120,220,300);
        //st1 = new Stones(xStone, 100);
    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        background.drawBackground(g);
        saitama.drawSaitama(g);
        //st1.drawStones(g);
    }

}
