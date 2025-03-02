package assignment2;
import java.util.*;
class Person{
	String name;
	int age;
public void setData() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter name and age: ");
	this.name=sc.next();
    this.age=sc.nextInt();
} 
public void displayData() {
	System.out.println("Operator name: "+this.name+" and age: "+this.age);  
}
}
public class OodQ1 {

	public static void main(String[] args) {
	Person p = new Person();
	p.setData();p.displayData();
	Person q = new Person();
    q.setData();q.displayData();
    if(p.age>q.age) {
    System.out.println(q.name+" is younger.");
    }
    else {
    System.out.println(p.name+" is younger.");
    }
	}
}
