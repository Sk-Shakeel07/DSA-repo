package assignment3;
import java.util.*; 
public class PA3HWQ7 {
	public static int[] swap(int arr[], int start, int end, int item){
	if(start>end) {
	return arr;
	}
	else if(arr[start]<=item) {
	return swap(arr, ++start, end, item);
	}
	else if(arr[end]>item) {
	return swap(arr, start, --end, item);
	}
	else{
	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	return swap(arr, ++start, --end, item);
	} 
	}
	public static void display(int arr[]){
	for(int i = 0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
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
		System.out.print("\nEnter pivot element: "); 
		int s = sc.nextInt();		
		arr = swap(arr,0,arr.length-1,s);
		display(arr);
	} 
}
