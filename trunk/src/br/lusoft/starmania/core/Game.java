package br.lusoft.starmania.core;

import br.lusoft.starmania.base.Color;
import javax.microedition.lcdui.Graphics;
import br.lusoft.starmania.base.Rectangle;
import br.lusoft.starmania.model.Star;
import javax.microedition.lcdui.game.GameCanvas;


public class Game extends GameCanvas implements Runnable
{        
    private Star star;
    private Graphics graphics;
    private Rectangle screenBounds;

    private boolean gameRunning = false;


    public Game()
    {
        super(false);
        this.graphics = getGraphics();
        this.screenBounds = new Rectangle(0, 0, getWidth(), getHeight());
        
        star = new Star();
        star.setPosition(20, 20);
        
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
                paint(graphics);
            }
        }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.Black.getValue());
        g.fillRect(0, 0, screenBounds.getWidth(), screenBounds.getHeight());
        star.draw(g);
        flushGraphics();
    }

    protected void keyPressed(int keyCode)
    {
        if (getGameAction(keyCode) == FIRE)
        {
            gameRunning = false;
            GameLauncher launcher = GameLauncher.getInstance();
            launcher.destroyApp(true);
            launcher.notifyDestroyed();
        }
    }
}
