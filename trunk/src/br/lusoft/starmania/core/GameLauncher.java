package br.lusoft.starmania.core;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class GameLauncher extends MIDlet
{
    private static GameLauncher instance = null;

    public GameLauncher()
    {
        instance = this;
    }

    public static GameLauncher getInstance()
    {
        return instance;
    }

    public void startApp() 
    {
        Display display = Display.getDisplay(this);
        Game game = new Game();
        
        display.setCurrent(game);
        game.start();
        
    }

    public void pauseApp() 
    {
    
    }

    public void destroyApp(boolean unconditional) 
    {

    }
}
