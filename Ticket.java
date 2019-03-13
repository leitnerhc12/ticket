
/**
 * Code using different types of classes.
 *
 * @author Delaney Barrow and Hannah Leitner
 * @version March 9, 2019
 */
public abstract class Ticket
{
    private int ticketNum;
    
    public Ticket(int _ticketNum)
    {
        ticketNum = _ticketNum;
    }
    
    public abstract double getPrice();
    
    public String toString()
    {
        return "Number: " + ticketNum + ", Price: " + getPrice();
    }
}
