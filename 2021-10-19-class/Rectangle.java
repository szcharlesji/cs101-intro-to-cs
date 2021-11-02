public class Rectangle
{
    private double length;
    private double width;
    private String color;

    private static int numberOfRectangles = 0;

    public Rectangle()
    {
        length = 1;
        width = 2;
        color = "Blue";
        numberOfRectangles++;
    }

    public Rectangle(int len, int wid, String col)
    {
        length = len;
        width = wid;
        color = col;
        numberOfRectangles++;
    }

    public void setLength(int len)
    {
        length = len;
    }

    public void setWidth(int wid)
    {
        width = wid;
    }

    public void setColor(String col)
    {
        color = col;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public String getColor()
    {
        return color;
    }

    public double getPerimeter()
    {
        return length * width;
    }
}