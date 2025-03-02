package assignment3;
import java.util.*;
public class PA3Q7 {
	public static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
		return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("The factorial of "+n+" is "+fact(n)+"."); 
	}
}

	


