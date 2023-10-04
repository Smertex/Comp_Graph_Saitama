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
        BasicStroke firstStroke = (BasicStroke) g.getStroke();
        g.setStroke(new BasicStroke(2));

        Color firstColor = g.getColor();
        Color leaterColor = new Color(254,244,255);
        Color eyeColor = new Color(254, 247, 254);
        Color tightsColor = new Color(229, 172, 189);
        Color button = new Color(134, 138, 209);

        //голова
        g.setColor(leaterColor);
        g.fillOval(x, y, w, h);

        //Шея
        GeneralPath neck = new GeneralPath();
        neck.moveTo((int)(x + 0.71 * w), (int)(y + 1.1 * h));
        neck.lineTo((int)(x + 0.71 * w), (int)(y + 0.96 * h));
        neck.lineTo((int)(x + 0.31 * w), (int)(y + 0.96 * h));
        neck.lineTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        neck.curveTo((int)(x + 0.42 * w), (int)(y + 1.24 * h), (int)(x + 0.42 * w), (int)(y + 1.19 * h), (int)(x + 0.38 * w), (int)(y + 1.15 * h));
        neck.curveTo((int)(x + 0.51 * w), (int)(y + 1.27 * h), (int)(x + 0.7 * w), (int)(y + 1.2 * h), (int)(x + 0.75 * w), (int)(y + 1.1 * h));;
        g.fill(neck);

        g.setColor(firstColor);
        g.drawOval(x, y, w, h);

        //Ухо
        GeneralPath ear = new GeneralPath();
        g.setColor(leaterColor);
        ear.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        ear.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        ear.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.fill(ear);

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
        g.fillOval((int)(x + 0.82 * w),(int)(y + 0.35 * h), (int)(w / 10 - 17),(int)(h / 10 - 25));
        g.fillOval((int)(x + 0.42 * w),(int)(y + 0.35 * h),(int)(w / 10 - 17),(int)(h / 10 - 25));

        //Заливка плаща
        GeneralPath cloakColor = new GeneralPath();
        g.setColor(Color.WHITE);

        cloakColor.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        cloakColor.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        cloakColor.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        cloakColor.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        cloakColor.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        cloakColor.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        cloakColor.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));
        cloakColor.lineTo((int)(x + 0.31 * w), (int)(y + 1.47 * h)); // для окраски
        cloakColor.lineTo((int)(x + 0.31 * w), (int)(y + 1.04 * h)); // для окраски
        g.fill(cloakColor);

        cloakColor.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        cloakColor.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        cloakColor.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        cloakColor.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        cloakColor.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        cloakColor.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        cloakColor.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        cloakColor.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        cloakColor.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        cloakColor.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        cloakColor.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));
        g.fill(cloakColor);

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

       g.fill(colorBody);

        //Заливка воротника
        GeneralPath collar = new GeneralPath();
        g.setColor(Color.WHITE);
        collar.moveTo((int)(x + 0.42 * w), (int)(y + 1.24 * h));
        collar.curveTo((int)(x + 0.44 * w), (int)(y + 1.26 * h),(int)(x + 0.47 * w), (int)(y + 1.27 * h), (int)(x + 0.53 * w), (int)(y + 1.27 * h));
        collar.lineTo((int)(x + 0.53 * w), (int)(y + 1.48 * h));
        collar.lineTo((int)(x + 0.69 * w), (int)(y + 1.48 * h));
        collar.lineTo((int)(x + 0.69 * w), (int)(y + 1.27 * h));
        collar.curveTo((int)(x + 0.8 * w), (int)(y + 1.24 * h), (int)(x + 0.8 * w), (int)(y + 1.2 * h), (int)(x + 0.81 * w), (int)(y + 1.19 * h));
        collar.curveTo((int)(x + 0.8 * w), (int)(y + 1.17 * h), (int)(x + 0.77 * w), (int)(y + 1.17 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));
        collar.curveTo((int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));
        collar.curveTo((int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.62 * w), (int)(y + 1.28 * h), (int)(x + 0.38 * w), (int)(y + 1.15 * h));
        collar.curveTo((int)(x + 0.38 * w), (int)(y + 1.15 * h), (int)(x + 0.42 * w), (int)(y + 1.19 * h), (int)(x + 0.42 * w), (int)(y + 1.24 * h));
        g.fill(collar);

        //Заливка пуговиц на плаще
        g.setColor(button);

        g.fillOval((int)(x + 0.82 * w),(int)(y + 1.1 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));
        g.fillOval((int)(x + 0.22 * w),(int)(y + 1.17 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));

        //Застежка
        GeneralPath claps = new GeneralPath();

        g.fillOval((int)(x + 0.54 * w),(int)(y + 1.2 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));

        g.setColor(firstColor);

        g.drawOval((int)(x + 0.54 * w),(int)(y + 1.2 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));

        claps.moveTo((int)(x + 0.56 * w),(int)(y + 1.24 * h));
        claps.curveTo((int)(x + 0.55 * w),(int)(y + 1.24 * h), (int)(x + 0.55 * w),(int)(y + 1.26 * h), (int)(x + 0.55 * w),(int)(y + 1.28 * h));
        claps.curveTo((int)(x + 0.53 * w),(int)(y + 1.29 * h), (int)(x + 0.55 * w),(int)(y + 1.33 * h), (int)(x + 0.58 * w),(int)(y + 1.33 * h));
        claps.curveTo((int)(x + 0.6 * w),(int)(y + 1.33 * h), (int)(x + 0.64 * w),(int)(y + 1.33 * h), (int)(x + 0.63 * w),(int)(y + 1.29 * h));
        claps.curveTo((int)(x + 0.62 * w),(int)(y + 1.29 * h), (int)(x + 0.66 * w),(int)(y + 1.25 * h), (int)(x + 0.63 * w),(int)(y + 1.24 * h));

        g.setColor(button);

        g.fill(claps);

        //Молния застежки
        GeneralPath zipper = new GeneralPath();

        zipper.moveTo((int)(x + 0.58 * w),(int)(y + 1.33 * h));
        zipper.lineTo((int)(x + 0.58 * w),(int)(y + 1.48 * h));
        zipper.lineTo((int)(x + 0.62 * w),(int)(y + 1.48 * h));
        zipper.lineTo((int)(x + 0.62 * w),(int)(y + 1.33 * h));

        g.fill(zipper);

        //ОБВОДКА
        GeneralPath stroke = new GeneralPath();
        g.setColor(firstColor);

        //Обводка уха
        stroke.moveTo((int)(x + 0.13 * w), (int)(y + 0.4 * h));
        stroke.curveTo((int)(x + 0.1 * w), (int)(y + 0.25 * h), (int)(x + -0.1 * w), (int)(y + 0.35 * h), (int)(x + -0.09 * w), (int)(y + 0.45 * h));
        stroke.curveTo((int)(x + -0.1 * w), (int)(y + 0.55 * h), (int)(x + -0.09 * w), (int)(y + 0.65 * h), (int)(x + 0.03 * w), (int)(y + 0.65 * h));
        g.draw(stroke);

        stroke.moveTo((int)(x + -0.02 * w), (int)(y + 0.44 * h));
        stroke.curveTo((int)(x + -0.02 * w), (int)(y + 0.4 * h), (int)(x + 0.03 * w), (int)(y + 0.38 * h), (int)(x + 0.06 * w), (int)(y + 0.4 * h));
        stroke.curveTo((int)(x + 0.07 * w), (int)(y + 0.42 * h), (int)(x + 0.07 * w), (int)(y + 0.45 * h), (int)(x + 0.07 * w), (int)(y + 0.51 * h));
        stroke.lineTo((int)(x + -0.02 * w), (int)(y + 0.51 * h));
        stroke.curveTo((int)(x + -0.02 * w), (int)(y + 0.58 * h), (int)(x + 0.03 * w), (int)(y + 0.6 * h), (int)(x + 0.06 * w), (int)(y + 0.58 * h));
        g.draw(stroke);

        //Обводка правой части плаща
        stroke.moveTo((int)(x + 0.31 * w), (int)(y + 1.04 * h));
        stroke.curveTo((int)(x + 0.23 * w), (int)(y + 1.05 * h), (int)(x + 0.24 * w), (int)(y + 1.06 * h), (int)(x + 0.24 * w), (int)(y + 1.09 * h));
        stroke.curveTo((int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.15 * w), (int)(y + 1.09 * h), (int)(x + 0.12 * w), (int)(y + 1.13 * h));
        stroke.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        stroke.curveTo((int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.04 * w), (int)(y + 1.13 * h), (int)(x + 0.01 * w), (int)(y + 1.15 * h));
        stroke.curveTo((int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.05 * w), (int)(y + 1.15 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));
        stroke.lineTo((int)(x + -0.3 * w), (int)(y + 1.47 * h));

        stroke.moveTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));
        stroke.curveTo((int)(x + 0.41 * w), (int)(y + 1.15 * h), (int)(x + 0.45 * w), (int)(y + 1.24 * h), (int)(x + 0.39 * w), (int)(y + 1.27 * h));
        stroke.curveTo((int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h), (int)(x + 0.19 * w), (int)(y + 1.29 * h));
        stroke.curveTo((int)(x + -0.05 * w), (int)(y + 1.16 * h), (int)(x + -0.01 * w), (int)(y + 1.16 * h), (int)(x + -0.08 * w), (int)(y + 1.18 * h));

        //Обводка левой части плаща
        stroke.moveTo((int)(x + 0.71 * w), (int)(y + 1.01 * h));
        stroke.curveTo((int)(x + 0.79 * w), (int)(y + 1.01 * h), (int)(x + 0.79 * w), (int)(y + 1.04 * h), (int)(x + 0.81 * w), (int)(y + 1.04 * h));
        stroke.curveTo((int)(x + 0.84 * w), (int)(y + 1.02 * h), (int)(x + 0.86 * w), (int)(y + 1.02 * h), (int)(x + 0.9 * w), (int)(y + 1.05 * h));
        stroke.curveTo((int)(x + 0.95 * w), (int)(y + 1.05 * h), (int)(x + 0.96 * w), (int)(y + 1.08 * h), (int)(x + 0.98 * w), (int)(y + 1.09 * h));
        stroke.curveTo((int)(x + 1.03 * w), (int)(y + 1.09 * h), (int)(x + 1.04 * w), (int)(y + 1.1 * h), (int)(x + 1.05 * w), (int)(y + 1.14 * h));
        stroke.curveTo((int)(x + 1.02 * w), (int)(y + 1.21 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h), (int)(x + 0.9 * w), (int)(y + 1.22 * h));
        stroke.curveTo((int)(x + 0.8 * w), (int)(y + 1.19 * h), (int)(x + 0.76 * w), (int)(y + 1.16 * h), (int)(x + 0.71 * w), (int)(y + 1.08 * h));

        //Правая рука обводка
        stroke.moveTo((int)(x + -0.08 * w), (int)(y + 1.18 * h));
        stroke.curveTo((int)(x + -0.08 * w), (int)(y + 1.27 * h), (int)(x + -0.12 * w), (int)(y + 1.33 * h), (int)(x + -0.09 * w), (int)(y + 1.47 * h));
        stroke.lineTo((int)(x + 0.1 * w), (int)(y + 1.48 * h));
        stroke.curveTo((int)(x + 0.1 * w), (int)(y + 1.48 * h), (int)(x + 0.14 * w), (int)(y + 1.36 * h), (int)(x + 0.11 * w), (int)(y + 1.25 * h));

        //Левая рука обводка
        stroke.moveTo((int)(x + 1.047 * w), (int)(y + 1.15 * h));
        stroke.curveTo((int)(x + 1.08 * w), (int)(y + 1.25 * h), (int)(x + 1.07 * w), (int)(y + 1.35 * h), (int)(x + 1.15 * w), (int)(y + 1.48 * h));
        stroke.lineTo((int)(x + 0.9 * w), (int)(y + 1.48 * h));
        stroke.curveTo((int)(x + 0.9 * w), (int)(y + 1.45 * h), (int)(x + 0.9 * w), (int)(y + 1.35 * h), (int)(x + 0.94 * w), (int)(y + 1.28 * h));

        //Обводка воротника
        stroke.moveTo((int)(x + 0.42 * w), (int)(y + 1.24 * h));
        stroke.curveTo((int)(x + 0.44 * w), (int)(y + 1.26 * h),(int)(x + 0.47 * w), (int)(y + 1.27 * h), (int)(x + 0.53 * w), (int)(y + 1.27 * h));
        stroke.lineTo((int)(x + 0.53 * w), (int)(y + 1.48 * h));
        stroke.lineTo((int)(x + 0.69 * w), (int)(y + 1.48 * h));
        stroke.lineTo((int)(x + 0.69 * w), (int)(y + 1.27 * h));
        stroke.curveTo((int)(x + 0.8 * w), (int)(y + 1.24 * h), (int)(x + 0.8 * w), (int)(y + 1.2 * h), (int)(x + 0.81 * w), (int)(y + 1.19 * h));
        stroke.curveTo((int)(x + 0.8 * w), (int)(y + 1.17 * h), (int)(x + 0.77 * w), (int)(y + 1.17 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));
        stroke.curveTo((int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.74 * w), (int)(y + 1.12 * h));
        stroke.curveTo((int)(x + 0.74 * w), (int)(y + 1.12 * h), (int)(x + 0.62 * w), (int)(y + 1.28 * h), (int)(x + 0.38 * w), (int)(y + 1.15 * h));
        stroke.curveTo((int)(x + 0.38 * w), (int)(y + 1.15 * h), (int)(x + 0.42 * w), (int)(y + 1.19 * h), (int)(x + 0.42 * w), (int)(y + 1.24 * h));

        //Обводка пуговиц
        g.drawOval((int)(x + 0.82 * w),(int)(y + 1.1 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));
        g.drawOval((int)(x + 0.22 * w),(int)(y + 1.17 * h), (int)(w / 5 - 17),(int)(h / 6 - 25));

        //Складки на одежде
        stroke.moveTo((int)(x + 0.24 * w), (int)(y + 1.09 * h));
        stroke.curveTo((int)(x + 0.32 * w), (int)(y + 1.18 * h), (int)(x + 0.32 * w), (int)(y + 1.18 * h), (int)(x + 0.32 * w), (int)(y + 1.18 * h));

        stroke.moveTo((int)(x + 0.26 * w),(int)(y + 1.17 * h));
        stroke.lineTo((int)(x + 0.24 * w),(int)(y + 1.15 * h));

        stroke.moveTo((int)(x + 0.18 * w),(int)(y + 1.14 * h));
        stroke.lineTo((int)(x + 0.24 * w),(int)(y + 1.18 * h));

        stroke.moveTo((int)(x + 0.22 * w),(int)(y + 1.21 * h));
        stroke.lineTo((int)(x + 0.01 * w),(int)(y + 1.15 * h));

        stroke.moveTo((int)(x + 0.81 * w),(int)(y + 1.04 * h));
        stroke.curveTo((int)(x + 0.86 * w),(int)(y + 1.06 * h), (int)(x + 0.86 * w),(int)(y + 1.08 * h), (int)(x + 0.85 * w),(int)(y + 1.1 * h));

        stroke.moveTo((int)(x + 0.9 * w), (int)(y + 1.05 * h));
        stroke.curveTo((int)(x + 0.9 * w), (int)(y + 1.07 * h), (int)(x + 0.91 * w), (int)(y + 1.07 * h), (int)(x + 0.9 * w), (int)(y + 1.1 * h));

        stroke.moveTo((int)(x + 0.95 * w), (int)(y + 1.07 * h));
        stroke.lineTo((int)(x + 0.96 * w), (int)(y + 1.11 * h));

        stroke.moveTo((int)(x + 0.94 * w), (int)(y + 1.16 * h));
        stroke.lineTo((x + w), (int)(y + 1.12 * h));

        stroke.moveTo((int)(x + 0.91 * w), (int)(y + 1.38 * h));
        stroke.curveTo((int)(x + 0.95 * w), (int)(y + 1.33 * h), (int)(x + 0.94 * w), (int)(y + 1.31 * h), (int)(x + 0.99 * w), (int)(y + 1.29 * h));

        //Обводка глаз + брови
        stroke.moveTo((int)(x + 0.53 * w), (int)(y + 0.34 * h));
        stroke.curveTo((int)(x + 0.52 * w), (int)(y + 0.37 * h), (int)(x + 0.5 * w), (int)(y + 0.42 * h), (int)(x + 0.4 * w), (int)(y + 0.42 * h));
        stroke.curveTo((int)(x + 0.35 * w), (int)(y + 0.42 * h), (int)(x + 0.29 * w), (int)(y + 0.42 * h), (int)(x + 0.28 * w), (int)(y + 0.34 * h));
        stroke.curveTo((int)(x + 0.31 * w), (int)(y + 0.33 * h), (int)(x + 0.53 * w), (int)(y + 0.32 * h), (int)(x + 0.53 * w), (int)(y + 0.34 * h));

        stroke.moveTo((int)(x + 0.93 * w), (int)(y + 0.34 * h));
        stroke.curveTo((int)(x + 0.92 * w), (int)(y + 0.37 * h), (int)(x + 0.9 * w), (int)(y + 0.42 * h), (int)(x + 0.8 * w), (int)(y + 0.42 * h));
        stroke.curveTo((int)(x + 0.75 * w), (int)(y + 0.42 * h), (int)(x + 0.69 * w), (int)(y + 0.42 * h), (int)(x + 0.68 * w), (int)(y + 0.34 * h));
        stroke.curveTo((int)(x + 0.71 * w), (int)(y + 0.33 * h), (int)(x + 0.93 * w), (int)(y + 0.32 * h), (int)(x + 0.93 * w), (int)(y + 0.34 * h));

        stroke.moveTo((int)(x + 0.52 * w), (int)(y + 0.3 * h));
        stroke.lineTo((int)(x + 0.29 * w), (int)(y + 0.31 * h));

        stroke.moveTo((int)(x + 0.91 * w), (int)(y + 0.31 * h));
        stroke.lineTo((int)(x + 0.7 * w), (int)(y + 0.31 * h));
        g.draw(stroke);

        //Нос
        stroke.moveTo((int)(x + 0.63 * w), (int)(y + 0.4 * h));
        stroke.curveTo((int)(x + 0.62 * w), (int)(y + 0.46 * h), (int)(x + 0.68 * w), (int)(y + 0.53 * h), (int)(x + 0.63 * w), (int)(y + 0.56 * h));
        g.fillOval((int)(x + 0.59 * w),(int)(y + 0.53 * h),(int)(w / 10 - 17),(int)(h / 10 - 25));

        //Рот
        stroke.moveTo((int)(x + 0.64 * w), (int)(y + 0.67 * h));
        stroke.lineTo((int)(x + 0.54 * w), (int)(y + 0.67 * h));

        //Шея
        stroke.moveTo((int)(x + 0.71 * w), (int)(y + 0.96 * h));
        stroke.lineTo((int)(x + 0.71 * w), (int)(y + 1.1 * h));
        stroke.moveTo((int)(x + 0.31 * w), (int)(y + 0.96 * h));
        stroke.lineTo((int)(x + 0.31 * w), (int)(y + 1.1 * h));

        //Элементы застежки

        stroke.moveTo((int)(x + 0.56 * w),(int)(y + 1.24 * h));
        stroke.curveTo((int)(x + 0.55 * w),(int)(y + 1.24 * h), (int)(x + 0.55 * w),(int)(y + 1.26 * h), (int)(x + 0.55 * w),(int)(y + 1.28 * h));
        stroke.curveTo((int)(x + 0.53 * w),(int)(y + 1.29 * h), (int)(x + 0.55 * w),(int)(y + 1.33 * h), (int)(x + 0.58 * w),(int)(y + 1.33 * h));
        stroke.curveTo((int)(x + 0.6 * w),(int)(y + 1.33 * h), (int)(x + 0.64 * w),(int)(y + 1.33 * h), (int)(x + 0.63 * w),(int)(y + 1.29 * h));
        stroke.curveTo((int)(x + 0.62 * w),(int)(y + 1.29 * h), (int)(x + 0.66 * w),(int)(y + 1.25 * h), (int)(x + 0.63 * w),(int)(y + 1.24 * h));

        g.drawOval((int)(x + 0.565 * w),(int)(y + 1.22 * h), (int)(w / 7 - 17),(int)(h / 8 - 25));
        g.fillOval((int)(x + 0.57 * w),(int)(y + 1.28 * h), (int)(w / 9 - 17),(int)(h / 9 - 25));

        //Молния застежки

        stroke.moveTo((int)(x + 0.58 * w),(int)(y + 1.33 * h));
        stroke.lineTo((int)(x + 0.58 * w),(int)(y + 1.48 * h));
        stroke.lineTo((int)(x + 0.62 * w),(int)(y + 1.48 * h));
        stroke.lineTo((int)(x + 0.62 * w),(int)(y + 1.33 * h));

        for(double i = 1.33; i < 1.48; i += 0.02){
            stroke.moveTo((int)(x + 0.58 * w),(int)(y + i * h));
            stroke.lineTo((int)(x + 0.62 * w),(int)(y + i * h));
        }

        g.draw(stroke);
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
