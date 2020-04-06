
public class Wheelset 
{
	public Wheelset() // Wheelset constructor should take all as parameters
	
	// Support all listed models listed in the drawing provided above
	private static enum WheelsetType {PowderCoated, PaintCoated, ClearCoated, ChromePlated, BarePolished} 
	{
	WheelsetType pricePwC, pricePtC, priceCC, priceCP, priceBP; // All supported are for $1299.00, and no cost if not selected=$0.00
	
	pricePwC = WheelsetType.PowderCoated;
	pricePtC = WheelsetType.PaintCoated;
	priceCC = WheelsetType.ClearCoated;
	priceCP = WheelsetType.ChromePlated;
	priceBP = WheelsetType.BarePolished;
	}
	
	public String getHoodPrice()
	{	
		switch (hoodPrice)
		{
		case hoodR:
            System.out.println = (hoodPriceRegular);
            break;
		case "hoodS":
            hoodPrice = (hoodPriceSports);
            break;
		case "hoodL":
            hoodPrice = (hoodPriceLifted);
            break;
		case "hoodN":
            hoodPrice = (hoodPriceNone);
            break;
		}
		return hoodPrice;
	}

	enum getWheelsetType()

	setWheelsetType(enum )

    public String toString()
    {
    	return // how to return a single value for a dynamic input variable
    }
}
