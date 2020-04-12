
public class ManageCustomer {

	public static void main(String[] args) {
		
		//	First Customer - Instantiated Objects
		Hood customer1Hood = new Hood(Hood.HoodType.Lifted, Hood.HoodColor.Silver);
		Fender customer1Fender = new Fender(Fender.FenderType.CarbonFiber, Fender.FenderColor.Black);
		Door customer1Door = new Door(Door.DoorColor.Black);
		Wheelset customer1Wheelset = new Wheelset(Wheelset.WheelsetType.POWDERCOATED);
		
		//	Constructor Calls
		Vehicle vehicle1 = new Vehicle("Tesla", "Model 3", "2019", customer1Hood, customer1Fender, customer1Door, customer1Wheelset);
		Address custAddr1 = new Address("12345 Good Ave Number 1", "Hastings", "MN", "55022");
		
		Customer customer1 = new Customer (“Syed”, “Ali”, “Naqvi”, custAddr1, vehicle1);
		
		// Second Customer - Instantiated Objects
		Hood customer2Hood = new Hood("Lifted", "Silver");
		Fender customer2Fender = new Fender("CarbonFiber", "Black");
		Door customer2Door = new Door("Yellow");
		Wheelset customer2Wheelset = new Wheelset("PowderCoated");
		
		//	Constructor Calls
		Vehicle vehicle2 = new Vehicle("Ford", "F150", "2016", customer2Hood, customer2Fender, customer2Door, customer2Wheelset);
		Address custAddr2 = new Address(“499 Apple Street”, “Eagan”, “MN”, "55123");

		Customer customer2 = new Customer (“Gloria”, “J”, “Redford”, custAddr2, vehicle2);
		
		//	First Customer Print
		customer1.PrintCustomerInfo();
		customer1.PrintVehicleInfo();
		//Double customer1Price = Customer1.getTotalPrice();
		
		//	Second Customer Print
		customer2.PrintCustomerInfo();
		customer2.PrintVehicleInfo();
		//Double customer2Price = Customer1.getTotalPrice();
	}

}
