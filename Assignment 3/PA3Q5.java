package assignment3;

public class PA3Q5 {
	public static <T> void Display(T[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		PA3Q5 a = new PA3Q5(); 		
		Integer arr[]= {5,50,10,25};	
		String str[]= {"Btech","CSE","AIMl","DSA"};	
		Double brr[]= {1.2,10.6,5.7,9.8};
		a.Display(arr);System.out.println();
		a.Display(str);System.out.println();
		a.Display(brr);
	}
}
