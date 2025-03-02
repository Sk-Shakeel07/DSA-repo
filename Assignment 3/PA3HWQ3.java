package assignment3;
import java.util.*;
public class PA3HWQ3 {
	public static int BtoD(int n){
	if(n<2) {
	return n;
	}
	else {
	return (n%2)+10*BtoD(n/2);  
	}
	}

	public static void main(String[] args) {   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print("Binary conversion of "+n+" is "+BtoD(n)); 
	}
}
