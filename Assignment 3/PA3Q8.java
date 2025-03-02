package assignment3;
import java.util.*;
public class PA3Q8 {
	public static int power(int x , int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return x; 
		}
		else if(x==0){
			return 0;
		}
		else {
			return x*power(x,n-1);
		}
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		int x = sc.nextInt();
		System.out.print("Enter power: ");
		int n = sc.nextInt();
		int r = power(x,n);
		System.out.println(x+" to the power "+n+" = "+r);
	}
}

