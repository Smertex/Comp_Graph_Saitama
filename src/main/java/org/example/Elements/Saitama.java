package org.example.Elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Saitama{
    private int x;
    private int y;
    private int w;
    private int h;
    public Saitama(int x, int y, int w, int h) {
        setX(x);
        setY(y);
        setW(w);
        setH(h);
    }
    public void drawSaitama(Graphics2D g){
        Color firstColor = g.getColor();
        Color leaterColor = new Color(254,244,255);

        g.setColor(leaterColor);
        g.fillOval(x, y, w, h);

        BasicStroke firstStroke = (BasicStroke) g.getStroke();
        g.setColor(firstColor);
        g.setStroke(new BasicStroke(2));
        g.drawOval(x, y, w, h);

        GeneralPath generalPath = new GeneralPath();
        generalPath.moveTo(x + w - (w - 25),y + h - (h - 105));
        generalPath.curveTo(x + w - (w - 15), y + h - (h - 77), x + w - (w + 10), y + h - (h - 77), x + w - (w + 15),y + h - (h - 144));
        generalPath.moveTo(x + w - (w + 15), y + h - (h - 144));
        generalPath.curveTo(x + w - (w + 15),y + h - (h - 200), x + w - (w - 10), y + h - (h - 180), x + w - (w - 3), y + h - (h - 185));

        g.draw(generalPath);

    }
    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }
    private void setW(int w){
        this.w = w;
    }
    private void setH(int h){
        this.h = h;
    }

}
