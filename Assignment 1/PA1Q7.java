package assignment1;
import java.util.*;
public class PA1Q7 {
	public static void findMax(int brr[]) {
	int Max=Integer.MIN_VALUE;
	int c = 0;
	int pos = -1;
	for(int i =0; i<brr.length;i++) {
	if(Max<brr[i]) {
	Max = brr[i];
	c=1;
	pos = i+1;
	}
	else if(Max==brr[i]) {
	c++;
	}
	}
	System.out.println("\nMaximum element of Array is "+Max+" and occurs "+c+" times.");
	System.out.print("First occurrence of maximum element is at position "+pos+".");
	}
	public static void findMin(int crr[]) {
		int Min=Integer.MAX_VALUE;
		int c = 0;
		int pos = -1;
		for(int i =0; i<crr.length;i++) {
		if(Min>crr[i]) {
		Min = crr[i];
		c=1;
		pos = i+1;
		}
		else if(Min==crr[i]) {
		c++; 
		pos=i+1;
		}
		}
		System.out.println("\nMinimum element of Array is "+Min+" and occurs "+c+" times.");
		System.out.println("Last occurrence of minimum element is at position "+pos+".");
		}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int n = sc.nextInt();
	int arr[]= new int[n];
	System.out.print("Enter array elements: ");
	for(int i =0; i<n;i++) {
	arr[i]=sc.nextInt();
	}
    System.out.print("Array elements are: "); 
    for(int i =0; i<n;i++) {
    System.out.print(arr[i]+" ");
    }
    findMax(arr);
    findMin(arr);
	}

}
