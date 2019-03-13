
/**
 * A place for animals.
 *
 * @author (Hannah Leitner)
 * @version (2/27/19)
 */
public class AnimalMainMethod
{
   public static void main (String [] args)
   {
       Animal a = new Animal(true, 7, 6,"female");
       
       a.locomote();
       a.eat();
       a.loseLegs(2);
       
       
       System.out.println();
       
       Dog b = new Dog(true, "male", false, "mutt");
       b.locomote();
       b.eat();
       b.loseLegs(0);
       b.wagTail();
       b.bork();
       
       System.out.println();
       
       Cat c = new Cat(true, "female","Calico", true);
       b.locomote();
       b.eat();
       b.loseLegs(0);
       
       
   }
}
