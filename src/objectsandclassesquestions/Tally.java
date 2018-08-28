package objectsandclassesquestions;

public class Tally
{
    //Variables
    static int count = -1;
    private int limitVariable, tallyCount, id;
    
    
    //Contructors
    public Tally()
    {
        count++;
        limitVariable = 0;
        tallyCount = 0;
        setID(count);
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

    private void setID(int id)
    {
        this.id = id;
    }

    public int getID()
    {
        return this.id;
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
    
    public boolean greaterThanTen(int a, int b)
    {
        return false;
    }
}

























