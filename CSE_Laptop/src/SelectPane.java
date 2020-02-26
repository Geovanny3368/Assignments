// Assignment #: Arizona State University CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: ReviewPane displays a list of available clubs
//  from which a user can select and compute their total number of members.

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;


//import all other necessary javafx classes here
//----

import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;


public class SelectPane extends BorderPane
{
	private Label clubLable;
	private Label newClubLable;
	private int totalMembers;
	private ArrayList<Club> clubList;
	private ArrayList<CheckBox> checkList;
	private CheckBox newBox;
	private VBox verticalBox;


   //constructor
   public SelectPane(ArrayList<Club> list)

   {
   	   //initialize instance variables
       this.clubList = list;
       this.checkList = new ArrayList<CheckBox>();
       totalMembers = 0;
       clubLable = new Label("Select some clubs");
       newClubLable = new Label("Total: " + totalMembers);

       //set up the layout
       //----
       
         
       //create an empty pane where you can add check boxes later
       //----
       this.verticalBox = new VBox();
//       checkPane.setSpacing(20);
//       checkPane.getChildren().add(updateClubList(newClub);)


       
       //SelectPane is a BorderPane - add the components here
       //----
       
       this.setTop(clubLable);
       this.setLeft(verticalBox);
       this.setBottom(newClubLable);

       
              
   } //end of constructor

 //This method uses the newly added parameter Club object
 //to create a CheckBox and add it to a pane created in the constructor
 //Such check box needs to be linked to its handler class

   public void updateClubList(Club newClub)
 {
     //-------
	 this.newBox = new CheckBox(newClub.toString());

	 verticalBox.getChildren().add(newBox);

	SelectionHandler xHandeler = new SelectionHandler();
	newBox.setOnAction(xHandeler);
		    	   			 
	checkList.add(newBox);
	 
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
        	
        	totalMembers = 0;
        	for (int i = 0; i < checkList.size(); i++) {
        		if (checkList.get(i).isSelected()) {
        			
        			totalMembers += clubList.get(i).getNumberOfMembers();
					
				}
				
			}
        	
        	newClubLable.setText("new: " + totalMembers);

     }
   } //end of SelectHandler class
} //end of SelectPane class
