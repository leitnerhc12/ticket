
/**
 * An Interview class.
 *
 * @author (Hannah Leitner)
 * @version (2/12/19)
 */
public class Interview
{
    private Character c1, c2;
    
    
    public Interview(Character _c1, Character _c2)
    {
        c1 = _c1;
        c2 = _c2;
    }
    /*
    public void comparePeopleSkills()
    {
        System.out.println("Selection process for people skills:");
        System.out.println("The greeting for candidate 1 " + c1.getName + ":");
        System.out.println(c1.sayHello());
        System.out.println("The greeting for candidate 2:");
        System.out.println(c2.sayHello());
        System.out.println();
        
        Character selection;
        if (c1.getIntelligence() > c2.getIntelligence())
            selection = c1;
        else if (c1.getIntelligence() > c2.getIntelligence())
            selection = c2;
        return selection;
    }
    */
}
