package assignment1;
import java.util.*;
public class PA1HWQ1 {  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st integer : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd integer : ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd integer : ");
		int c = sc.nextInt(); 
		if(a+b==c) {
		System.out.println("The equation forms using these numbers: "+a+" + "+b+" = "+c);
		}
		else if(a==b-c) {  
		System.out.println("The equation forms using these numbers: "+a+" = "+b+" - "+c);
		}
		else if(a*b==c) {
		System.out.println("The equation forms using these numbers: "+a+" * "+b+" = "+c);
		}
		else {
		System.out.println("These numbers cannot be used in correct arithmetic formula.");		
	}
	}
}
 