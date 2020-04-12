
public class Door 

{
	//	Door Enums
	public static enum DoorColor 
	{
		RED("Red", 599.00), 
		BLUE("Blue", 599.00), 
		BLACK("Black", 599.00), 
		SILVER("Silver", 599.00), 
		GREEN("Green", 599.00), 
		YELLOW("Yellow", 599.00),
	}
	
	//	Declared Objects
	private String doorColor;
	double doorPrice;
	
	// Door constructor
	public DoorColor(String doorColor, double doorPrice) //	The DoorColor enum is made up of a String and a double. This constructor defines that.
	{
		this.doorColor = doorColor;
		this.doorPrice = doorPrice;
	}

	//	Setters
	public void setDoorColor(DoorColor doorColor)
	{
		this.doorColor = doorColor;
	}

	//	Getters
	public DoorColor getDoorColor()
	{
		return this.doorColor;
	}
	
    public String toString()
    {
    	return this.doorColor + " " + this.doorPrice;
    }
	 
}
