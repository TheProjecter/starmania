package br.lusoft.starmania.model;

import br.lusoft.starmania.base.GameTime;
import br.lusoft.starmania.base.Rectangle;
import javax.microedition.lcdui.Graphics;


public abstract class GameObject
{
    private int x;
    private int y;

    public final int getX()
    {
        return x;
    }

    public final int getY()
    {
        return y;
    }

    public final void setX(int x)
    {
        this.x = x;
    }

    public final void setY(int y)
    {
        this.y = y;
    }

    public final void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public final void incX(int units)
    {
        x = x + units;
    }

    public final void incY(int units)
    {
        y = y + units;
    }

    public final void decX(int units)
    {
        x = x - units;
    }

    public final void decY(int units)
    {
        y = y - units;
    }

    public abstract void draw(Graphics g, Rectangle bounds);
    public abstract void update(GameTime gameTime);

}
