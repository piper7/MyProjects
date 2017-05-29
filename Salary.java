// File name : Salary.java

public class Salary extends Employee{
	
	private double salary; // Annual salary
	
	//Constructor
	public Salary(String name, String address, int number, double salary){
		
		super(name, address, number);
		setSalary(salary); // constructor
	}

	//methods
	
	public void mailChck(){
		
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mail check to " + getName() + " with salary " + salary);
	}
	
	public double getSalary(){
		
		return salary;
	}
	
	public void setSalary (double newSalary){
		
		if(newSalary >= 0.0)
			salary = newSalary;
	}
}
