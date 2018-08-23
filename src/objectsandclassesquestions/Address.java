package objectsandclassesquestions;

public class Address
{
    //Variables
    static int count = -1;
    private int houseNumber, appartmentNumber, postalCode, id;
    private String street, city, state;
    
    
    //Constructors
    Address()
    {
        count++;
        this.houseNumber = 0;
        this.appartmentNumber = 0;
        this.postalCode = 0;
        this.street = "null";
        this.city = "null";
        this.state = "null";
        setID(count);
    }
    
    Address(int houseNumber, int appartmentNumber, int postalCode, String street, String city, String state)
    {
        count++;
        this.houseNumber = houseNumber;
        this.appartmentNumber = appartmentNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
        this.state = state;
        setID(count);
    }
    
    Address(int houseNumber, int postalCode, String street, String city, String state)
    {
        count++;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.city = city;
        this.state = state;
        setID(count);
    }
    
    
    //Getters and Setters
    private void setID(int id)
    {
        this.id = id;
    }
    
    public int getID()
    {
        return this.id;
    }
    
    public int getHouseNumber()
    {
        return houseNumber;
    }
    
    public void setHouseNumber(int houseNumber)
    {
        this.houseNumber = houseNumber;
    }
    
    public int getAppartmentNumber()
    {
        return appartmentNumber;
    }
    
    public void setAppartmentNumber(int appartmentNumber)
    {
        this.appartmentNumber = appartmentNumber;
    }
    
    public int getPostalCode()
    {
        return postalCode;
    }
    
    public void setPostalCode(int postalCode)
    {
        this.postalCode = postalCode;
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public void setStreet(String street)
    {
        this.street = street;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setState(String state)
    {
        this.state = state;
    }
    
    
    //Methods
    public void print()
    {
        System.out.println("\n" + "Address ID: " +  this.getID()+ "\n" + "Street Name: " + this.getStreet() + "\n"
                + "City: " + this.getCity() + " State: " + this.getState() + " Postal Code: " + this.getPostalCode()+ "\n");
    }
    
    public boolean comesBefore(Address other)
    {
        return this.postalCode < other.postalCode;
    }
}
























