package assignment1;
import java.util.*;
public class PA1Q6 {
	public static boolean isOdd(int n) {
	return (n&1)==1; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		if(isOdd(n)) { 
		System.out.println(n+" is  Odd: "+isOdd(n));
		}
		else {
		System.out.println(n+" is  Odd: "+isOdd(n));
	}
}
}
