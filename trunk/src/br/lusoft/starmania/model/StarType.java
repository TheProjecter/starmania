package br.lusoft.starmania.model;

public final class StarType
{
    private int value;

    private static StarType[] starTypes = new StarType[]
    {
        new StarType(5),
        new StarType(10),
        new StarType(25),
        new StarType(50),
        new StarType(100)
    };

    public static StarType Red = starTypes[0];
    public static StarType Blue = starTypes[1];
    public static StarType Green = starTypes[2];
    public static StarType Cyan = starTypes[3];
    public static StarType Gold = starTypes[4];
    

    private StarType(int value)
    {
        this.value = value;
        loadSprite();
    }

    private void loadSprite()
    {
        
    }

    public int getValue()
    {
        return value;
    }
}
