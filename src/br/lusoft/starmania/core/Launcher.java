package br.lusoft.starmania.core;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class Launcher extends MIDlet
{
    private static Launcher instance = null;

    public Launcher()
    {
        instance = this;
    }

    public static Launcher getInstance()
    {
        return instance;
    }

    public void startApp() 
    {
        Display display = Display.getDisplay(this);
        Runner testScreen = new Runner(display);
        
        display.setCurrent(testScreen);
        testScreen.start();
        
    }

    public void pauseApp() 
    {
        System.out.println("Pausing...");
    }

    public void destroyApp(boolean unconditional) 
    {

    }
}
