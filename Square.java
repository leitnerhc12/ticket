
/**
 * Write a description of class Square here.
 *
 * @author (Hannah Leitner)
 * @version (3/1/19)
 */
public class Square extends RegularPolygon
{
  public Square(int sideLength)
  {
    super("Square", 4, sideLength);
  }
  
  public double getArea()
  {
    return getSideLength() * getSideLength(); 
  }
  
  public String hey()
  {
      return  super.hey() + " World";
  }
  
  
  public void sayHello()
  {
      System.out.println("Hi,I am a square");
  }
}
