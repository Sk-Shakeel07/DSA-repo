package assignment3;
import java.util.*;
public class PA3HWQ1 {
	public static int gcd(int n, int m){
	if(m == 0) {
	return n; 
	}
	else {
	return gcd(m,n%m);
	}  
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n = sc.nextInt();
		System.out.print("Enter the second number: ");
		int m = sc.nextInt();
		System.out.print("GCD between "+n+" and "+m+" is "+gcd(n,m));
	}
}
