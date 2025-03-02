package ExamInfo;
import java.util.*;
public class Student {
	public String Name; 
	public int Roll;
	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and roll-number of the Student: ");
		String x = sc.next();
		int n = sc.nextInt();
		Name = x; Roll = n;		
	}
	public void showDetails() {
		System.out.println("Name of the Student is "+Name);
		System.out.println("Roll-Number: "+Roll);
	}

}
