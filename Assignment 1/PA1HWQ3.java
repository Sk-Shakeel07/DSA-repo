package assignment1;
import java.util.*; 
public class PA1HWQ3 {     

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the length of the array: ");
		int n=sc.nextInt();     
	    int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.print("Enter elements of array a: ");
		for (int i=0; i<n; i++) {
		a[i]=sc.nextInt();
		}
		System.out.print("Enter elements of array b: ");
		for (int j=0;j<n;j++) {
		b[j]=sc.nextInt();
		}
		System.out.print("Array c of having dot product is: ");
		for (int k=0;k<n; k++){
		c[k]=a[k]*b[k];
		System.out.print(c[k]+" ");
		}
	}
}
