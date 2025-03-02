package assignment3;
import java.util.*;
public class PA3HWQ5 {
	public static String reverse(String S, int index){
	if(index<S.length()) {
	return reverse(S, index+1)+S.charAt(index);
	}
	else {
	return "";
	}
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String S = sc.nextLine();
		System.out.println("Original String: "+S); 
		System.out.println("Reverse is "+reverse(S,0));
	}
}
