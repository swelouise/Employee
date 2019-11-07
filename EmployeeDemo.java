
public class EmployeeDemo 

{
	
		public static void main(String[] args)
		{
	
		
	  HourlyEmployee hourlyEmployee1;
	  HourlyEmployee hourlyEmployee2;
	  SalaryEmployee salaryEmployee1;
	 
	  									  
	  hourlyEmployee1 = new HourlyEmployee("March 12,2016", 20.50, 47.5, "Jamie", "Thompson", "849-44-4545", "187 Sea St", "San Fransico", "Ca", "60897", "689");
	  hourlyEmployee2 = new HourlyEmployee("May 3,2012", 14.75, 30.2, "Tommy", "Johnson", "893-43-4343", "2233 Blue Bird Lane", "San Fransico", "Ca", "90210", "899"); 
	  
	  salaryEmployee1 = new SalaryEmployee(80000.00, "October 15, 2001", "Jessie", "Jackson", "983-87-34345", "900 E 5th Street", "San Fransico", "Ca", "69083", "555"); 
	
	 
	System.out.println(hourlyEmployee1.getName()+ " " + hourlyEmployee2.getName() + " " + salaryEmployee1.getName());
	
	System.out.println(hourlyEmployee1.pay());
	System.out.println(hourlyEmployee2.pay());
	System.out.println(salaryEmployee1.pay());
	
	hourlyEmployee1.setphoneNumber("513-242-4242");
	
	hourlyEmployee2.sethourlyRate(15.00);
	System.out.println(hourlyEmployee2.pay());
	
	System.out.println(hourlyEmployee1.getphoneNumber());
	System.out.println(hourlyEmployee2);
	System.out.println(salaryEmployee1.getDOB());
	System.out.println(hourlyEmployee2.getdateOfHire());
	System.out.println(salaryEmployee1.getemployeeId());
	
	salaryEmployee1.setsalary(100000.00);
	System.out.println(salaryEmployee1.pay());
	
	if(hourlyEmployee1.equals(hourlyEmployee2))
			System.out.println("Entry Not Valid");
			else	
				System.out.println("Input Recieved");
	
	 hourlyEmployee1 = new HourlyEmployee("March 12,2016", 20.50, 47.5, "Jamie", "Thompson", "893-43-4343","187 Sea St","San Fransico","Ca", "60897", "899");
	 hourlyEmployee2 = new HourlyEmployee("May 3,2012", 14.75, 30.2, "Tommy", "Johnson", "893-43-4343", "2233 Blue Bird Lane", "San Fransico", "Ca", "90210", "899"); 
	  
		if(hourlyEmployee1.equals(hourlyEmployee2))
			System.out.println("Entry Not Valid");
			else	
				System.out.println("Input Recieved");
		
		
	}
		
		
 
}