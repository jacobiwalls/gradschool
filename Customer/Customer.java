
public class Customer 
{

		private String FirstName;
		private String MiddleName;
		private String LastName;	
		private Address customerAddress;
		private String customerPhone;
		private Vehicle customerVehicle;
		
		//-----------------------------------------------------------------
		//  Customer Constructors
		//-----------------------------------------------------------------
		public Customer(String FirstName, String MiddleName, String LastName, Address customerAddress, String customerPhone, Vehicle customerVehicle)
		{
			this.FirstName = FirstName;
			this.MiddleName = MiddleName;
			this.LastName = LastName;
			this.customerAddress = customerAddress;
			this.customerPhone = customerPhone;
			this.customerVehicle = customerVehicle;
		}
		
		public Customer(String FirstName, String MiddleName, String LastName, Address customerAddress, Vehicle customerVehicle)
		{
			this.FirstName = FirstName;
			this.MiddleName = MiddleName;
			this.LastName = LastName;
			this.customerAddress = customerAddress;
			this.customerVehicle = customerVehicle;
		}
		
		//	Setters
		public void setCustomerFirstName(String FirstName)
		{
		this.FirstName = FirstName;
		}
		
		public void setCustomerMiddleName(String MiddleName)
		{
		this.MiddleName = MiddleName;
		}
		
		public void setCustomerLastName(String LastName)
		{
		this.LastName = LastName;
		}
		
		public void setCustomerPhone(String customerPhone)
		{
		this.customerPhone = customerPhone;
		}
		
		public void setCustomerAddress(Address customerAddress)
		{
		this.customerAddress = customerAddress;
		}
		
		public void setCustomerVehicle(Vehicle customerVehicle)
		{
		this.customerVehicle = customerVehicle;
		}
		
		//	Getters
		
		//	Prints Customer Info
		
		public String PrintCustomerInfo()
		{
		 String result = (FirstName + MiddleName + LastName + "\n" +
		 customerAddress.toString() + "\n" +
		 customerAddress.getCity() + ", " + customerAddress.getState() + ". " + customerAddress.getZip());
		    
		 return result;
		}

}
