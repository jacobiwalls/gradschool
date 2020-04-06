
public class Hood 

{
	//	Hood Types
	private static enum HoodType {Regular, Sports, Lifted, None}

	
	//	Hood Colors
	private static enum HoodColor {Red, Blue, Black, Silver, Green, Yellow}
	
	//	Hood Prices
	private String hoodPrice;
	private static double  hoodPriceRegular = 499.00;
	private static double hoodPriceSports = 599.00;
	private static double hoodPriceLifted = 699.00;
	private static double hoodPriceNone = 0.00;

	// Get Hood Type
	public enum getHoodTypeR()
	{
		return HoodType.Regular; // Need to invoke an If statement to make this work..
	}
	
	public enum getHoodTypeS()
	{
		return HoodType.Sports;
	}
	
	public enum getHoodTypeL()
	{
		return HoodType.Lifted;
	}
	
	public enum getHoodTypeN()
	{
		return HoodType.None;
	}
	
	// Get Hood Color
	public enum getHoodColorRed()
	{
		return HoodColor.Red;
	}
	
	public enum getHoodColorBlue()
	{
		return HoodColor.Blue;
	}
	
	public enum getColorBlack()
	{
		return HoodColor.Black;
	}
	
	public enum getColorSilver()
	{
		return HoodColor.Silver;
	}
	
	public enum getColorGreen()
	{
		return HoodColor.Green;
	}
	
	public enum getColorYellow()
	{
		return HoodColor.Yellow;
	}
	
	// Get Hood Price
	public double getHoodPriceR()
	{
		return hoodPriceRegular;
	}
	
	public double getHoodPriceS()
	{
		return hoodPriceSports;
	}
	
	public double getHoodPriceL()
	{
		return hoodPriceLifted;
	}
	
	public double getHoodPriceN()
	{
		return hoodPriceNone;
	}

	// public setHoodColor(enum hoodColor)

	// public setHoodType(enum) 

    public String toString()
    {
    	return // I have been stumped on how to return a single value for a dynamic input variable
    }

}
