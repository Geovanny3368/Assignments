// Assignment #: Arizona State University CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: CreatePane generates a pane where a user can enter
//  a club information and create a list of available clubs.

import java.util.ArrayList;


import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import

//import all other necessary javafx classes here
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;

//----

public class CreatePane extends HBox
{
	ArrayList<Club> clubList;

    //The relationship between CreatePane and SelectPane is Aggregation
    private SelectPane selectPane;
    private Label title, numOfMembers, university;
	private TextField titleField, memberField, uniField;
	private Button crtClub;
	private TextArea clubDispaly;
    
	//constructor
	public CreatePane(ArrayList<Club> list, SelectPane sePane)
	{
		this.clubList = list;
		this.selectPane = sePane;
		    
        //initialize each instance variable (textfields, labels, textarea, button, etc.)
        //and set up the layout
        //----
	
		title = new Label("Title: ");
		numOfMembers = new Label("Number of Members: ");
		university = new Label("University: ");
		
		titleField = new TextField();
		memberField = new TextField();
		uniField = new TextField();
		
		crtClub = new Button("Create a Club");
        
        //create a GridPane hold those labels & text fields.
        //you can choose to use .setPadding() or setHgap(), setVgap()
        //to control the spacing and gap, etc.
        //----
        
        GridPane leftPane = new GridPane();
        leftPane.setAlignment(Pos.CENTER);      //Grid always centered 
        leftPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        leftPane.setHgap(5.5);
        leftPane.setVgap(5.5);
            
        //You might need to create a sub pane to hold the button
        //----
        GridPane.setHalignment(crtClub, HPos.LEFT);
        
        //sets the size of the button
        crtClub.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        
        //Set up the layout for the left half of the CreatePane.
        //----
        
        //first row
        leftPane.add(title, 0, 0);
        leftPane.add(titleField, 1, 0);
        
        //second row
        leftPane.add(numOfMembers, 0, 1);
        leftPane.add(memberField, 1, 1);
        
        //third row
        leftPane.add(university, 0, 2);
        leftPane.add(uniField, 1, 2);
        
        leftPane.add(crtClub, 1, 5);
        
        clubDispaly = new TextArea("No Club");
        
        
        this.getChildren().addAll(leftPane, clubDispaly);
        //the right half of the CreatePane is simply a TextArea object
        //Note: a ScrollPane will be added to it automatically when there are no
        //enough space
        
        //Add the left half and right half to the CreatePane
        //Note: CreatePane extends from HBox
        //----
        
        //register/link source object with event handler
        //----

	} //end of constructor

    private static void setLeft(GridPane pane) {
		// TODO Auto-generated method stub
		
	}

	//Create a ButtonHandler class
    //ButtonHandler listens to see if the button "Create" is pushed or not,
    //When the event occurs, it get a club's Title, its number of members, and its university
    //information from the relevant text fields, then create a new club and add it inside
    //the clubList. Meanwhile it will display the club's information inside the text area.
    //using the toString method of the Club class.
    //It also does error checking in case any of the textfields are empty,
    //or a non-numeric value was entered for its number of members
    private class ButtonHandler implements EventHandler<ActionEvent>
   	 {
   	    //Override the abstact method handle()
   	    public void handle(ActionEvent event)
        {
            //declare any necessary local variables here
            //---
            
            //when a text field is empty and the button is pushed
            //if ( //----  )
                //{
                    //handle the case here
                    
                //}
                //else	//for all other cases
                //{
                    //when a non-numeric value was entered for its number of members
                    //and the button is pushed
                    //you will need to use try & catch block to catch
                    //the NumberFormatException
                    //----
                    
                    //When a club of an existing club name in the list
                    //was attempted to be added, do not add it to the list
                    //and display a message "Club not added - duplicate"
                    
                    
                    
                    //at the end, don't forget to update the new arrayList
                    //information on the SelectPanel
                    //----
                    
                //}

      } //end of handle() method
   } //end of ButtonHandler class

}
