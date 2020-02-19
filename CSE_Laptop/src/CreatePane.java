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
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import

//import all other necessary javafx classes here
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;

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
	
		title = new Label("Title ");
		numOfMembers = new Label("Number of Members ");
		university = new Label("University ");
		
		titleField = new TextField();
		
		memberField = new TextField();
		uniField = new TextField();
		
		crtClub = new Button("Create a Club");
        
        //create a GridPane hold those labels & text fields.
        //you can choose to use .setPadding() or setHgap(), setVgap()
        //to control the spacing and gap, etc.
        //----       
        GridPane leftPane = new GridPane();
        leftPane.setPrefSize(400, 400);
        leftPane.setAlignment(Pos.TOP_CENTER);      //Grid always centered 
        leftPane.setPadding(new Insets(35, 35, 0, 0));
        leftPane.setHgap(10);
        leftPane.setVgap(5);
            
        //You might need to create a sub pane to hold the button
        //----
//        TilePane downPane = new TilePane(Orientation.HORIZONTAL);
//        downPane.setAlignment(Pos.CENTER);
//        downPane.setPadding(new Insets(0, 0, 0, 0)); 
//        downPane.setVgap(10.0); 
//        
//        FlowPane southPane = new FlowPane();
//        southPane.setVgap(10);
//        southPane.setHgap(10);
//        
//        StackPane belowPane = new StackPane();
//        belowPane.getChildren().add(crtClub);
        
        GridPane.setHalignment(crtClub, HPos.CENTER);
        GridPane.setValignment(crtClub, VPos.TOP);
        
//        HBox hBoxPane = new HBox();
//        hBoxPane.setAlignment(Pos.BOTTOM_LEFT);
//        hBoxPane.setPadding(new Insets(10, 50, 10, 10));
        //sets the size of the button
        //crtClub.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        crtClub.setAlignment(Pos.CENTER_LEFT);
        
        //sets the spacing for hBoxPane
//        hBoxPane.setSpacing(10);
//        hBoxPane.setMinSize(50, 50);
                         
        //Set up the layout for the left half of the CreatePane.
        //----        
        leftPane.add(title, 0, 0);
        leftPane.add(titleField, 1, 0);
        
        leftPane.add(numOfMembers, 0, 1);
        leftPane.add(memberField, 1, 1);
        
        leftPane.add(university, 0, 2);
        leftPane.add(uniField, 1, 2);
        
        leftPane.add(crtClub, 0, 3, 2, 5);
        
//        leftPane.add(belowPane, 2, 5, 2, 1);
//            
//        downPane.getChildren().add(crtClub);
//        southPane.getChildren().add(crtClub);
//        hBoxPane.getChildren().add(crtClub);
//        

        //the right half of the CreatePane is simply a TextArea object
        //Note: a ScrollPane will be added to it automatically when there are no
        //enough space
        
        //Add the left half and right half to the CreatePane
        //Note: CreatePane extends from HBox
        //----
        clubDispaly = new TextArea("No Club");
        clubDispaly.setPrefWidth(500);  
        
        this.getChildren().addAll(leftPane, clubDispaly);
        //register/link source object with event handler
        //----

	} //end of constructor


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