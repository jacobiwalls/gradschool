public class Address 
{
	private String address;
	private String city;
	private String state;
	private String zip;
	
	//-----------------------------------------------------------------
	//  Sets up Address with specified address, city, zip and state
	//	Often, the this. reference is used to distinguish the parameters of a 
	//	constructor from their corresponding instance variables with the same name.
	//	The this. reference refers to the object through which the method was invoked.
	//-----------------------------------------------------------------
	public Address(String address, String city, String state, String zip)
	{
		this.address = address; // The this. reference refers to the object through which the method was invoked.
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	// Setters
    public void setAddress(String address) 
    {
        this.address = address; // this. variables are instance variables and have a scope of the entire class.
    }
    
    public void setCity(String city) 
    {
        this.city = city; // this. variables are instance variables and have a scope of the entire class.
    }
    
    public void setZip(String zip) 
    {
        this.zip = zip; // this. variables are instance variables and have a scope of the entire class.
    }
    
    public void setState(String state) // state inside method is local data
    {
        this.state = state; // this. variables are instance variables and have a scope of the entire class.
    }
    
    // Getters
    public String getAddress() 
    {
        return address; // returns the "this." instance variables
    }
    
    public String getCity() 
    {
        return city; // returns the "this." instance variables
    }
    
    public String getState() 
    {
        return state; // returns the "this." instance variables
    }
    
    public String getZip() 
    {
        return zip; // returns the "this." instance variables
    }

	/**
	 * @override
	 * @description returns formatted address
	 * Creates local data that allows instance data to pass through the data as a string
	 */
    public String toString()
    {
    	return this.address + ", " + this.city + ", " + this.state + " " + this.zip;
    }
}
