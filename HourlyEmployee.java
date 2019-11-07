
public class HourlyEmployee extends Employee

{
	private String dateOfHire;
	private double hourlyRate;
	private double hoursWorked;
	private double overTime;
	
	
	
	public HourlyEmployee(String doh, double hr, double hw, String fn, String ln, String sn, String a, String c, String s, String z, String id) 
	
		{
		
		   	super(fn,ln,sn,a,c,s,z, id);
		   	dateOfHire = doh;
			hourlyRate = hr;
			hoursWorked = hw;
		 
		}
	public HourlyEmployee(String et, String fn, String ln, String sn, String a, String c, String s, String z, double p)
	
	{
		super(et,fn,ln,sn,a,c,s,z,p);
	}
	
	
	public String getdateOfHire()
	
		{
			return dateOfHire;
		}
	public HourlyEmployee(String p)
	
		{
		super(p);
		}
	//this method allows you to change an employee's hourly rate
	public void sethourlyRate(double hourlyRate)
	
		{
		this.hourlyRate = hourlyRate;
		}
	
	public double pay()
	
	{	double payValue;
		if (hoursWorked > 40)
		
		{
			overTime = hoursWorked - 40;
			payValue = (40 * hourlyRate) + (overTime) * (hourlyRate + (hourlyRate * .5));
		}
	
	else 
		
		{
		 payValue = hoursWorked * hourlyRate;
		}
	
	return payValue;
		}
	
	public String toString()
	
	
	{
		return "Name: " + getName() + " " +
				"\n" + "Address: " + getAddress() + 
				"\n" + "SSN:" + getSSN()+
				"\n" + "Pay: ";
	}
	
	
	

}
	 
