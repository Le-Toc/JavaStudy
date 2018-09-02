package objectsandclassesquestions;

import java.util.ArrayList;

public class ArrayListExamples
{
    private ArrayList<Address> list = new ArrayList();
    
    public void add()
    {
        System.out.println("Test Add");
        
        Address a0 = new Address();
        Address a1 = new Address(1, 1, 0001, "Ballinurd", "Kilkerley", "Dundalk");
        Address a2 = new Address(2, 2, "24 Willow Grove", "Carrick Rd", "Dundalk");
        
        list.add(a0);
        list.add(a1);
        list.add(a2);
    }

    public void addWithIndex()
    {
        System.out.println("Test Add With An Index");
        
        Address newAddress = new Address(3,3, 0003, "123", "Fack St", "Louth");
        list.add(1, newAddress);
    }

    public void print(String arrayListName)
    {
        for(Address a : list)
        {
            System.out.println(arrayListName + " Element: " + a.getID());
            a.print();
        }
    }

    public void clear()
    {
        System.out.println("Test Clear");
        list.clear();
    }

    public ArrayList<Address> arrayListExamplesClone()
    {
        System.out.println("Test Clone");
        
        ArrayList<Address> addressListCopy = (ArrayList) list.clone();//Will not work if you don't cast to a arrayList
        
        return addressListCopy;
    }
    
    
}



























