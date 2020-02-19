//Assignment #: 5
//Arizona State University - CSE205
//      Name: Geovanny X Perez
// StudentID: 1216405372
//   Lecture: MWF 8:30am
//Description: Debate camp is a child class that extends Summer camp. 
//				This class computes the total of the camp by multiplying 
//				the weeklyRate and the numberOfWeeks and then adding the materialFee.
//				If there is a groupDiscount then after multiplying the weeklyRate and 
//				the numberOfWeeks the total gets multiplied by 0.9 and the matterialFee
//				gets added.

import java.text.DecimalFormat;

//Child class of parent class SummerCamp
public class DebateCamp extends SummerCamp{
	
	//instance variables 
	private double		materialFee;
	private boolean		groupDiscount;  

	//Constructor 
	public DebateCamp(String title, String location, double rate, 
			int weeks, double materialFee, String discount) {
		
		super(title, location, rate, weeks);
		this.materialFee = materialFee;
		
		//if/else statement checks if the input is equal to yes 
		//then sets the instance variable to true, else it sets it 
		//to false 
		if (discount.equals("yes")) {
			groupDiscount = true;
		}else {
			groupDiscount = false;
		}
	}
	
	
	//getters 
	public double getMaterialFee() {
		return materialFee;
	}
	
	public boolean getGroupDiscount() {
		return groupDiscount;
	}
	
	//setters 
	
	public void setMaterialFee(double someFee) {
		this.materialFee = someFee;
		
	}
	
	@Override
	public void computeTotalCosts() {
	
		if (groupDiscount == false) {
			//if false then there is no discount 
			this.totalCost = (weeklyRate * numberOfWeeks) + materialFee;
			
		}else if (groupDiscount == true) {
			//if true then there is a discount 
			this.totalCost =  ((weeklyRate * numberOfWeeks)*0.9) + materialFee;
		}
		
	}
	
	//toString method
	public String toString() {
		//formats the number into US currency format 
		DecimalFormat fmt1 = new DecimalFormat("$0.00");
		
		String result = "Debate Camp:"
				+	super.toString() 
				+ 	"Material Fee:\t\t" + fmt1.format(materialFee) + "\n";
				// this if statement checks if the group discount
				// or false 
				if(groupDiscount)
				result+= "Group Discount:\t\t" + "yes" + "\n";
				else
				result+= "Group Discount:\t\t" + "no" + "\n";
				
		return result;
		
	}

}
