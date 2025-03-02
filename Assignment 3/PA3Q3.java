package assignment3;
import java.util.*;
class Student {
    int Marks;
    String Name;
    public Student(String name, int marks) throws MarksOutOfBoundException {
        this.Name = name;
        if (marks > 100 || marks < 0) {
            throw new MarksOutOfBoundException("Invalid Marks");
        } else {
            this.Marks = marks;
        }
    }
    public void Display() {
        System.out.println("Student: "+this.Name+" , Marks: "+ this.Marks);
    }
}
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String str) {
        super(str);
    }
}
public class PA3Q3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Name & Marks of the Studemt: ");
    	String x = sc.next();int y = sc.nextInt();
        try { 
            Student Shakeel = new Student(x,y); Shakeel.Display();
        } catch (Exception e) { 
            System.out.println("Error Caught: " +e+"\nMarks should be between 0 and 100!");
        }
    }
}
 