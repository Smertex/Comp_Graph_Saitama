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
        Color eyeColor = new Color(254, 247, 254);
        Color tightsColor = new Color(229, 172, 189);

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
        GeneralPath сloakColor = new GeneralPath();
        g.setColor(Color.WHITE);

        сloakColor.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        сloakColor.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        сloakColor.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        сloakColor.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakColor.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakColor.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        сloakColor.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));
        сloakColor.lineTo((int)(x + 0.31 * w), (int)(y + 1.47 * h)); // для окраски
        сloakColor.lineTo((int)(x + 0.31 * w), (int)(y + 1.04 * h)); // для окраски
        g.fill(сloakColor);

        сloakColor.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        сloakColor.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        сloakColor.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        сloakColor.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        сloakColor.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        сloakColor.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        сloakColor.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        сloakColor.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        сloakColor.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        сloakColor.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        сloakColor.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));

        g.fill(сloakColor);

       //Заливка тела
       GeneralPath colorBody = new GeneralPath();
       g.setColor(tightsColor);
       colorBody.moveTo((int)(x + -0.09 * w), (int)(y + 1.48 * h));
       colorBody.curveTo((int)(x + -0.09 * w), (int)(y + 1.47 * h), (int)(x + -0.12 * w), (int)(y + 1.33 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
       colorBody.curveTo((int)(x + -0.08 * w), (int)(y + 1.18 * h), (int)(x + -0.01 * w), (int)(y + 1.17 * h), (int)(x + -0.01 * w), (int)(y + 1.18 * h));
       colorBody.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.21 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
       colorBody.curveTo((int)(x + 0.39 * w), (int)(y + 1.28 * h), (int)(x + 0.49 * w), (int)(y + 1.27 * h), (int)(x + 0.38 * w), (int)(y + 1.15 * h));
       colorBody.curveTo((int)(x + 0.52 * w), (int)(y + 1.26 * h), (int)(x + 0.74 * w), (int)(y + 1.18 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));
       colorBody.curveTo((int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));

       colorBody.curveTo((int)(x + 0.71 * w), (int)(y + 1.1 * h), (int)(x + 0.76 * w), (int)(y + 1.14 * h), (int)(x + 0.8 * w), (int)(y + 1.18 * h));
       colorBody.curveTo((int)(x + 0.9 * w), (int)(y + 1.24 * h), (int)(x + 0.92 * w), (int)(y + 1.22 * h), (int)(x + 1.02 * w), (int)(y + 1.18 * h));
       colorBody.curveTo((int)(x + 1.05 * w), (int)(y + 1.14 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));

       colorBody.curveTo((int)(x + 1.08 * w), (int)(y + 1.25 * h), (int)(x + 1.07 * w), (int)(y + 1.35 * h), (int)(x + 1.15 * w), (int)(y + 1.48 * h));
       colorBody.lineTo((int)(x + -0.09 * w), (int)(y + 1.48 * h));

       //colorBody.curveTo((int)(x + 0.9 * w), (int)(y + 1.45 * h), (int)(x + 0.9 * w), (int)(y + 1.35 * h), (int)(x + 0.94 * w), (int)(y + 1.28 * h));

       g.fill(colorBody);

       g.setColor(firstColor);

        //Обводка правой части плаща
        GeneralPath сloakStroke = new GeneralPath();
        g.setColor(firstColor);
        сloakStroke.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        сloakStroke.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        сloakStroke.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        сloakStroke.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakStroke.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        сloakStroke.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        сloakStroke.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));


        сloakStroke.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        сloakStroke.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        сloakStroke.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        сloakStroke.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        //Обводка левой части плаща
        сloakStroke.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        сloakStroke.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        сloakStroke.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        сloakStroke.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        сloakStroke.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        сloakStroke.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        сloakStroke.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));
        g.draw(сloakStroke);

        //Правая рука заливка
        GeneralPath сolorHands = new GeneralPath();
        сolorHands.moveTo((int)(x + -0.08 * w), (int)(y + 1.18 * h));
        сolorHands.curveTo((int)(x + -0.08 * w), (int)(y + 1.27 * h), (int)(x + -0.12 * w), (int)(y + 1.33 * h), (int)(x + -0.09 * w), (int)(y + 1.47 * h));
        сolorHands.lineTo((int)(x + 0.1 * w), (int)(y + 1.48 * h));
        сolorHands.curveTo((int)(x + 0.1 * w), (int)(y + 1.48 * h), (int)(x + 0.14 * w), (int)(y + 1.36 * h), (int)(x + 0.11 * w), (int)(y + 1.25 * h));

        //Левая рука заливка

        сolorHands.moveTo((int)(x + 1.047 * w), (int)(y + 1.15 * h));
        сolorHands.curveTo((int)(x + 1.08 * w), (int)(y + 1.25 * h), (int)(x + 1.07 * w), (int)(y + 1.35 * h), (int)(x + 1.15 * w), (int)(y + 1.48 * h));
        сolorHands.lineTo((int)(x + 0.9 * w), (int)(y + 1.48 * h));
        сolorHands.curveTo((int)(x + 0.9 * w), (int)(y + 1.45 * h), (int)(x + 0.9 * w), (int)(y + 1.35 * h), (int)(x + 0.94 * w), (int)(y + 1.28 * h));
        g.draw(сolorHands);


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
