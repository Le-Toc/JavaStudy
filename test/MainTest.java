import objectsandclassesquestions.Tally;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest
{
    public MainTest()
    {
        
    }
    
    @Test
    public void exampleTest()
    {
        System.out.println("exampleTest1");
        int a = 5, b = 5;
        Tally test = new Tally();
        boolean result = test.greaterThanTen(a, b);
        boolean expResult = false;
        assertEquals(result, expResult);
    }
}
