
public abstract class Employee {
	
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String phoneNumber;
		private String DOB;
		private String SSN;
		private String employeeId;
		private String employeeType;
		private double pay;
		
		
		
			public Employee(String fn, String ln, String a, String c, String s, String z, String p, String d, String sn, String id)
			
			{
				firstName = fn;
				lastName = ln;
				address = a;
				city = c;
				state = s;
				zip = z;
				phoneNumber = p;
				DOB = d;
				SSN = sn;
				employeeId = id;
				
			}
			
			
			public Employee(String fn, String ln, String sn, String a, String c, String s, String z, String id)
			
			{
				
				firstName = fn;
				lastName = ln;
				SSN = sn;
				address = a;
				city = c;
				state = s;
				zip = z;
				employeeId = id;
				
			}
			
			public Employee(String et, String fn, String ln, String sn, String a, String c, String s, String z, double p)
				{
				employeeType = et;
				firstName = fn;
				lastName = ln;
				SSN = sn;
				address = a;
				city = c;
				state = s;
				zip = z;
				pay = p;
					
				}
			
			public String getemployeeType()
			{
				return employeeType;
			}
			
			public Employee(String p)
			
			{
				phoneNumber = p;
			}
			public String getName()
			
			{
				return firstName + " " + lastName;
			}
			
			public String getAddress()
			
			{
				return address + "  " + city + ", " + state + " " + " " + zip;
			}
			public void setAddress(String Address)
			{
				this.address = address + "  " + city + ", " + state + " " + " " + zip;
			}
			
			public String getSSN()
			{
				return SSN;
			}
			
			 
			
			public void setphoneNumber(String phoneNumber)
			{
				this.phoneNumber = phoneNumber;
			}
			public String getphoneNumber()
			
			{
				return phoneNumber;
			}
			public String getDOB()
			
			{
				return DOB;
			}
			public String getemployeeId()
			
			{
				return employeeId;
			}
			
			public abstract double pay();
			
			
			public boolean equals(Employee other)
			
			{
				if(employeeId.equals(other.employeeId))
					return true;
				else
					return false;
			}
							
			
			
			public String toString()
			
			{
				return "Name: " + firstName + " " + lastName +
						"\n" + "Address: " + address + " " + city + ", " + state + " " + zip +
						"\n" + "Date of Birth:  " + DOB +
						"\n" + "Social Security: " + SSN +
						"\n" + "Employee ID: " + employeeId;
						
			}
	
			
}
