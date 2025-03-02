package assignment1;
import java.util.*;
public class PA1Q4 { 

	private static void Permutation(char[] a, int s, int e){
	if (s == e) {
	System.out.println(new String(a));
	}
	else{
	for (int i = s; i< e; i++){
	swap(a, s, i);
	Permutation(a, s + 1, e);
	swap(a, s, i);
	}
	}
	}
	private static void swap(char[] a, int i, int x){
	char t = a[i];
	a[i] = a[x];
	a[x] = t;
	}
	public static void main(String[] args){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("For 6 characters 'C', 'A', 'R','B', 'O', and 'N', the possible strings are: ");
	char a[] ={'C','A','R','B','O','N'};
	Permutation(a, 0, a.length);
	}
	}
