
/**
 * Write a description of class EquilateralTriangle here.
 *
 * @author (Hannah Leitner)
 * @version (3/6/19)
 */
public class EquilateralTriangle extends RegularPolygon
{
    public EquilateralTriangle(int sideLength)
    {
        super("EquilateralTriangle", 3, sideLength);
    }
    
    public double getArea()
    {
       return Math.sqrt(3)/4*getSideLength()*getSideLength();
    }
}
