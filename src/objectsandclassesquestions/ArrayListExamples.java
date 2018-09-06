package objectsandclassesquestions;

import java.util.ArrayList;

public class ArrayListExamples
{
    /*
    Netbeans sugested to me that I make list and the other address' final.  It
    also suggested that create a constuctor and declare list as a new arrayList
    in there.
    
    The final keyword means that I cannot change the value however in this 
    instance I can update it.  For example it is completly legal to add an
    address to list in add(), however I couldn't have a setList() method which
    replaced the list with a new list.
    
    The following code gives an error that says "cannot assign a value to a
    final variable list"
    
    public void setList(ArrayList<Address> newList)
    {
        this.list = newList;
    }
    
    If I wanted to change one of the address I could simply remove the final
    key word.
    */
    
    
    private final ArrayList<Address> list;
    private final Address a0 = new Address();
    private final Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
    private final Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");

    public ArrayListExamples()
    {
        this.list = new ArrayList();
    }
    
    public void add()
    {
        list.add(a0);
        list.add(a1);
        list.add(a2);
    }
    
    public void addWithIndex()
    {
        System.out.println("Test Add With An Index");
        
        Address newAddress = new Address(3, 3, 0003, "123", "Fack St", "Louth");
        list.add(1, newAddress);
    }

    public void print(String arrayListName)
    {
        if(list.isEmpty())
        {
            System.out.println("List has no elements.");
        }
        
        else
        {
            for(Address a : list)
            {
                System.out.println(arrayListName + " Element: " + a.getID());
                a.print();
            }
        }
    }

    public void clear()
    {
        System.out.println("Test Clear");
        list.get(0).resetCount();
        list.clear();
        
    }

    public ArrayList<Address> arrayListExamplesClone()
    {
        System.out.println("Test Clone");
        ArrayList<Address> addressListCopy = (ArrayList) list.clone();//Will not work if you don't cast to a arrayList
        return addressListCopy;
    }

    public void contains()
    {
        Address az = new Address();
        
        if(list.contains(a0))
            System.out.println("List contains a0.");
        
        else
            System.out.println("List doesn't contain a0.");
        
        
        if(list.contains(az))
            System.out.println("List contains az.");
        
        else
            System.out.println("List doesn't contain az.");
    }
    
    
}



























