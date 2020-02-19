// Assignment #: 5
// Arizona State University - CSE205
//         Name: Geovanny X Perez
//    StudentID: 1216405372
//      Lecture: MWF 8:30am
//  Description: The Assignment 5 class displa ys a menu of choices
//               (add summer camp, search summer camp title,
//               list summer camps, quit, display menu) to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean operation;

     // ArrayList object is used to store SummerCamp objects
     ArrayList<SummerCamp> summerCampList = new ArrayList<SummerCamp>();
     
     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);

       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);
         
         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add SummerCamp
               System.out.print("Please enter some summer camp information to add:\n");
               inputInfo = stdin.readLine().trim();
               
               //this creates an object of SummerCamp. Then it calls the parser class which 
               //feeds the user input. Lastly it adds it they array list
               SummerCamp camp = SummerCampParser.parseStringToSummerCamp(inputInfo);
               summerCampList.add(camp);
               break;
             case 'C':   //Compute Total Costs for all camps
         
            	 
              for (int i = 0; i < summerCampList.size(); i++) {
            	  summerCampList.get(i).computeTotalCosts();
				
              }
            	System.out.print("total costs computed\n");
               break;
             case 'D':   //Search for SummerCamp
               System.out.print("Please enter a summer camp title to search:\n");
               inputInfo = stdin.readLine().trim();
               operation = false;
               
               // sets a tempID
               String tempId;
               operation = false;
               for (int i = 0; i < summerCampList.size(); i++) {
            	   //The tempId is passed the index which set to a camp name 
            	   tempId = summerCampList.get(i).getCampTitle();
            	   
            	   //This if statement compares the user input to the tempID
            	   //if the camp is found then it sets the operation to true 
            	   //and breaks from the loop
            	   if (inputInfo.equalsIgnoreCase(tempId)) {
            		   operation = true;
            		   break;
					
				}
				
			}
                if (operation == true)
                 System.out.print("SummerCamp found\n");
                else
                 System.out.print("SummerCamp not found\n");
               break;
             case 'L':   //List SummerCamps
                /***********************************************************************************
                ***  ADD your code here to print out all camp objects. If there is no camp,
                ***  print "no summer camp\n"
                ***********************************************************************************/
            	 
            	 //Prints the summer camps if found else it prints no summer camp 
            	 if (summerCampList.size() == 0) {
            		 System.out.print("no summer camp\n");
            		
				}else {
					 for (int i = 0; i < summerCampList.size(); i++) {
            			 System.out.print("\n" + summerCampList.get(i) + "\n");		
					}
				}
            	 
            	 break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd SummerCamp\n" +
                      "C\t\tCompute Total Costs\n" +
                      "D\t\tSearch for SummerCamp\n" +
                      "L\t\tList SummerCamps\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}


