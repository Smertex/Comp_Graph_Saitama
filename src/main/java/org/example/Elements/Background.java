package org.example.Elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Background {

    public void drawBackground(Graphics2D g){
        BasicStroke firstStroke = (BasicStroke) g.getStroke();
        Color firstColor = g.getColor();
        Font firstFont = g.getFont();

        //Стена и Пол
        g.setColor(new Color(40, 84, 157));
        g.fillRect(0,0,800,420);
        g.setColor(new Color(23, 32, 107));
        g.fillRect(0,440,800,600);
        g.setColor(new Color(16, 15, 57));
        g.fillRect(0,420,800,20);

        for(int i = 0, j = 40; i < 4; i++, j += 200){
            g.drawLine(j, 440, j, 600);
        }

        //Дверь
        g.setColor(new Color(31, 27, 77));
        GeneralPath door = new GeneralPath();
        door.moveTo(270,420);
        door.lineTo(270,330);
        door.lineTo(250,310);
        door.lineTo(250,220);
        door.lineTo(270,200);
        door.lineTo(270,150);
        door.curveTo(270,140,280,130,290,130);
        door.lineTo(460,130);
        door.curveTo(470,135,475,145,475,150);
        door.lineTo(475,420);
        door.lineTo(270,420);
        g.fill(door);

        g.setStroke(new BasicStroke(2));
        g.setColor(new Color(35, 56, 113));
        g.drawRect(290, 158, 165,260);
        g.setStroke(new BasicStroke(3));

        g.setColor(new Color(30, 44, 110));
        g.drawLine(350,415, 350,350);
        g.drawLine(350,350, 390,310);
        g.drawLine(390,310, 390,160);

        g.setStroke(firstStroke);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas", Font.PLAIN, 20));
        g.drawString("Zone 51", 305,190);

        //Окно
        g.setColor(new Color(62, 101, 170));
        g.fillArc(-200,100, 400,220, -90,180);
        g.fillArc(600,100, 400,220, 90,180);

        g.setColor(new Color(34, 62, 127));
        g.setStroke(new BasicStroke(4));
        g.drawArc(-200,100, 400,220, -90,180);
        g.drawArc(600,100, 400,220, 90,180);

        g.setStroke(firstStroke);

        //Элементы стены
        g.setColor(new Color(177, 247, 255));
        g.drawLine(0,50,130,50);
        g.drawLine(130,50,170,80);
        g.drawLine(170,80,230,80);
        g.drawLine(230,80,230,150);
        g.drawOval(226,150,8,8);

        g.drawLine(0,370,130,370);
        g.drawLine(130,370,140,345);
        g.drawLine(140,345,200,345);
        g.drawLine(200,345,200,280);
        g.drawOval(196,272,8,8);

        g.drawLine(269,380,230,380);
        g.drawOval(222,376,8,8);

        g.drawLine(800,50,670,50);
        g.drawLine(670,50,630,80);
        g.drawLine(630,80,570,80);
        g.drawLine(570,80,570,150);
        g.drawOval(566,150,8,8);

        g.drawLine(800,370,670,370);
        g.drawLine(670,370,660,345);
        g.drawLine(660,345,600,345);
        g.drawLine(600,345,600,280);
        g.drawOval(596,272,8,8);

        g.drawLine(475,380,514,380);
        g.drawOval(514,376,8,8);

        g.drawLine(220,40,580,40);

        g.setColor(firstColor);
    }

}
