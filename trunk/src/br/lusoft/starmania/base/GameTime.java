package br.lusoft.starmania.base;

public class GameTime
{
    private long ticks;
    private long timePassed;

    public GameTime(long ticks)
    {
        this.ticks = ticks;
        this.timePassed = 0;
    }

    public GameTime(GameTime lastTime, long ticks)
    {
        this.ticks = ticks;
        this.timePassed = ticks - lastTime.ticks;
    }

    public long getTimePassed()
    {
        return timePassed;
    }
}
