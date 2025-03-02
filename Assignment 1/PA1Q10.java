package assignment1;
import java.util.*;
public class PA1Q10 {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i =0; i<m.length;i++) {		
		sum+=m[i][columnIndex];  	
		}   
		return sum;   
		} 
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter number of Rows and Columns of 2D-Array: ");
	    int r = sc.nextInt();
	    int c = sc.nextInt();
	    double[][] arr= new double[r][c];   
	    System.out.print("Enter a 3-by-4 matrix row by row: ");
		for(int i =0; i<r;i++) {
		for(int j =0; j<c;j++) { 
		arr[i][j]=sc.nextDouble(); 
		} 
		}
	    System.out.println("The elements of 2D array are: ");
	    for(int i =0; i<r;i++) {
	    for(int j =0; j<c;j++) { 
	    System.out.print(arr[i][j]+" ");
	    }
	    System.out.println();
	    } 
	    for(int j =0; j<c;j++) { 
	    double sum = sumColumn(arr,j);
	    System.out.println("Sum of the elements at column "+j+" is "+sum);
	    }
		}	
	} 