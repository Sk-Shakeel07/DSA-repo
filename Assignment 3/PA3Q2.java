package assignment3;

public class PA3Q2 {
	public void Insert(String Color[])throws ArrayIndexOutOfBoundsException{
		Color[Color.length]="Blue";
	}
	public void STR_TO_INT() {
		throw new NumberFormatException("Wait!..Can't convert String to Integer");
	}
	public void Display(String Colors[]) {
		System.out.print("Selected colors are: ");
		for(int i=0;i<Colors.length;i++) {
			System.out.print(Colors[i]+" "); 
		}
	}
	public static void main(String[] args) {
		String Colors[]= {"Red","Green","Purple","Black"};
		PA3Q2 obj = new PA3Q2();
		obj.Display(Colors);
		try {
			obj.Insert(Colors);
		}
		catch(Exception e) {
			System.out.println("\nError: "+e);
		}
		try {
			obj.STR_TO_INT();
		}
		catch(Exception e) {
			System.out.println("Error: "+e); 
		}
	}
}
