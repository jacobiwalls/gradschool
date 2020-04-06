
public class Fender 

{
	private static enum FenderType {Regular, Sports, CarbonFiber}

	private static enum FenderColor {Red, Blue, Black, Silver, Green, Yellow}

	//	Fender Prices
	private String fenderPrice;
	private static double  fenderPriceRegular = 100.00;
	private static double fenderPriceSports = 200.00;
	private static double fenderPriceCarbonFiber = 1000.00;
	
	//	Get Fender Types
	public enum getFenderTypeR()
	{
		return FenderType.Regular;
	}
	
	public enum getFenderTypeS()
	{
		return FenderType.Sports;
	}
	
	public enum getFenderTypeC()
	{
		return FenderType.CarbonFiber;
	}
	
	// Get Fender Color
	public enum  getFenderColorRed()
	{
		return FenderColor.Red;
	}
	
	public enum  getFenderColorBlue()
	{
		return FenderColor.Blue;
	}
	
	public enum  getFenderColorBlack()
	{
		return FenderColor.Black;
	}
	
	public enum  getFenderColorSilver()
	{
		return FenderColor.Silver;
	}
	
	public enum  getFenderColorGreen()
	{
		return FenderColor.Green;
	}
	
	public enum  getFenderColorYellow()
	{
		return FenderColor.Yellow;
	}
	
	// Get Fender Price
	double getFenderPrice()
	
	//	setFenderType(enum )
	//	setFenderColor(enum Color)
	 

    public String toString()
    {
    	return // I have been stumped on how to return a single value for a dynamic input variable
    }
}
