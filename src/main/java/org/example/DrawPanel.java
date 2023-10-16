package org.example;

import org.example.Elements.Background;
import org.example.Elements.Saitama;
import org.example.Elements.Wires;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Saitama saitama;
    private Background background;
    private Wires[] wires = new Wires[10];


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
    }



}
