package br.lusoft.starmania.base;

public final class Color
{
    private int r;
    private int g;
    private int b;
    private int value;

    private static Color[] colors = new Color[]
    {
        new Color(0x00FF0000, 0x0000FF00, 0x000000FF),
        new Color(0x00FF0000, 0x00000000, 0x00000000),
        new Color(0x00000000, 0x0000FF00, 0x00000000),
        new Color(0x00000000, 0x00000000, 0x000000FF),
        new Color(0x00000000, 0x00000000, 0x00000000),
        new Color(0x00FF0000, 0x0000FF00, 0x00000000),
        new Color(0x00000000, 0x0000FF00, 0x000000FF),
        new Color(0x00FF0000, 0x0000CC00, 0x00000000)
    };

    public static Color White = colors[0];
    public static Color Red   = colors[1];
    public static Color Green = colors[2];
    public static Color Blue  = colors[3];
    public static Color Black = colors[4];
    public static Color Yellow = colors[5];
    public static Color Cyan = colors[6];
    public static Color Gold = colors[7];

    private Color(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.value = r | g | b;
    }

    public int getR()
    {
        return r;
    }

    public int getG()
    {
        return g;
    }

    public int getB()
    {
        return b;
    }

    public int getValue()
    {
        return value;
    }
}
