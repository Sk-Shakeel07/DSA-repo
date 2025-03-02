package assignment1;

public class PA1Q1 {

	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	System.out.println("The positive integer greater than 2 from command line argument is "+n);
	if(n>2) {  
	int count = 0;
	while(n>=2) {
	n=n/2;
	count++;
	}
	System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
	}
	else {
	System.out.println("Please enter a input greater than 2!");
	}
	}



}
