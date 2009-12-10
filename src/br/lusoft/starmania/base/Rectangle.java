package br.lusoft.starmania.base;


public class Rectangle
{
    private Size size;
    private Point location;
    private Point rightBottom;

    public Rectangle(int x, int y, int width, int height)
    {
        location = new Point(x, y);
        size = new Size(width, height);
        rightBottom = new Point(x + width, y + height);
    }

    public Rectangle(Point location, int width, int height)
    {
        this(location.getX(), location.getY(), width, height);
    }

    public Rectangle(int x, int y, Size size)
    {
        this(x, y, size.getWidth(), size.getHeight());
    }

    public Rectangle(Point location, Size size)
    {
        this(location.getX(), location.getY(), size.getWidth(), size.getHeight());
    }

    public Point getRightBottom()
    {
        return rightBottom;
    }

    public Size getSize()
    {
        return size;
    }

    public Point getTopLeft()
    {
        return location;
    }

    public Point getLocation()
    {
        return location;
    }

    public void setLocation(Point location)
    {
        this.location = location;
        rightBottom = new Point(location.getX() + size.getWidth(), location.getY() + size.getHeight());
    }

    public void setSize(Size size)
    {
        this.size = size;
        rightBottom = new Point(location.getX() + size.getWidth(), location.getY() + size.getHeight());
    }

    public void setLocation(int x, int y)
    {
        setLocation(new Point(x, y));
    }

    public void setSize(int width, int height)
    {
        setSize(new Size(width, height));
    }

    public int getWidth()
    {
        return size.getWidth();
    }

    public int getHeight()
    {
        return size.getHeight();
    }

    public int getLeft()
    {
        return location.getX();
    }

    public int getTop()
    {
        return location.getY();
    }

    public int getRight()
    {
        return rightBottom.getX();
    }

    public int getBottom()
    {
        return rightBottom.getY();
    }
}
