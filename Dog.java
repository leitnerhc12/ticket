
/**
 *  Dog classs with subclass of animal.
 *
 * @author (Hannah Leitner)
 * @version (2/27/19)
 */
public class Dog extends Animal
{
    private boolean isOwnerPresent;
    private String breed;
    
    public Dog(boolean _isHungry, String _gender, boolean _isOwnerPresent, String _breed)
    {
        super(_isHungry, 5, 4, _gender);
        
        isOwnerPresent = _isOwnerPresent;
        breed = _breed;
        
    }
    
    public void wagTail()
    {
        if (!isOwnerPresent)
            System.out.println("WAG WAG WAG");
        else
            System.out.println("WAG");
    }
    
    public void bork()
    {
        if (!isOwnerPresent)
            System.out.println("BORK BORK BORK");
        else
            System.out.println("BORK");
    }
    
    public void locomote()
    {
        System.out.println("I am running!");
    }
}
