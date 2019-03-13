
/**
 * Write a description of class CharacterMain here.
 *
 * @author (Hannah Leitner)
 * @version (2/12/19)
 */
public class CharacterMain
{
  public static void main(String [] args)
  {
      Character ch1 = new Character();
      Character ch2 = new Character ("Paul", 42, 5.4, "Horse");
      Character ch3 = new Character ("Sarah", 21, 5.6, "Alien");
      
      //ch2.sayHello();
      //ch3.sayHello();
      
      Interview int1 = new Interview(ch2, ch3);
      //int1.comparePeopleSkills();
      
  }
}
