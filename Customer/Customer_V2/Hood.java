
public class Hood 

{
	
	//	Hood Type Enums
	public static enum HoodType
	{
		REGULAR("Regular", 499.00),
		SPORTS("Sports", 599.00),
		LIFTED("Lifted", 699.00),
		NONE("None", 0.00),
	}
	
	//	Hood Color Enums
	public static enum HoodColor
	{
		RED, 
		BLUE, 
		BLACK, 
		SILVER, 
		GREEN, 
		YELLOW,
	}
	
	// Declared Objects
	private HoodType hoodType;
	private HoodColor hoodColor;
	double hoodPrice;
	
	// Hood constructors
	public Hood (HoodType hoodType, HoodColor hoodColor)
	{
		this.hoodType = hoodType;
		this.hoodColor = hoodColor;
	}
	
	public HoodType(String hoodType, double hoodPrice)
	{
		this.hoodType = hoodType;
		this.hoodPrice = hoodPrice;
	}

	//	Setters
	public void setHoodType(HoodType hoodType)
	{
		this.hoodType = hoodType;
	}
	
	public void setHoodColor(HoodColor hoodColor)
	{
		this.hoodColor = hoodColor;
	}
	
	//	Getters
	public HoodType getHoodType()
	{
		return this.hoodType;
	}
	
	public HoodColor getHoodColor()
	{
		return this.hoodColor;
	}

	//	toString
    public String toString()
    {
    	return this.hoodType + " " + this.hoodColor;
    }

}
