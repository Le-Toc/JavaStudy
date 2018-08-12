package objectsandclassesquestions;

public class Tally
{
    //Variables
    static int count;
    private int limitVariable;
    private int tallyCount;
    
    
    //Contructors
    Tally()
    {
        count++;
        limitVariable = 0;
        tallyCount = 0;
    }
    
    
    //Getters and Setters
    public int getLimitVariable()
    {
        return limitVariable;
    }

    public void setLimitVariable(int limitVariable)
    {
        this.limitVariable = limitVariable;
    }

    public int getTallyCount()
    {
        return tallyCount;
    }

    public void setTallyCount(int tallyCount)
    {
        this.tallyCount = tallyCount;
    }
    
    
    //Methods
    public void setLimit(int maximum)
    {
        limitVariable = maximum;
    }
    
    public void increaseTally()
    {
        if(tallyCount < limitVariable)
        {
            tallyCount++;
        }
        
        else
        {
            outputError();
        }
    }
    
    public void outputError()
    {
        System.out.println("Limit exceeded.  Tally Count = " + tallyCount);
    }
}

























