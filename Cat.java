
/**
 * Another animal that is not a dog.
 *
 * @author (Hannah Leitner)
 * @version (2/28/19)
 */
public class Cat extends Animal
{
    private String breed;
    private boolean isSalty;
    public Cat(boolean _isHungry, String _gender, String _breed, boolean _isSalty)
    {
        super(_isHungry, 5, 4, _gender);
        
        breed =_breed;
        isSalty = _isSalty;
    } 
 
}
