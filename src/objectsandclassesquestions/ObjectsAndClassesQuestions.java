package objectsandclassesquestions;

public class ObjectsAndClassesQuestions
{
    public static void main(String[] args)
    {
        ObjectsAndClassesQuestions theApp = new ObjectsAndClassesQuestions();
        theApp.start();
    }

    private void start()
    {
        //question2();
        question4();
        //question5();
    }

    private void question2()
    {
        /*
        Simulate a tally counter that can be used to admit a limited number of people. First, the limit is set with a call public
        void setLimit(int maximum).  If the count button was clicked more often than the limit, simulate an alarm by printing out a
        message “Limit exceeded”.
        */
        
        Tally tally = new Tally();
        tally.setLimit(10);
        
        for(int i = 0; i < 100; i++)
        {
            tally.increaseTally();
        }
    }

    private void question4()
    {
        /*
        Implement a class Address. An address has a house number, a street, an optional apartment number, a city, a state, and a
        postal code. Supply two constructors: one with an apartment number and one without. Supply a print method that prints the
        address with the street on one line and the city, state, and zip code on the next line.  Supply a method public boolean
        comesBefore(Address other) that tests whether this address comes before another when the addresses are compared by postal
        code.
        */
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        a0.print();
        a1.print();
        a2.print();
        
        //Test comesBefore
        //First Test should come out true
        boolean doesComeBefore = a1.comesBefore(a2);
        System.out.println(doesComeBefore);
        
        //Should come out false
        doesComeBefore = a2.comesBefore(a1);
        System.out.println(doesComeBefore);
        
        //Should come out false
        doesComeBefore = a1.comesBefore(a1);
        System.out.println(doesComeBefore);
    }

    private void question5()
    {
        
    }
}
























