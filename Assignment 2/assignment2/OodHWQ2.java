package assignment2;
class Book{
String BName;
int BEdition;
double BPrice;
Book(String BName, int BEdition, double BPrice){
this.BName = BName;
this.BEdition = BEdition;
this.BPrice = BPrice;
}
void display(){
System.out.println(this.BName+"\t" + this.BEdition+"\t"+ this.BPrice);
}
public double getPrice(){
	return this.BPrice;
}
void displaymax(){
System.out.println(this.BName+" Book has maximum price of Rs"+this.BPrice+"/- only.");
}
}
public class OodHWQ2 { 

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books [0] = new Book("JAVA DSA", 6, 799.99); 
		books[1] = new Book("Calculus B", 7, 899.99);
		books [2] = new Book("TechWriting", 4, 1299.99);
		books[3] = new Book("University PHY", 15, 999.99);
		books [4] = new Book("Graph Theory", 2, 759.49);
		System.out.println("Book Name\tEdition\tBook price");
		Book max =books[0];
		for (int i = 0; i < books.length; i++){
		books[i].display();
		if (books[i].getPrice()> max.getPrice()) {
		max =books[i];
		}
		} 
		max.displaymax();
	}
}
