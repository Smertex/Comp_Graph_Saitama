package org.example.Elements;

import javax.swing.*;
import java.awt.*;

public class Saitama{
    public Saitama(Graphics g, int x, int y) {

        drawSaitama(g, x, y);

    }
    private static void drawSaitama(Graphics g, int x, int y){
        Color firstColor = g.getColor();
        Color leaterColor = new Color(254,244,255);

        g.setColor(leaterColor);
        g.fillOval(x, y,200,300);


    }
}
