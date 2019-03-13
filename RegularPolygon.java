
/**
 * Write a description of class RegularPolygon here.
 *
 * @author (Hannah Leitner)
 * @version (3/1/19)
 */
public abstract class RegularPolygon
{
    private String name;
    private int numSides;
    private int sideLength;
    
    public RegularPolygon(String _name, int _numSides, int _sideLength)
    {
        name = _name;
        numSides = _numSides;
        sideLength = _sideLength;
    }
    
    public int getPerimeter()
    {
     return numSides * sideLength;
    }
    
    public abstract double getArea();
    
    public String hey()
    {
        return "Hello";
    }
    
    public String toString()
    {
        return name + " -- Perimeter:" + getPerimeter() + ", Area " + getArea();
    }
    
    public int getNumSides()
    {
        return numSides;
    }
    
    public int getSideLength()
    {
        return sideLength;
    }
}
