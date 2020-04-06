import java.text.NumberFormat;

public class Vehicle {
	
	private String vehicleMake;
	private String vehicleModel;
	private String year;
	private Hood h;
	private Fender f;
	private Door d;
	private Wheelset ws;

	public Vehicle (String vehicleMake, String vehicleModel, String year, Hood h, Fender f, Door d, Wheelset ws)
	{
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.year = year;
		this.h = h;
		this.f = f;
		this.d = d;
		this.ws = ws;
	}

	public double getTotalPrice()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

	    return fmt.format(TotalPrice);
	}
	
    public String PrintVehicleInfo()
    {
    	String result = ("Vehicle Make: " + vehicleMake + "\n" +
    	"Vehicle Model :" + vehicleModel + "\n" +
    	"Year: " + year + "\n" +
    	"Hood: " + h.getHoodType() + " in " + h.getHoodColor() + " color, " + "Price: " + h.getHoodPrice() + "\n" + 
    	"Fender: " + f.getFenderType() + " in " f.getFenderColor() + " color, " + "Price: " + f.getFenderPrice() + "\n" +
    	"Doors: " + d.getDoorColor() + " color, " + "Price: " + d.getDoorPrice() + "\n" + 
    	"Wheelset: " + ws.getWheelsetType() + ", " + "Price: " + ws.getWheelsetPrice());
    
    	return result;
    }
}
