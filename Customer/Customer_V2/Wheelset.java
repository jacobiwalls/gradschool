import java.util.*;

public class Wheelset 
{
	//	Class Constructor
	public Wheelset()
	{
		
	}
	//	Enums
		public static enum WheelsetType 
	{
	    POWDERCOATED("Powder Coated", 1200.00),

	    PAINTCOATED("Paint Coated", 1200.00),

	    CLEARCOATED("Clear Coated", 1200.00),

	    CHROMEPLATED("Chrome Plated", 1200.00),
			
		BAREPOLISHED("Bare Polished", 1200.00),
	}
		
		// Declared Object
		String wheelsetType;
	    double wheelsetPrice;
	    
	    //	Constructors
	    WheelsetType(String wheelsetType, double wheelsetPrice) //	The WheelsetType enum is made up of a String and a double. This constructor defines that.
	    {
	    	this.wheelsetType = wheelsetType;
	    	this.wheelsetPrice = wheelsetPrice;
	    }
/**
	    public String toString() 
	    {
	        return wheelsetType;
	    }
	
	
	//	Setters
	public void setWheelsetType(WheelsetType wheelsetType)
	{
		this.wheelsetType = wheelsetType;
	}
	
	//	Getters
	public double getPrice()
	{
		return this.price;
	}

	
	/**
	public double getWheelSetPrice()
	{	
		switch (WheelSetType)
		{
		case "PowderCoated":
            System.out.println = (wheelsetPrice);
            break;
		case "PaintCoated":
            hoodPrice = (wheelsetPrice);
            break;
		case "ClearCoated":
            hoodPrice = (wheelsetPrice);
            break;
		case "ChromePlated":
            hoodPrice = (wheelsetPrice);
            break;
		case "BarePolished":
            hoodPrice = (wheelsetPrice);
            break;
		}
		return WheelSetPrice;
	}

	
	Map<WheelsetType, Float> wheelPriceMap = new HashMap<>();
	wheelPriceMap.put(WheelsetType.PowderCoated, new Float(1200.00));
	wheelPriceMap.put(WheelsetType.PaintCoated, new Float(1200.00));
	wheelPriceMap.put(WheelsetType.ClearCoated, new Float(1200.00));
	wheelPriceMap.put(WheelsetType.ChromePlated, new Float(1200.00));
	wheelPriceMap.put(WheelsetType.BarePolished, new Float(1200.00));
	
	double PowderCoated = .get(PowderCoated);
	System.out.println("PowderCoated: " + PowderCoated);
	
	//	toString
    public String toString()
    {
    	return this.wheelsetType + " " + getWheelSetPrice; // Need to create price map
    }
    */
}
