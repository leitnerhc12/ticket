
/**
 * Write a description of class WalkUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalkUpTicket extends Ticket
{
    public WalkUpTicket(int ticketNum)
    {
        super(ticketNum);
    }
    
    public double getPrice()
    {
        return 50.0;
    }
}
