package org.example.Elements;

import java.awt.*;

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
        g.fillOval(this.x, this.y, this.w, this.h);

        BasicStroke firstStroke = (BasicStroke) g.getStroke();
        g.setColor(firstColor);
        g.setStroke(new BasicStroke(2));
        g.drawOval(this.x, this.y, this.w, this.h);
        g.setStroke(firstStroke);

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
