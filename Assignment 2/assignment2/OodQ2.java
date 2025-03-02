package assignment2;
import java.util.*;
class Complex{
	int real;
	int imag; 
public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real and imaginary value: ");
		this.real=sc.nextInt();
	    this.imag=sc.nextInt(); 
	} 
public void displayData() {	   
		System.out.println(this.real+"+"+this.imag+"i");  
	}
public Complex add(Complex c1, Complex c2) {
	Complex c3 = new Complex();
	c3.real=c1.real+c2.real;
	c3.imag=c1.imag+c2.imag; 
	return c3;  
}
}
public class OodQ2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.setData();c1.displayData();
		Complex c2 = new Complex();
		c2.setData();c2.displayData();
		Complex c3 = new Complex();
		System.out.print("The addition of the two complex number is ");
		c3=c3.add(c1, c2);c3.displayData(); 
	}

}
