// Assignment #: Arizona State University CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: ReviewPane displays a list of available clubs
//  from which a user can select and compute their total number of members.


import javafx.scene.layout.*;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import

import java.util.ArrayList;

//import all other necessary javafx classes here
//----

import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class SelectPane extends BorderPane
{
	private ArrayList<Club> clubList;
	private ArrayList<CheckBox> checkBoxList;
	private Label topLable, bottomLable;
	private int totalMembers;
	private CheckBox newBox;
	private VBox verticalBox;


   //constructor
   public SelectPane(ArrayList<Club> list)

   {
   	   //initialize instance variables
       this.clubList = list;
       this.checkBoxList = new ArrayList<CheckBox>();
//       this.totalMembers = 0;
       this.topLable = new Label("Select some clubs");
       this.bottomLable = new Label("The total number of members for the selected club(s): 0" );

       //set up the layout
       //----
       
         
       //create an empty pane where you can add check boxes later
       //----
       this.verticalBox = new VBox();
    
       //SelectPane is a BorderPane - add the components here
       //----       
       this.setTop(topLable);
       this.setLeft(verticalBox);
       this.setBottom(bottomLable);
       
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
		    	   			 
	 checkBoxList.add(newBox);
	 
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
        	for (int i = 0; i < checkBoxList.size(); i++) {
        		if (checkBoxList.get(i).isSelected()) {
        			
        			totalMembers += clubList.get(i).getNumberOfMembers();
					
				}
				
			}
        	
        	bottomLable.setText("The total number of members for the selected club(s): " + totalMembers);

     }
   } //end of SelectHandler class
} //end of SelectPane class
