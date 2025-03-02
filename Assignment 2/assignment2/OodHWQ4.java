package assignment2;
import java.util.*;
class Distance {
int meters,centimeters;
Distance(int meters, int centimeters){
	if(centimeters>=100) {
		meters+=centimeters/100; 
		centimeters=centimeters%100; 
	}
this.meters = meters;
this.centimeters = centimeters;
}
public void display(){
	System.out.println(meters +"m " + centimeters +"cm ");
}
Distance sum (Distance dl, Distance d2){
int me = dl.meters + d2.meters;
int cm = dl.centimeters + d2.centimeters; 
return new Distance(me, cm);  
}
}
public class OodHWQ4 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Distance: ");
		int x = sc.nextInt();int y = sc.nextInt();
		Distance d1 = new Distance(x,y);
		System.out.print("Enter Second Distance: ");
		int m = sc.nextInt();int n = sc.nextInt();
		Distance d2 = new Distance(m,n);
		System.out.println("Two distances are : ");
		Distance d3 = d1.sum(d1, d2);
		d1.display();d2.display();
		System.out.print("The sum is : ");
		d3.display();
   
	}

}
