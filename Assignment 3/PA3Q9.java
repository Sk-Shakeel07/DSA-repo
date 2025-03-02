package assignment3;
import java.util.*;
public class PA3Q9 {
	public static int reverse(int n, int rev){
		if(n==0) {
			return rev;
		}
		else{
			rev = rev*10+n%10;
			return reverse(n/10,rev);
		}
	}
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  int n = sc.nextInt();
		  System.out.println("Original number: "+n);
		  System.out.println("Reversed number: " +reverse(n,0));
	    }
	}
 
	 