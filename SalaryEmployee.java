
public class SalaryEmployee extends Employee 

{
 
	
	private double salary;
	private String dateOfHire;
	
	public SalaryEmployee(double sal, String doh, String fn, String ln, String sn, String a, String c, String s, String z, String id) 
	
	
	{
		super(fn,ln,sn,a,c,s,z, id);
		salary = sal;
		dateOfHire = doh;
		
	}
	
	public SalaryEmployee(String et, String fn, String ln, String sn, String a, String c, String s, String z, double p)
	
	{
		super(et,fn,ln,sn,a,c,s,z,p);
	}
	
	
	public String getdateOfHire()
	
	{
		return dateOfHire;
	}
	
	public SalaryEmployee(String p)
	{
		super(p);
	
	}
	
	//this method allows you to change an emloyee's salary
	public void setsalary(double salary)
	
		{
		this.salary = salary;
		}
	
	
	public double pay()	
		
		{
		//Returns pay for the pay period. Pay period is biweekly.
		double payValue;
		payValue = salary/24;
	
		
		return payValue;
	}
	
	
		public String toString()
		
		{
			return "Name: " + getName() + " " +
					"\n" + "Address: " + getAddress() + " " +
					"\n" + "SSN:" + getSSN()+
					"\n" + "Pay:";
		
		}

				
}