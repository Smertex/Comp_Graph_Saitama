package org.example;

import org.example.Elements.Saitama;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel(){

    }
    @Override
    public void paint(Graphics gr){
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Saitama saitama = new Saitama(gr,220,120);

    }
}