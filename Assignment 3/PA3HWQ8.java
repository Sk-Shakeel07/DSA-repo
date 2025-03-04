package assignment3;
import java.util.*;
public class PA3HWQ8 {
public static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod){
		if (n == 1){
		System.out.println("Take disk 1 from rod " + from_rod + " to rod " +to_rod);	
		return;
	}
		towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
		System.out.println("Take disk " + n + " from rod " + from_rod + " to rod " +to_rod);
		towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the arbitary value: ");
		int n = sc.nextInt(); 
		towerOfHanoi(n,'A','C','B'); 
	}
}
