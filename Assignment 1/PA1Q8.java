package assignment1;
import java.util.*;
public class PA1Q8 {
	public static void sum(int brr[][]) {
	int sum = 0;
	for(int i =0; i<brr.length;i++) {
	for(int j =0; j<brr[0].length;j++) { 
	sum+=brr[i][j];
	}
	}
	System.out.println("The sum of elements of the 2D-Array is "+sum);
	} 

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Rows and Columns of 2D-Array: ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int arr[][]= new int[r][c];
    System.out.print("Enter elements of 2D-Array: ");
	for(int i =0; i<r;i++) {
	for(int j =0; j<c;j++) { 
	arr[i][j]=sc.nextInt(); 
	}
	}
    System.out.println("The elements of 2D array are: ");
    for(int i =0; i<r;i++) {
    for(int j =0; j<c;j++) { 
    System.out.print(arr[i][j]+" ");
    }
    System.out.println();
    } 
    sum(arr);
	}	
}
