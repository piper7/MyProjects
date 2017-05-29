/* File name : AbstractDemo.java 
 * This is my Driver */

public class AbstractDemo {

	public static void main(String[] args) {
		Salary s = new Salary("Bill Lloyd", "Miami, FL", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		s.mailCheck();
		System.out.println("\n Call meailCheck using Employee---");
		e.mailCheck();

	}

}
