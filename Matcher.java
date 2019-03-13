
/**
 * Matcher class to find best and worst matches for individual residents.
 *
 * @author (Hannah Leitner and Delaney Barrow)
 * @version (2/15/19)
 */
public class Matcher
{
    Resident [] group;
    
    public Matcher(Resident [] g)
    {
        group = g;
    }
    
    public double calculateCompScore(Resident r1, Resident r2)
    {
        int sum = Math.abs(r1.getSleep() - r2.getSleep()) + Math.abs(r1.getStudy() - r2.getStudy()) + Math.abs(r1.getSocial() - r2.getSocial());
        
        double avg = sum / 3.0;
        return avg;
    }
    
   public Resident [] bestMatch()
   {
       
       double compare = calculateCompScore(group[0], group[1]);
       Resident [] best = {group[0], group[1]};
       for(int i = 0; i < group.length; i++)
       {
           for(int j = i + 1; j < group.length; j++)
           {
               double score = calculateCompScore(group[i], group[j]); 
               if(score < compare)
               {
                   compare = score;
                   best[0] = group[i];
                   best[1] = group[j];
               }
            }
       }
       System.out.println("The best matched partners are the following with a compatibility score of " + compare);
       System.out.println(best[0]);
       System.out.println(best[1]);
       System.out.println();
       return best;
   }
   
   public Resident [] worstMatch()
   {
       
       double compare = calculateCompScore(group[0], group[1]);
       Resident [] worst = {group[0], group[1]};
       for(int i = 0; i < group.length; i++)
       {
           for(int j = i + 1; j < group.length; j++)
           {
               double score = calculateCompScore(group[i], group[j]); 
               if(score > compare)
               {
                   compare = score;
                   worst[0] = group[i];
                   worst[1] = group[j];
               }
            }
       }
       System.out.println("The worst matched partners are the following with a compatibility score of " + compare);
       System.out.println(worst[0]);
       System.out.println(worst[1]);
       System.out.println();
       return worst;
   }
   
   public Resident bestIndividualMatch(Resident r1)
   {
       int rnum = 0;
       double compare = calculateCompScore(r1, group[0]);
       if (r1 == group[0])
       {
            rnum = 1;
            compare = calculateCompScore(r1, group[1]);
       }
       
       
       for(int i = 0; i < group.length; i++)
       {
           double score = calculateCompScore(r1, group[i]); 
           if(score < compare && !(r1.equals(group[i])))
           {
               compare = score;
               rnum = i;
           }
       }
       System.out.println("The best match for Resident #" + r1.getrNum() + " is Resident #" + (rnum + 1));
       
       System.out.println("They have a compatibility score of " + compare);
       System.out.println(r1);
       System.out.println(group[rnum]);
       System.out.println();
       return group[rnum]; 
   }
   
   public Resident worstIndividualMatch(Resident r1)
   {
       int rnum = 0;
       double compare = calculateCompScore(r1, group[0]);
       if (r1 == group[0])
       {
            rnum = 1;
            compare = calculateCompScore(r1, group[1]);
       }
       
       
       for(int i = 0; i < group.length; i++)
       {
           double score = calculateCompScore(r1, group[i]); 
           if(score > compare && !(r1.equals(group[i])))
           {
               compare = score;
               rnum = i;
           }
       }
       System.out.println("The worst match for Resident #" + r1.getrNum() + " is Resident #" + (rnum + 1));
       
       System.out.println("They have a compatibility score of " + compare);
       System.out.println(r1);
       System.out.println(group[rnum]);
       return group[rnum]; 
       
   }
}


