package assignment2;
class PointType{
double x,y;
PointType(double x, double y){
this.x = x;
this.y = y;
} 
void setCoordinates(double x, double y) {
	this.x=x;
	this.y=y;
}
void printCoordinates(){
	System.out.println("(" + this.x + "," + this.y + ")");
}
double x() {
	return this.x;
}
double y() {
	return this.y;
}
}
class CircleType extends PointType{
private double radius;
public CircleType(double x, double y, double radius){
super(x, y);
this.radius = radius;
} 
void setRadius(double radius) {
	this.radius=radius;
}
void printRadius(){
	System.out.println("Radius is: " + this.radius);
}
double getArea(){
	return Math.PI *Math.pow(this.radius, 2);  
}
double getCircumference(){
	return 2*Math.PI*this.radius;
}
}
public class OodHWQ5 {

	public static void main(String[] args) {
		PointType point = new PointType(1, 2);
		System.out.print("Point: ");
		point.printCoordinates();
		point.setCoordinates (8, 9);
		System.out.print("Now the point is: ");
		System.out.println("("+point.x() + "," + point.y()+")");
		CircleType circle = new CircleType(1, 2, 5);
		circle.printRadius();
		circle.setRadius(10);
		System.out.print("Updated ");
		circle.printRadius();
		System.out.print("Circle area is: ");
		System.out.println(circle.getArea());
		System.out.print("Circle Circumference is: ");
		System.out.println(circle.getCircumference()); 
	}
}
