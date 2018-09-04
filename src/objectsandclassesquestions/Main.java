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
    
    private void arrayListExamples()
    {
        //ArrayList addressList = new ArrayList();
        ArrayListExamples arrayListExample = new ArrayListExamples();
        
        //Add
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
        arrayListExample.clear();
        arrayListExample.print("arrayListExample");
        
        //addressList = arrayListExampleAdd(addressList);
        //ArrayList<Address> addressListCopy = arrayListExampleClone(addressList);
        //print(addressListCopy);
        
        /*
        //Contains
        arrayListExampleContains(addressList);
        
        //IndexOf
        arrayListExampleIndexOf();
        
        //IsEmpty
        arrayListExampleIsEmpty(addressList);
        
        //Remove
        arrayListEeampleRemove(addressList);
        
        //RemoveAll
        addressList.clear();
        addressListCopy.clear();
        
        addressList = arrayListExampleAdd(addressList);
        addressListCopy = arrayListExampleAdd(addressList);
        
        print(addressList, "addressList");
        print(addressListCopy, "addressListCopy");
        arrayListEeampleRemoveAll(addressList, addressListCopy);
        */
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

    private ArrayList<Address> arrayListExampleAdd(ArrayList<Address> addressList)
    {
        System.out.println("Test Add");
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        return addressList;
    }

    private ArrayList<Address> arrayListExampleAddWithAnIndex(ArrayList<Address> addressList)
    {
        System.out.println("Test Add With An Index");
        
        Address newAddress = new Address(3,3, 0003, "123", "Fack St", "Louth");
        addressList.add(1, newAddress);
        
        return addressList;
    }

    private ArrayList<Address> arrayListExampleClear(ArrayList<Address> addressList)
    {
        System.out.println("Test Clear");
        addressList.clear();
        return addressList;
    }

    private ArrayList<Address> arrayListExampleClone(ArrayList<Address> addressList)
    {
        System.out.println("Test Clone");
        
        ArrayList<Address> addressListCopy = (ArrayList) addressList.clone();//Will not work if you don't cast to a arrayList
        
        return addressListCopy;
    }

    private void arrayListExampleContains(ArrayList<Address> addressList)
    {
        arrayListExampleContainsUsingAPredevinedObject(addressList);
        arrayListExampleContainsUsingADeclaredObject(addressList);
        arrayListExampleContainsUsingAPredevinedObjectWithDifferentName(addressList);
        
        System.out.println("Contains will return true only if you search for an object in the list with the same name");
    }

    private void arrayListExampleContainsUsingAPredevinedObject(ArrayList<Address> addressList)
    {
        System.out.println("Test Contains Using A Predevined Object");
        
        Address a0 = new Address();
        
        if(addressList.contains(a0))
            System.out.println("True");
        else 
            System.out.println("False");
    }

    private void arrayListExampleContainsUsingADeclaredObject(ArrayList<Address> addressList)
    {
        System.out.println("Test Contains Using A Declared Object in the called");
        
        if(addressList.contains(new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk")))
            System.out.println("True");
        else 
            System.out.println("False");
    }

    private void arrayListExampleContainsUsingAPredevinedObjectWithDifferentName(ArrayList<Address> addressList)
    {
        System.out.println("Test Contains Using A Predevined Object but with a different name");
        
        Address a4 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        
        if(addressList.contains(a4))
            System.out.println("True");
        else 
            System.out.println("False");
    }

    private void arrayListExampleIndexOf()
    {
        System.out.println("Test indexOf:");
        
        //Tests
        //Test 1: Test when arrayList is declared in method and elements are added
        //Test 2: Test when empty arrayList is added in as an argument and elements are added to it in the method
        //Test 3: Test when a full arrayList is added in as an argument and elements arn't added
        
        //Test 1
        arrayListExampleIndexOfTest1();
        
        //Test 2
        ArrayList<Address> addressList = new ArrayList();
        arrayListExampleIndexOfTest2(addressList);
        
        //Test 3
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        arrayListExampleIndexOfTest3(addressList);
        
        System.out.println("Test 3 is the only test that didn't work.");
    }

    private void arrayListExampleIndexOfTest1()
    {
        //Test 1: Test when arrayList is declared in method and elements are added to the arrayList in the same method
        System.out.println("Test 1: Test when arrayList is declared in method and elements are added");
        
        ArrayList<Address> addressList = new ArrayList();
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        System.out.println(addressList.indexOf(a0));
        System.out.println(addressList.indexOf(a1));
        System.out.println(addressList.indexOf(a2));
        System.out.println(addressList.indexOf(new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk")));
    }

    private void arrayListExampleIndexOfTest2(ArrayList<Address> addressList)
    {
        //Test 2: Test when empty arrayList is passed in as an argument and elements are added to it in the method
        System.out.println("Test 2: Test when empty arrayList is added in as an argument and elements are added to it in the method");
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        System.out.println(addressList.indexOf(a0));
        System.out.println(addressList.indexOf(a1));
        System.out.println(addressList.indexOf(a2));
        System.out.println(addressList.indexOf(new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk")));
    }

    private void arrayListExampleIndexOfTest3(ArrayList<Address> addressList)
    {
        //Test 3: Test when a full arrayList is passed in as an argument and elements are not added to the arrayList
        System.out.println("Test 3: Test when a full arrayList is added in as an argument and elements arn't added");
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        System.out.println(addressList.indexOf(a0));
        System.out.println(addressList.indexOf(a1));
        System.out.println(addressList.indexOf(a2));
        System.out.println(addressList.indexOf(new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk")));
    }

    private void arrayListExampleIsEmpty(ArrayList<Address> addressList)
    {
        System.out.println("\nTest isEmpty:");
        
        System.out.println("Should print out \"List is not empty\".");
        if(addressList.isEmpty())
            System.out.println("List is empty");
        
        else if(!addressList.isEmpty())
            System.out.println("List is not empty");
        
        addressList.clear();
        
        System.out.println("\nShould print out \"List is empty\".");   
        if(addressList.isEmpty())
            System.out.println("List is empty");
    }

    private void arrayListEeampleRemove(ArrayList<Address> addressList)
    {
        System.out.println("\nTest Remove:");
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        addressList.add(a0);
        addressList.add(a1);
        addressList.add(a2);
        
        System.out.println("Should print out the full list.");
        print(addressList);
        
        addressList.remove(a0);
        
        
        System.out.println("Removed the first element using the element name.");
        print(addressList);
        
        
        System.out.println("Added the first element back into the list in the same spot.");
        addressList.add(0, a0);
        
        print(addressList);
        
        
        addressList.remove(0);
        System.out.println("Removed the first element again using the element number.");
        print(addressList);
    }

    private void arrayListEeampleRemoveAll(ArrayList<Address> addressList, ArrayList<Address> addressListCopy)
    {
        System.out.println("Test remove all");
        
        System.out.println("Number of elements in list before remove all: " + addressList.size());
        addressList.removeAll(addressListCopy);
        System.out.println("Number of elements in list after remove all: " + addressList.size());
    }
    
    private void question5()
    {
        System.out.println("This is a test to see if netbeans can run at the same time as watching a youtube video");
        System.out.println("So acually writing the code seems to be fine, however Joe Rogan froze for a second when the code was compiling");
        System.out.println("Next step would be to further test how netbeans works while coding.");
        System.out.println("Possible Solution:  See what it's like to edit, run, and compile java programes using he command line!  That sounds cool.");
        System.out.println("That last compile worked well.  There was no lag in the video and at the same time I moved the windows to be split 50 50");
        System.out.println("That last one was perfect");
    }
}


























