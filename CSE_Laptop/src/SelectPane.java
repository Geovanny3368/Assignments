// Assignment #: Arizona State University CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: ReviewPane displays a list of available clubs
//  from which a user can select and compute their total number of members.

import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import
import java.util.ArrayList;
import javafx.collections.ObservableList;
import javafx.scene.Node;

//import all other necessary javafx classes here
//----

public class SelectPane extends BorderPane
{
   private ArrayList<Club> clubList;

   //constructor
   public SelectPane(ArrayList<Club> list)
   {
   	   //initialize instance variables
       this.clubList = list;
       
       //set up the layout
       //----
       
    
       //create an empty pane where you can add check boxes later
       //----
       
       
       //SelectPane is a BorderPane - add the components here
       //----
       

       
   } //end of constructor

 //This method uses the newly added parameter Club object
 //to create a CheckBox and add it to a pane created in the constructor
 //Such check box needs to be linked to its handler class
 public void updateClubList(Club newClub)
 {
     //-------
 }

 //create a SelectionHandler class
 private class SelectionHandler implements EventHandler<ActionEvent>
    {
        //Override the abstact method handle()
        public void handle(ActionEvent event)
        {
            //When any radio button is selected or unselected
            //the total number of members of selected clubs should be updated
            //and displayed using a label.
        

     }
   } //end of SelectHandler class
} //end of SelectPane class
