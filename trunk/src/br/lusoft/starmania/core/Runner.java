package br.lusoft.starmania.core;

import br.lusoft.starmania.base.Color;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import br.lusoft.starmania.base.Rectangle;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;


public class Runner extends GameCanvas implements Runnable
{
    private Display display;
    private Graphics graphics;
    private boolean gameRunning = false;
    private Rectangle screenBounds;
    private int counter = 0;
    private StringBuffer buffer;
    private Sprite starSprite;


    public Runner(Display display)
    {
        super(false);
        this.display = display;
        this.graphics = getGraphics();
        this.screenBounds = new Rectangle(0, 0, getWidth(), getHeight());
    }

    public void start()
    {            
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run()
    {
        gameRunning = true;
        try 
        {
            while (gameRunning)
            {
                counter++;
                buffer.delete(0, buffer.length());
                buffer.append("Run: ");
                buffer.append(counter);
                paint(graphics);
            }
        }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.Black.getValue());
        g.fillRect(0, 0, screenBounds.getWidth(), screenBounds.getHeight());
        g.setColor(Color.Yellow.getValue());
        g.fillRect(50, 50, 20, 20);
        g.setColor(Color.Red.getValue());
        g.drawString(buffer.toString(), screenBounds.getWidth() / 2, screenBounds.getHeight() / 2, Graphics.HCENTER | Graphics.BASELINE);
        flushGraphics();
    }



    protected void keyPressed(int keyCode)
    {
        if (getGameAction(keyCode) == FIRE)
        {
            gameRunning = false;
            Launcher launcher = Launcher.getInstance();
            launcher.destroyApp(true);
            launcher.notifyDestroyed();
        }
    }
}
