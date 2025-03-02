package assignment3;
import java.util.*; 
public class PA3HWQ2 {
	public static void BinarySearch(int arr[], int item, int start, int end){
	int mid = (start+end)/2;
	if(start>end) {
	System.out.println("Search element not found");
	}
	else if(arr[mid] == item) {
	System.out.println("Search element found");
	}
	else if(arr[mid]>item) {
	BinarySearch(arr, item,start, mid-1);
	}
	else {
	BinarySearch(arr, item, mid+1,end);
	}
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array elements are: ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.print("\nEnter search element: "); 
		int s = sc.nextInt();		
		BinarySearch(arr,s,0,arr.length-1);
	} 
} 
