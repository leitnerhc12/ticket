
/**
 * A main method to test the Ticket classes.
 *
 * @author Delaney Barrow
 * @version 2/8/18
 */
public class TicketMain
{
    public static void main(String [] args)
    {
        Ticket a = new WalkUpTicket(1);
        Ticket b = new AdvanceTicket(2, 7);
        Ticket c = new AdvanceTicket(3, 10);
        Ticket d = new AdvanceTicket(4, 16);
        Ticket e = new StudentAdvanceTicket(5, 2);
        Ticket f = new StudentAdvanceTicket(6, 10);
        Ticket g = new StudentAdvanceTicket(7, 19);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}

