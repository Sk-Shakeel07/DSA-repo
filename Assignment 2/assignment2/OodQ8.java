package assignment2;
import ExamInfo.*;import SportsInfo.*;
public class OodQ8 extends Test implements Sports{
 
	public static void main(String[] args) {
		OodQ8 obj = new OodQ8();
		obj.inputDetails();obj.showDetails();
		System.out.println("Total marks of the Student is "+(obj.Mark1+obj.Mark2));
		System.out.println("Score secured in Sports:\nCricket "+obj.Score1+"\nBadminton "+obj.Score2);
	}

}
