package br.lusoft.starmania.model;

import br.lusoft.starmania.base.Color;
import br.lusoft.starmania.base.Point;
import javax.microedition.lcdui.Graphics;

public class Star
{
    private Point position;

    public Point getPosition()
    {
        return position;
    }

    public void setPosition(Point position)
    {
        this.position = position;
    }

    public void setPosition(int x, int y)
    {
        this.position = new Point(x, y);
    }

    public void draw(Graphics g)
    {
        int oldColor = g.getColor();

        g.setColor(Color.Blue.getValue());
        g.fillRect(position.getX(), position.getY(), 16, 16);
        g.setColor(oldColor);
    }
}
