package assignment2;
import java.util.*;
class Mperson{   
	  String name;
	  int age;
	  public Mperson(String name,int age) {
		  this.name=name;
		  this.age=age;
	  }
}    
class Employee extends Mperson{   
	  int Eid; 
	  double salary;
	  public Employee(String name,int age,int Eid,double salary) {
		  super(name, age);
		  this.Eid=Eid;
		  this.salary=salary;
	  }
      public void empDisplay() {
           System.out.println("Employee ID: " + this.Eid);
           System.out.println("Name: " + this.name);
           System.out.println("Age: " + this.age);
           System.out.println("Salary: Rs" + this.salary+"/-");
      }
}

public class OodQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name/Age/Id/Salary: ");		
		String Name=sc.next();
		int Age=sc.nextInt();
		int eid=sc.nextInt();
		double Salary=sc.nextDouble();
		Employee ob=new Employee(Name,Age,eid,Salary);
		ob.empDisplay();

	}

}
