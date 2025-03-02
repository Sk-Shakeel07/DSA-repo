package assignment1;
import java.util.*;
public class PA1Q5 {
	public static int sum_Of_Digits(int n) {
	int sum = 0;
	while(n!=0) {
	int r=n%10;
	sum+=r;
	n=n/10;
	}
	return sum;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int n1=n;
    if(sum_Of_Digits(n)>9) {
    n = sum_Of_Digits(n);
    }
    System.out.println("Sum of digits of "+n1+" until the number is a single digit is "+sum_Of_Digits(n));
	} 
}
