
/**
 * our own Point Class to explore objects.
 *
 * @author (Hannah Leitner)
 * @version (1/29/19)
 */
public class Point
{
    public int x;
    public int y;
    
    public Point(int initialX, int initialY)
    {
        x = initialX;
        y = initialY;
    }
    
    public Point()
    {
        this(0, 0);
    }
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
        
    }
    
    public void setLocation(int xx, int yy)
    {
        x += xx;
        y += yy;
        
    }
    
    public double distanceToOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
}
