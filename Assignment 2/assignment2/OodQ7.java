package assignment2;
import java.util.*;
interface DetailInfo{
	public void Display();
	public void Count(); 
}
class Sperson implements DetailInfo{
	public static int maxCount;
	String Name;	 	
	public Sperson(String name) {
		Name = name;
	}
	public void Count() {
		maxCount = this.Name.length();		
	}
    public void Display() {
		System.out.println("Total no. of charcters used in the name "+this.Name+" is "+maxCount+".");
	}
}
public class OodQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the person: ");
		String Name = sc.next();
	Sperson Shakeel = new Sperson(Name);
	Shakeel.Count();
	Shakeel.Display();
	}
}
