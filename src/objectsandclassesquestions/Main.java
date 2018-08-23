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
        //a0.print();
        //a1.print();
        //a2.print();
        
        
        System.out.println("Test Add");
        
        ArrayList<Address> addressList = new ArrayList<Address>();
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        for(Address a : addressList)
            a.print();
        
        
        
        System.out.println("Test Add With An Index");
        
        Address newAddress = new Address(3,3, 0003, "123", "Fack St", "Louth");
        addressList.add(1, newAddress);
        
        for(Address a : addressList)
            a.print();
        
        
        
        System.out.println("Test Clear");
        addressList.clear();
        
        for(Address a : addressList)
            a.print();
        
        
        
        System.out.println("Test Clone");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        ArrayList<Address> secondList = (ArrayList) addressList.clone();
        
        for(Address a : secondList)
            a.print();
        
        
        
        System.out.println("Test Contains Using A Predevined Object");
        
        if(addressList.contains(a0))
            System.out.println("True");
        else 
            System.out.println("False");
        
        
        System.out.println("Test Contains Using A Declared Object in the called");
        
        if(addressList.contains(new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk")))
            System.out.println("True");
        else 
            System.out.println("False");
        
        
        System.out.println("Test Contains Using A Predevined Object but with a different name");
        
        Address a4 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        
        if(addressList.contains(a4))
            System.out.println("True");
        else 
            System.out.println("False");
        
        
        System.out.println("Contains will return true only if you search for an object in the list with the same name");
        
        
        
        System.out.println("Test indexOf");
        System.out.println(addressList.indexOf(a2));
        
        
        System.out.println("Test isEmpty");
        if(addressList.isEmpty())
            System.out.println("List is empty");
        
        if(!addressList.isEmpty())
            System.out.println("List is not empty");
        
        addressList.clear();
        
        if(addressList.isEmpty())
            System.out.println("List is empty");
        
        
        
        System.out.println("Test remove");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        for(Address a : addressList)
            a.print();
        
        addressList.remove(a0);
        
        for(Address a : addressList)
            a.print();
        
        addressList.add(0, a0);
        
        for(Address a : addressList)
            a.print();
        
        addressList.remove(0);
        
        for(Address a : addressList)
            a.print();
        
        
        System.out.println("Test remove all");
        
        addressList.removeAll(secondList);
        
        
        
        
        
        //Test comesBefore
        //First Test should come out true
        boolean doesComeBefore = a1.comesBefore(a2);
        //System.out.println(doesComeBefore);
        
        //Should come out false
        doesComeBefore = a2.comesBefore(a1);
        //System.out.println(doesComeBefore);
        
        //Should come out false
        doesComeBefore = a1.comesBefore(a1);
        //System.out.println(doesComeBefore);
    }

    private void question5()
    {
    }
}
























