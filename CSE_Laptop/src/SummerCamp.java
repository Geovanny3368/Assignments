// Assignment #: 5
// Arizona State University - CSE205
//         Name: Geovanny X Perez
//    StudentID: 1216405372
//      Lecture: MWF 8:30am
//  Description: This class is the parent class, this where we set 
//					all the variables that are going to be used for 
//					any child class that gest derived from this one. 
//					It is also abstract

import java.text.DecimalFormat;

public abstract class SummerCamp { 
	
	//Instance variables that are protected 
	protected String title;
	protected String location;
	protected double weeklyRate;
	protected int	 numberOfWeeks;
	protected double totalCost;
	
	//Constructor takes in 4 parameters 
	public SummerCamp(String someTitle, String someLocation, double 
			someWeeklyRate, int someNumberOfWeeks) {
		
		this.title			= someTitle;
		this.location		= someLocation;
		this.weeklyRate	 	= someWeeklyRate;
		this.numberOfWeeks	= someNumberOfWeeks;
		
		totalCost = 0;
		
	}
	
	//getter method
	public String getCampTitle() {
		return title;
	}
	
	public String getLocation() {
		return location;
	}
	
	public double getWeeklyRates() {
		return weeklyRate;
	}
	
	public int getNumberOfWeeks() {
		return numberOfWeeks;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	//mutator 
	public void setCampTitle(String someTitle) {
		this.title = someTitle;
	}
	
	public void setLocation(String someLocation) {
		this.location = someLocation;
	}
	
	public void setWeeklyRates(double someRate) {
		this.weeklyRate = someRate;
	}
	
	public void setNumberOfWeeks(int someWeeks) {
		this.numberOfWeeks = someWeeks;
	}
	
	public void setTotalCost(double someCost) {
		this.totalCost = someCost;
	}
	
	//abstract method 
	public abstract void computeTotalCosts();
	
	//toString 
	public String toString() {
		//formats the number into US currency format 
		DecimalFormat fmt1 = new DecimalFormat("$0.00");
		
		String result = "\nCamp Title:\t\t" + title + "\n"
				+ "Location:\t\t" + location + "\n"
				+ "Weekly Rate:\t\t" + fmt1.format(weeklyRate) + "\n"
				+ "Weeks:\t\t\t" + numberOfWeeks + "\n"
				+ "Total Cost:\t\t" + fmt1.format(totalCost) + "\n";
		
		return result;
	}
	
	
	

}
