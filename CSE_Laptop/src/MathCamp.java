//Assignment #: 5
//Arizona State University - CSE205
//      Name: Geovanny X Perez
// StudentID: 1216405372
//   Lecture: MWF 8:30am
//Description: This class is a child class that extends from summer camp
//				Its constructor assigns the title, location, rate, weeks and 
//				if the are taking a test. Then it computes the cost by 
//				Multiplying the rate and weeks then adding the cost of the test
//				whether the student is going to take the test

//child class to parent class 
public class MathCamp extends SummerCamp {
	
	//instance variables 
	private boolean testTaking;

	//Constructors for the class 
	public MathCamp(String title, String location, double rate,			
			int weeks, String testTaking) {
		
		super(title, location, rate, weeks);
		
		//if/else statement checks if the input is equal to yes 
		//then sets the instance variable to true else it sets it 
		//to false 
		if (testTaking.equals("yes")) {
			this.testTaking = true;
		}else {
			this.testTaking = false;
		}
	}
	
	//Computes the total cost for the camp 
	@Override
	public void computeTotalCosts() {
			 
		double	totalCost = weeklyRate * numberOfWeeks;
		int		testCost = 25;
		
		if (testTaking = true) {
			//if true then adds the cost of the test 
			this.totalCost = totalCost + testCost;
	
		}else {
			//if false there is no additional cost 
			this.totalCost = totalCost;
		}
	}
	
	//toString method 
	public String toString() {	
		String result = "Math Camp:"
				+	super.toString();
				if (testTaking) {
					result+= "Test Taking:\t\t" + "yes" + "\n";
				}else {
					result+= "Test Taking:\t\t" + "no" + "\n";
					
				}
		
		return result;
	}
	

}
