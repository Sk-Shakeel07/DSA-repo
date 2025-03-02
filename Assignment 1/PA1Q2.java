package assignment1;
import java.util.*;
public class PA1Q2 {
	public static double calculateBMI(double h,double w) {
	double BMI = w/Math.pow(h, 2);
	return BMI;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter person Weight in kg: ");
	double w = sc.nextDouble();
	System.out.print("Enter height of person in meter: ");
	double h = sc.nextDouble();
	double BMI = calculateBMI(h,w);
	if(BMI<18.5) {
	System.out.println("The person is UnderWeight.");
	}
	else if(BMI>=18.5 && BMI<=24.9) {
	System.out.println("The person is NormalWeight."); 
	}
	else if(BMI>=25.0 && BMI<=29.9) {
	System.out.println("The person is OverWeight."); 
	}
	else {
	System.out.println("The person is Obese.");
	}
	}
	
}
