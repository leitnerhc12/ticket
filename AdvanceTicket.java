
/**
 * Write a description of class Advance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvanceTicket extends Ticket
{
   private int days;
    
    public AdvanceTicket(int ticketNum, int _days)
   {
       super(ticketNum);
       days = _days;
   }
   
   public double getPrice()
   {
       double price = 0;
       if(days >= 10) {
           price = 30;
       } else {
           price = 40;
       }
       return price;
   }
}
