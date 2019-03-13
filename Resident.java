
/**
 * Constructors, Fields, and Methods for our Resident Matcher to get Resident variables.
 *
 * @author (Hannah Leitner and Delaney Barrow)
 * @version (2/13/19)
 */
public class Resident
{
    private int residentNum, sleepHabits, socialActivity, studyHabits;
    
    public Resident(int rNum, int sleep, int sa, int study)
    {
        residentNum = rNum;
        sleepHabits = sleep;
        socialActivity = sa;
        studyHabits = study;
    }
    
    public String toString()
    {
        return "Resident #" + residentNum + "\n Sleep Habits: " + sleepHabits +  "\n Study Habits: " + studyHabits + "\n Social Activity: " + socialActivity;
    }
    
    public int getrNum()
    {
        return residentNum;
    }
    
    public int getSleep()
    {
        return sleepHabits;
    }
    
    public int getSocial()
    {
        return socialActivity;
    }
    
    public int getStudy()
    {
        return studyHabits;
    }
}
