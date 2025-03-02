package assignment3;

public class PA3Q6 {
	public static <T> int count(T[] array, T item) {
		int count = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i]==item) {
				count++;
			}
		}
		return count; 
	}
	public static void main(String[] args) {
	    String str[] = {"Shakeel","Likun","Shakeel"};
	    Integer str2[] = {1,2,5,5,7,8,3,6,6,6,5,2};
	    int occurrences = count(str,"Shakeel");
	    int occurrences2 = count(str2,5); 
	    System.out.println("Occurrences of the String: " + occurrences);	    	     
	    System.out.println("Occurrences of the Integer: " + occurrences2); 
	}
}
