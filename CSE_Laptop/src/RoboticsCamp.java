// Assignment #: 5
// Arizona State University - CSE205
//         Name: Geovanny X Perez
//    StudentID: 1216405372
//      Lecture: MWF 8:30am
//  Description: This class is child that extends from summer camp 
//					It just sets the primary things from the parent class
//					and then computes the total cost by adding the facility fee
//					competition fee to the product of weeks and rate.

import java.text.DecimalFormat;

//Child class for SummerCamp class
public class RoboticsCamp extends SummerCamp{
	
	//private instance variables 
	private double facilityFee;
	private double competitionFee;
	
	//Constructor 
	public RoboticsCamp(String title, String location, double rate, 
			int weeks, double facilityFee, double competitionFee) {
		
		super(title, location, rate, weeks);
		this.facilityFee = facilityFee;
		this.competitionFee = competitionFee;
			
	}
	
	//Getters 
	public double getFacilityFee() {
		return facilityFee;
	}
	
	public double getCompetitionFee() {
		return competitionFee;
	}
	
	//Setters 
	public void setFacilityFee(double someFacility) {
		this.facilityFee = someFacility;
	}
	
	public void setCometitionFee(double someCompetition) {
		this.competitionFee = someCompetition;
	}

	@Override
	public void computeTotalCosts() {
		//creates a local variable totalCost
		double totalCost = (weeklyRate * numberOfWeeks) + facilityFee + competitionFee;	
		//assigns totalCost from the parent class to the local variable totalCost
		this.totalCost = totalCost;
		
	}
	
	//toString
	public String toString() {
		//formats the number into US currency format 
		DecimalFormat fmt1 = new DecimalFormat("$0.00");
		
		String result = "Robotics Camp:" 
				+	super.toString() 
				+	"Facility Fee:\t\t"+ fmt1.format(facilityFee) + "\n"
				+	"Competition Fee:\t" + fmt1.format(competitionFee) + "\n";
		
		return result;
	}

}
