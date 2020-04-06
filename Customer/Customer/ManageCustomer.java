public class ManageCustomer {

	public static void main(String[] args) {
		
		//	First Customer	
		HoodType customer1HoodType = HoodType.Lifted;
		HoodColor customer1HoodColor = HoodColor.Silver;
		FenderType customer1FenderType = FenderType.CarbonFiber;
		FenderColor customer1FenderColor = FenderColor.Black;
		DoorColor customer1DoorColor = DoorColor.Black;
		Wheelset customer1Wheelset = WheelsetType.PaintCoated;
		
		Vehicle vehicle1 = new Vehicle("Tesla", "Model 3", "2019", customer1HoodType, customer1HoodColor, customer1FenderType, customer1FenderColor, customer1DoorColor, customer1Wheelset);
		Address custAddr1 = new Address("12345 Good Ave Number 1", "Hastings", "MN", "55022");
		
		Customer customer1 = new Customer (“Syed”, “Ali”, “Naqvi”, custAddr1, vehicle1);
		
		// Second Customer
		HoodType customer2HoodType = HoodType.Lifted;
		HoodColor customer2HoodColor = HoodColor.Silver;
		FenderType customer2FenderType = FenderType.CarbonFiber;
		FenderColor customer2FenderColor = FenderColor.Black;
		DoorColor customer2DoorColor = DoorColor.Yellow;
		Wheelset customer1Wheelset = WheelsetType.PowderCoated;
		
		Vehicle vehicle2 = new Vehicle("Ford", "F150", "2016", customer2HoodType, customer2HoodColor, customer2FenderType, customer2FenderColor, customer2DoorColor, customer2Wheelset);
		Address custAddr2 = new Address(“499 Apple Street”, “Eagan”, “MN”, 55123);

		Customer customer2 = new Customer (“Gloria”, “J”, “Redford”, custAddr2, vehicle2);
		
		customer1.PrintCustomerInfo();
		customer1.PrintVehicleInfo();
		//Double customer1Price = Customer1.getTotalPrice();
		
		customer2.PrintCustomerInfo();
		customer2.PrintVehicleInfo();
		//Double customer2Price = Customer1.getTotalPrice();
	}

}
