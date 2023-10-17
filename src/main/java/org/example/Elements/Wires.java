package org.example.Elements;

import java.awt.*;

public class Wires {
    private int x;
    private int y;

    public Wires(int x, int y) {
        setX(x);
        setY(y);
    }

    public void drawWires(Graphics2D g){
        Color firstColor = g.getColor();
        Stroke firstStroke = g.getStroke();
        g.setStroke(new BasicStroke(5));

        g.setColor(Color.RED);
        g.drawArc(x,y, 400,250, -90,-90);
        g.setColor(Color.YELLOW);
        g.drawArc(x - 50,y - 11, 400,250, -80,-95);
        g.setColor(Color.MAGENTA);
        g.drawArc(x - 30,y - 11, 200,250, -5,-176);
        g.setColor(Color.GREEN);
        g.drawArc(x - 15,y - 11, 250,250, -5,-176);

        g.setColor(firstColor);
        g.setStroke(firstStroke);
    }

    private void setX(int x){
        this.x = x;
    }

    private void setY(int y){
        this.y = y;
    }


}
