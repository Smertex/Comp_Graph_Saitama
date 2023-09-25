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
        GeneralPath smallElements = new GeneralPath();
        smallElements.moveTo((int)(x + 0.63 * w), (int)(y + 0.4 * h));
        smallElements.curveTo((int)(x + 0.62 * w), (int)(y + 0.46 * h), (int)(x + 0.68 * w), (int)(y + 0.53 * h), (int)(x + 0.63 * w), (int)(y + 0.56 * h));
        g.fillOval((int)(x + 0.59 * w),(int)(y + 0.53 * h),(int)(w / 10 - 17),(int)(h / 10 - 25));

        //Рот
        smallElements.moveTo((int)(x + 0.64 * w), (int)(y + 0.67 * h));
        smallElements.lineTo((int)(x + 0.54 * w), (int)(y + 0.67 * h));

        //Шея
        smallElements.moveTo((int)(x + 0.71 * w), (int)(y + 0.96 * h));
        smallElements.lineTo((int)(x + 0.71 * w), (int)(y + 1.1 * h));

        smallElements.moveTo((int)(x + 0.31 * w), (int)(y + 0.96 * h));
        smallElements.lineTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        smallElements.curveTo((int)(x + 0.51 * w), (int)(y + 1.27 * h), (int)(x + 0.7 * w), (int)(y + 1.2 * h), (int)(x + 0.75 * w), (int)(y + 1.1 * h));
        g.draw(smallElements);

        //Заливка плаща
        GeneralPath сloakColorR = new GeneralPath();
        g.setColor(Color.WHITE);

        сloakColorR.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        сloakColorR.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        сloakColorR.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        сloakColorR.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakColorR.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakColorR.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        сloakColorR.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));
        сloakColorR.lineTo((int)(x + 0.31 * w), (int)(y + 1.47 * h)); // для окраски
        сloakColorR.lineTo((int)(x + 0.31 * w), (int)(y + 1.04 * h)); // для окраски
        g.fill(сloakColorR);

        сloakColorR.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        сloakColorR.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        сloakColorR.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        сloakColorR.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        сloakColorR.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        сloakColorR.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        сloakColorR.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        сloakColorR.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        сloakColorR.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        сloakColorR.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        сloakColorR.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));

        g.fill(сloakColorR);

        //Обводка правой части плаща
        GeneralPath сloakR = new GeneralPath();
        g.setColor(firstColor);
        сloakR.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        сloakR.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        сloakR.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        сloakR.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakR.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakR.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        сloakR.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));


        сloakR.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        сloakR.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        сloakR.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        сloakR.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        g.draw(сloakR);

        //Обводка левой части плаща
        GeneralPath сloakL = new GeneralPath();
        сloakL.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        сloakL.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        сloakL.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        сloakL.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        сloakL.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        сloakL.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        сloakL.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));
        g.draw(сloakL);

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
