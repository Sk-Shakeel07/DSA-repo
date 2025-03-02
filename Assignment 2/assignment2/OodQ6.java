package assignment2;
abstract class Marks{
	int markICP,markDSA;
	double percentage;
	public Marks(int markICP, int markDSA) {
		this.markICP = markICP;
		this.markDSA = markDSA;		 
	}
	abstract void getPercentage();	
}
class CSE extends Marks{
    int algoDesign;
	public CSE(int markICP, int markDSA, int algoDesign) {
		super(markICP, markDSA);
		this.algoDesign = algoDesign;
	}
	public void getPercentage() {
		this.percentage=(this.markICP+this.markDSA+this.algoDesign)/3.0;
	System.out.println("Percentage of CSE student: "+this.percentage+"%");	 
	}	
}
class NonCSE extends Marks{
	int enggMechanics;	
	public NonCSE(int markICP, int markDSA, int enggMechanics) {
		super(markICP, markDSA);
		this.enggMechanics = enggMechanics;
	}
	void getPercentage() {
	this.percentage=(this.markICP+this.markDSA+this.enggMechanics)/3.0;
	System.out.println("Percentage of Non-CSE students.: "+this.percentage+"%");	  		
	}	
}
public class OodQ6 {

	public static void main(String[] args) {
	CSE Shakeel = new CSE(88,94,98);
	Shakeel.getPercentage();
	NonCSE Likun = new NonCSE(84,90,88);
	Likun.getPercentage();
	}
}
