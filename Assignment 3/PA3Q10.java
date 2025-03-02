package assignment3;
import java.util.*;
public class PA3Q10 {
	 public static int fibonacci(int n) {
		 if(n==1 || n==0){
	        return n;
	        }
	        else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }
     public static void main(String[] args) {  	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter no. of terms: ");
	 int n =sc.nextInt();  
	 System.out.println("Fibonacci Sequence:");
     for (int i = 0; i < n; i++) {
     System.out.print(fibonacci(i) + " "); 
  }
}
}
 