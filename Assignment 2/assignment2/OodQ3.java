package assignment2;
import java.util.*;
class Product{
	int prodId, price, quantity;
	static int totalPrice;
public Product(int prodId, int price, int quantity) {	
		this.prodId = prodId;
		this.price = price;
		this.quantity = quantity;
		totalPrice+=this.price;
	}
public void displayData() {	   
	System.out.println("ID: "+this.prodId+" Price: "+this.price+" Quantity: "+this.quantity);  
}
}
public class OodQ3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of products: ");
	int n = sc.nextInt();
	Product[] p = new Product[n];
	for(int i=0;i<n;i++) {
		System.out.print("Enter ID/Price/Quantity of product no."+(i+1)+": ");
		int prodId =sc.nextInt();
		int price =sc.nextInt();;
		int quantity = sc.nextInt();
		p[i] = new Product(prodId, price, quantity);
	}
    System.out.println("ID    Price    Quantity");
    for(int i=0;i<n;i++) {
    p[i].displayData();
    }
    System.out.println("Total amount,the person will pay for the purchase is Rs"+Product.totalPrice+" only.");
	}

}
