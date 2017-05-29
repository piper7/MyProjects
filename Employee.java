
// File name " Employee.java
public abstract class Employee {
	private String name;
	private String address;
	private int number;
	
	//Constructor
	public Employee(String name, String address, int number){
		System.out.print("Constructing an Employee\n");
		this.name = name;
		this.address = address;
		this.number = number;		
	}
	
	public double computePay(){
		
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	
	public void mailCheck(){
		
		System.out.println("Mailing a check to " + this.name + " " + this.address);				
	}
	
	public String toString (){
		
		return name + "" + address + "" + number;		
	}
	
	// method
	public String getName(){
		
		return name;
	}
	
	//method
	public String getAddress(){
		
		return address;
	}
	
	public void setAddress(String newAddress){
		
		address = newAddress;		
	}
	
	public int getNumber(){
		
		return number;
	}
}
