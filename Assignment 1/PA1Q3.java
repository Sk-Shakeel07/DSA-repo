package assignment1;
import java.util.*;
public class PA1Q3 {
	public static boolean isSPY(int n) {
	int sum = 0 , product = 1;
	while(n!=0) {
	int r=n%10;
	sum+=r;
	product*=r;
	n=n/10;
	}
	return sum==product; 
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
	int n = sc.nextInt();
	if(isSPY(n)) {
	System.out.println(n+" is a SPY number");
	}
	else {
	System.out.println(n+" is not a SPY number");
	}
	}

}
