package ExamInfo;
import java.util.*;
public class Test extends Student { 
	public int Mark1; 
	public int Mark2;
	public void inputDetails() {
		super.inputDetails();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of the Student: "); 
		int x = sc.nextInt();int n = sc.nextInt();		
		Mark1 = x;Mark2 = n; 		
	}
	public void showDetails() {
		super.showDetails();
		System.out.println("Marks in 1st Subject: "+Mark1);
		System.out.println("Marks in 2nd Subject: "+Mark2); 
	}
}
