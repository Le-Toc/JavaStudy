package objectsandclassesquestions;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Main theApp = new Main();
        theApp.start();
    }

    private void start()
    {
        //question2();
        //question4();
        arrayListExamples();
    }
    
    private void question2()
    {
        /*
        Simulate a tally counter that can be used to admit a limited number of
        people. First, the limit is set with a call public void
        setLimit(int maximum).  If the count button was clicked more often than
        the limit, simulate an alarm by printing out a message “Limit exceeded”.
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
        Implement a class Address. An address has a house number, a street, an
        optional apartment number, a city, a state, and a postal code. Supply
        two constructors: one with an apartment number and one without. Supply
        a print method that prints the address with the street on one line and
        the city, state, and zip code on the next line.  Supply a method public
        boolean comesBefore(Address other) that tests whether this address comes
        before another when the addresses are compared by postal code.
        */
        
        //Create some new addresses
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        //Test the print method
        a0.print();
        a1.print();
        a2.print();
        
        //Test the comesBefore method
        System.out.println(a0.comesBefore(a1));//Should return true
        System.out.println(a2.comesBefore(a1));//Should return false
        System.out.println(a1.comesBefore(a1));//Should return false
    }
    
    private void arrayListExamples()//I set up this method to test the different methods in ArrayList
    {
        ArrayListExamples arrayListExample = new ArrayListExamples();
        
        //Add
        System.out.println("Test Add");
        arrayListExample.add();
        arrayListExample.print("arrayListExample");
        
        //Add With Index
        arrayListExample.addWithIndex();
        arrayListExample.print("arrayListExample");
        
        //Clone
        ArrayList<Address> arrayListExampleCopy = arrayListExample.arrayListExamplesClone();
        arrayListExample.print("arrayListExample");
        print(arrayListExampleCopy, "arrayListExampleCopy");
        
        //Clear
        output("Test Clear");
        arrayListExample.clear();
        arrayListExample.print("arrayListExample");
        
        //Contains
        arrayListExample.add();
        arrayListExample.print("arrayListExample");
        arrayListExample.contains();
        
        //IndexOf
        output("Test indexOf()");
        arrayListExample.indexOf();
        
        //IsEmpty
        output("Test isEmpty()");
        arrayListExample.isEmpty();
        
        //Remove
        output("Test Remove:");
        arrayListExample.add();
        arrayListExample.remove();
        
        //RemoveAll
        output("Test removeAll():");
        arrayListExample.removeAll();
    }
    
    private void print(ArrayList<Address> addressList)
    {
        /*
        Normal For Each Loop
        
        for (Address a : addressList)
        {
            a.print();
        }
        */
        
        //Instead of using a for each loop you can use the foreach method in arrayList
        addressList.forEach((a) ->                                                              //Declare "a" to be temporary variable of the same type as the elements in addressList.  Then for each "a" in addressList do the following...
        {
            a.print();                                                                          //Call the print method that relates to the object called "a".
        });
    }
    
    private void print(ArrayList<Address> addressList, String name)
    {
        /*
        Normal For Each Loop
        
        for (Address a : addressList)
        {
            a.print();
        }
        */
        
        //Instead of using a for each loop you can use the foreach method in arrayList
        addressList.forEach((a) ->                                                              //Declare "a" to be temporary variable of the same type as the elements in addressList.  Then for each "a" in addressList do the following...
        {
            System.out.println(name + a.getID());
            a.print();                                                                          //Call the print method that relates to the object called "a".
        });
    }
    
    private void output(String string)
    {
        System.out.println(string);
    }
}


























