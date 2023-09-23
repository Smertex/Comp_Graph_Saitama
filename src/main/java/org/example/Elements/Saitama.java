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
        GeneralPath ear = new GeneralPath();
        g.setColor(leaterColor);
        ear.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        ear.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        ear.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.fill(ear);

        g.setColor(firstColor);
        ear.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        ear.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        ear.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.draw(ear);

        ear.moveTo((int)(x + -0.02 * w), (int)(y + 0.44 * h));
        ear.curveTo((int)(x + -0.02 * w), (int)(y + 0.4 * h), (int)(x + 0.03 * w), (int)(y + 0.38 * h), (int)(x + 0.06 * w), (int)(y + 0.4 * h));
        ear.curveTo((int)(x + 0.07 * w), (int)(y + 0.42 * h), (int)(x + 0.07 * w), (int)(y + 0.45 * h), (int)(x + 0.07 * w), (int)(y + 0.51 * h));
        ear.lineTo((int)(x + -0.02 * w), (int)(y + 0.51 * h));
        ear.curveTo((int)(x + -0.02 * w), (int)(y + 0.58 * h), (int)(x + 0.03 * w), (int)(y + 0.6 * h), (int)(x + 0.06 * w), (int)(y + 0.58 * h));
        g.draw(ear);

        //Глаза
        GeneralPath eye = new GeneralPath();
        Color eyeColor = new Color(254, 247, 254);
        
        g.setColor(eyeColor);
        eye.moveTo((int)(x + 0.53 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.52 * w), (int)(y + 0.37 * h), (int)(x + 0.5 * w), (int)(y + 0.42 * h), (int)(x + 0.4 * w), (int)(y + 0.42 * h));
        eye.curveTo((int)(x + 0.35 * w), (int)(y + 0.42 * h), (int)(x + 0.29 * w), (int)(y + 0.42 * h), (int)(x + 0.28 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.31 * w), (int)(y + 0.33 * h), (int)(x + 0.53 * w), (int)(y + 0.32 * h), (int)(x + 0.53 * w), (int)(y + 0.34 * h));

        eye.moveTo((int)(x + 0.93 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.92 * w), (int)(y + 0.37 * h), (int)(x + 0.9 * w), (int)(y + 0.42 * h), (int)(x + 0.8 * w), (int)(y + 0.42 * h));
        eye.curveTo((int)(x + 0.75 * w), (int)(y + 0.42 * h), (int)(x + 0.69 * w), (int)(y + 0.42 * h), (int)(x + 0.68 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.71 * w), (int)(y + 0.33 * h), (int)(x + 0.93 * w), (int)(y + 0.32 * h), (int)(x + 0.93 * w), (int)(y + 0.34 * h));
        g.fill(eye);
        
        g.setColor(firstColor);
        eye.moveTo((int)(x + 0.53 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.52 * w), (int)(y + 0.37 * h), (int)(x + 0.5 * w), (int)(y + 0.42 * h), (int)(x + 0.4 * w), (int)(y + 0.42 * h));
        eye.curveTo((int)(x + 0.35 * w), (int)(y + 0.42 * h), (int)(x + 0.29 * w), (int)(y + 0.42 * h), (int)(x + 0.28 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.31 * w), (int)(y + 0.33 * h), (int)(x + 0.53 * w), (int)(y + 0.32 * h), (int)(x + 0.53 * w), (int)(y + 0.34 * h));

        eye.moveTo((int)(x + 0.93 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.92 * w), (int)(y + 0.37 * h), (int)(x + 0.9 * w), (int)(y + 0.42 * h), (int)(x + 0.8 * w), (int)(y + 0.42 * h));
        eye.curveTo((int)(x + 0.75 * w), (int)(y + 0.42 * h), (int)(x + 0.69 * w), (int)(y + 0.42 * h), (int)(x + 0.68 * w), (int)(y + 0.34 * h));
        eye.curveTo((int)(x + 0.71 * w), (int)(y + 0.33 * h), (int)(x + 0.93 * w), (int)(y + 0.32 * h), (int)(x + 0.93 * w), (int)(y + 0.34 * h));

        g.fillOval((int)(x + 0.82 * w),(int)(y + 0.35 * h), (int)(w / 10 - 17),(int)(h / 10 - 25));
        g.fillOval((int)(x + 0.42 * w),(int)(y + 0.35 * h),(int)(w / 10 - 17),(int)(h / 10 - 25));

        //Брови
        eye.moveTo((int)(x + 0.52 * w), (int)(y + 0.3 * h));
        eye.lineTo((int)(x + 0.29 * w), (int)(y + 0.31 * h));

        eye.moveTo((int)(x + 0.91 * w), (int)(y + 0.31 * h));
        eye.lineTo((int)(x + 0.7 * w), (int)(y + 0.31 * h));
        g.draw(eye);

        //Нос
        GeneralPath noseAndMouth = new GeneralPath();
        noseAndMouth.moveTo((int)(x + 0.63 * w), (int)(y + 0.4 * h));
        noseAndMouth.curveTo((int)(x + 0.62 * w), (int)(y + 0.46 * h), (int)(x + 0.68 * w), (int)(y + 0.53 * h), (int)(x + 0.63 * w), (int)(y + 0.56 * h));
        g.fillOval((int)(x + 0.59 * w),(int)(y + 0.53 * h),(int)(w / 10 - 17),(int)(h / 10 - 25));

        //Рот
        noseAndMouth.moveTo((int)(x + 0.64 * w), (int)(y + 0.67 * h));
        noseAndMouth.lineTo((int)(x + 0.54 * w), (int)(y + 0.67 * h));
        g.draw(noseAndMouth);

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
