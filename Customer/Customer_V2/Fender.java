
public class Fender 

{
	//	Enums
	private static enum FenderType 
	{
		REGULAR("Regular", 100.00),
		SPORTS("Sports", 200.00),
		CARBONFIBER("CarbonFiber", 1000.00),
	}
	
	private static enum FenderColor 
	{
		RED, 
		BLUE, 
		BLACK, 
		SILVER, 
		GREEN, 
		YELLOW,
	}
	
	//	Declared Objects
	FenderType fenderType;
	FenderColor fenderColor;
	double fenderPrice;
	
	//	Constructors
	public Fender(FenderType fenderType, FenderColor fenderColor)
	{
		this.fenderType = fenderType;
		this.fenderColor = fenderColor;
	}
	
	public FenderType(String fenderType, double fenderPrice)
	{
		this.fenderType = fenderType;
		this.fenderPrice = federPrice;
	}
	
	//	Setters
	public void setFenderType(FenderType fenderType)
	{
		this.fenderType = fenderType;
	}
	
	public void setFenderColor(FenderColor fenderColor)
	{
		this.fenderColor = fenderColor;
	}
	
	// Getters
	public FenderType getFenderType()
	{
		return this.fenderType;
	}
	
	public FenderColor getFenderColor()
	{
		return this.fenderColor;
	}

	// toString
    public String toString()
    {
    	return this.fenderType + " " + this.fenderColor;
    }
}
