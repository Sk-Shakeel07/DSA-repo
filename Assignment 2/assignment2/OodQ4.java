package assignment2;
import java.util.*;
class Deposit{
	 long Principal;
	int Time;
	 double Rate;
	 double TotalAmt;
public Deposit() {}
public Deposit(long principal, double rate, int time) {
		this.Principal = principal;
		this.Time = time;
		this.Rate = rate;		
	}
public Deposit(long principal, int time) {
	this.Principal = principal;
	this.Time = time;
	this.Rate = 5;
	}
public Deposit(long principal, double rate) {
	this.Principal = principal;
	this.Rate = rate;  
	this.Time = 2;
	} 
public double calcAmt() {return this.TotalAmt = ((this.Principal*this.Rate*this.Time)/100)+this.Principal;} 
public void displayData() {	   
	System.out.println("Principle: "+this.Principal);  
	System.out.println("Rate: "+this.Rate);
	System.out.println("Time: "+this.Time);
	System.out.println("Total amount,the person will pay is Rs"+calcAmt()+" only.");
}
} 
public class OodQ4 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Principle/Rate/Time: ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt(); 
	Deposit d = new Deposit(x,y,z);
	d.displayData();
	}

}
