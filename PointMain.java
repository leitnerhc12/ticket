
/**
 * A space to test our Point class.
 *
 * @author (Hannah Leitner)
 * @version (1/29/19)
 */
public class PointMain
{
   public static void main(String [] args)
   {
       Point p1 = new Point(3, 8);
       
       System.out.println(p1);
       
       p1.translate(-1, 4);
       
       System.out.println(p1);
       
       p1.setLocation(5, 8);
       
       System.out.println(p1);
       
       System.out.println(p1.distanceToOrigin());
       
       Point p2 = new Point();
       System.out.println(p2);
   }
}
