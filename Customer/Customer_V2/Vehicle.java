import java.text.NumberFormat;

public class Vehicle {
	
	//	Declared Objects
	private String vehicleMake;
	private String vehicleModel;
	private String year;
	private Hood h;
	private Fender f;
	private Door d;
	private Wheelset ws;

	//	Constructor
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
	
	/**
	//	Getter
	public double getTotalPrice()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

	    return fmt.format(math.sum);
	}
	*/
	
    public void PrintVehicleInfo()
    {
    	System.out.println("Vehicle Make: " + vehicleMake + "\n" +
    	"Vehicle Model :" + vehicleModel + "\n" +
    	"Year: " + year + "\n" +
    	"Hood: " + h.getHoodType() + " in " + h.getHoodColor() + " color, " + "\n" + 
    	"Fender: " + f.getFenderType() + " in " f.getFenderColor() + " color, " + "\n" +
    	"Doors: " + d.getDoorColor() + " color, " + "Price: " + "\n" + 
    	"Wheelset: " + ws.getWheelsetType() + ", ");
    }
}
