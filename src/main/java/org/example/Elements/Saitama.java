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

        //голова
        g.setColor(leaterColor);
        g.fillOval(x, y, w, h);

        BasicStroke firstStroke = (BasicStroke) g.getStroke();
        g.setColor(firstColor);
        g.setStroke(new BasicStroke(2));
        g.drawOval(x, y, w, h);

        //Ухо
        g.setColor(leaterColor);
        GeneralPath generalPath = new GeneralPath();
        generalPath.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        generalPath.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        generalPath.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.fill(generalPath);

        g.setColor(firstColor);
        generalPath.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        generalPath.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        generalPath.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.draw(generalPath);

        generalPath.moveTo((int)(x + -0.02 * w), (int)(y + 0.44 * h));
        generalPath.curveTo((int)(x + -0.02 * w), (int)(y + 0.4 * h), (int)(x + 0.03 * w), (int)(y + 0.38 * h), (int)(x + 0.06 * w), (int)(y + 0.4 * h));
        generalPath.curveTo((int)(x + 0.07 * w), (int)(y + 0.42 * h), (int)(x + 0.07 * w), (int)(y + 0.45 * h), (int)(x + 0.07 * w), (int)(y + 0.51 * h));
        generalPath.lineTo((int)(x + -0.02 * w), (int)(y + 0.51 * h));
        generalPath.curveTo((int)(x + -0.02 * w), (int)(y + 0.58 * h), (int)(x + 0.03 * w), (int)(y + 0.6 * h), (int)(x + 0.06 * w), (int)(y + 0.58 * h));
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
