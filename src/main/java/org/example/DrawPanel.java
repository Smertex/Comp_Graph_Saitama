package org.example;

import org.example.Elements.Background;
import org.example.Elements.Saitama;
import org.example.Elements.Wires;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Saitama saitama;
    private Background background;
    private Wires wires;

    public DrawPanel(){
        background = new Background();
        saitama = new Saitama(220,120,220,300);

        wires = new Wires(600, -123);
    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        background.drawBackground(g);
        saitama.drawSaitama(g);
        wires.drawWires(g);
    }



}
