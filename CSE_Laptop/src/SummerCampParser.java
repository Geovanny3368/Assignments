// Assignment #: 5
// Arizona State University - CSE205
//         Name: Geovanny X Perez
//    StudentID: 1216405372
//      Lecture: MWF 8:30am
//  Description: This class is considered a utility class since it is never init.
//					It creates an object of summer camp and sets it null. The a 
//					string array is created that is set with a delimiter ":". 
//					Then the if statement will compare, ignoring upper and lower
//					cases, the first token of the string to the first element in 
//					the array. Any parts of the string that is not meant to be a string 
//					is parse into a double or an int

public class SummerCampParser{

	public static SummerCamp parseStringToSummerCamp(String lineToParse) {
		SummerCamp camp = null;
		
		String[] tokens = lineToParse.split(":");
		
		if (tokens[0].equalsIgnoreCase("DebateCamp")) {
			double 	rate = Double.parseDouble(tokens[3]);
			int		weeks = Integer.parseInt(tokens[4]);
			double	materialFee = Double.parseDouble(tokens[5]);
			camp = new DebateCamp(tokens[1], tokens[2], rate, weeks, materialFee, tokens[6]);
		} 
		
		if (tokens[0].equalsIgnoreCase("MathCamp")) {
			double 	rate = Double.parseDouble(tokens[3]);
			int		weeks = Integer.parseInt(tokens[4]);
			camp = new MathCamp(tokens[1], tokens[2], rate, weeks, tokens[5]);
		}
		
		if (tokens[0].equalsIgnoreCase("RoboticsCamp")){
			double 	rate = Double.parseDouble(tokens[3]);
			int		weeks = Integer.parseInt(tokens[4]);
			double	facilityFee = Double.parseDouble(tokens[5]);
			double	competitionFee = Double.parseDouble(tokens[6]);
			
			camp = new RoboticsCamp(tokens[1], tokens[2], rate, weeks, facilityFee, competitionFee);
		}
		
		return camp;

	}
	
}
