package assignment3;
import java.util.*;
public class PA3Q1 {
	int x;
	public void Input(int x){
		this.x=x;
		if(x<0) {
			throw new NumberFormatException("You entered negative number!");
		}
		else {
			System.out.println("Your Lucky number is "+this.x);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PA3Q1 obj = new PA3Q1(); 
		System.out.print("Enter your Lucky number: ");
		int n = sc.nextInt();
		try {
			obj.Input(n);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
