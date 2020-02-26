// Assignment #: Arizona State University CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: CreatePane generates a pane where a user can enter
//  a club information and create a list of available clubs.

import java.util.ArrayList;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;	//**Need to import
import javafx.event.EventHandler;	//**Need to import
import javafx.scene.control.Button;

//import all other necessary javafx classes here

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CreatePane extends HBox
{
	ArrayList<Club> clubList;

    //The relationship between CreatePane and SelectPane is Aggregation
    private SelectPane selectPane;
    private Label title, numOfMembers, university, warning;
	private TextField titleField, memberField, uniField;
	private Button clubBtn;
	private TextArea clubDispaly;
    
	//constructor
	public CreatePane(ArrayList<Club> list, SelectPane sePane)
	{
		this.clubList = list;
		this.selectPane = sePane;
		    
        //initialize each instance variable (textfields, labels, textarea, button, etc.)
        //and set up the layout
        //----
		warning = new Label("");
		warning.setTextFill(Color.RED);
		
		//set up for labels
		title = new Label("Title");
		numOfMembers = new Label("Number of Members");
		university = new Label("University");
		
		//set up for text fields
		titleField = new TextField();		
		memberField = new TextField();
		uniField = new TextField();
		
		//set up for button
		clubBtn = new Button("Create a Club");
        
        //create a GridPane hold those labels & text fields.
        //you can choose to use .setPadding() or setHgap(), setVgap()
        //to control the spacing and gap, etc.
        //----       
        GridPane centerPane = new GridPane();
        centerPane.setAlignment(Pos.TOP_CENTER);     		 //Grid always centered 
        centerPane.setPadding(new Insets(10, 10, 0, 0));
        centerPane.setHgap(5);
        centerPane.setVgap(5);
        
        //Components for the gridpane
        centerPane.add(title, 0, 0);			
        centerPane.add(titleField, 1, 0);		
        
        centerPane.add(numOfMembers, 0, 1);		
        centerPane.add(memberField, 1, 1);
        
        centerPane.add(university, 0, 2);
        centerPane.add(uniField, 1, 2);
            
        //You might need to create a sub pane to hold the button
        //----
              
        //Creates the area for the button 
        FlowPane bottomPane = new FlowPane();
        bottomPane.getChildren().add(clubBtn);
        bottomPane.setAlignment(Pos.TOP_CENTER);
        bottomPane.setPadding(new Insets(10, 50, 50, 10));
        bottomPane.setPrefHeight(250);
        bottomPane.setVgap(0);
        bottomPane.setHgap(10);
        
        //Creates the area for the top header
        FlowPane topPane = new FlowPane();
        topPane.getChildren().add(warning);
        topPane.setAlignment(Pos.BOTTOM_LEFT);
        topPane.setPadding(new Insets(5, 0, 0, 10));
        
        //Both panes are tossed into a borderPane  
        BorderPane leftPane = new BorderPane();
        leftPane.setTop(topPane);
        leftPane.setCenter(centerPane);
        leftPane.setBottom(bottomPane);
       
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
        ButtonHandler btnHandler = new ButtonHandler();
        clubBtn.setOnAction(btnHandler);

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
   	    	String title, university;
   	    	String clubListStr = "";
   	    	int numOfMembers;
   	    	
   	    	//if statement the checks if any field is empty
   	    	if (titleField.getText().isEmpty() || memberField.getText().isEmpty()
   	    			|| uniField.getText().isEmpty()) {
   	    		//Displays message if any field is empty
   	    		warning.setText("Please fill in all fields");
			}else {
				
				try {
							
			        //when a non-numeric value was entered for its number of members
			        //and the button is pushed
			        //you will need to use try & catch block to catch
			        //the NumberFormatException
			        //----
					
					//Inits the local variables to the instance 
					//parses the memberField to and int
					title = titleField.getText();
					numOfMembers = Integer.parseInt(memberField.getText());
					university = uniField.getText();
					
					//Creates a Club object and it sets 
					//the new title, #ofMembers and university 
					//then adds it to the clubList array
					Club createClub = new Club();
					createClub.setClubName(title);
					createClub.setNumberOfMembers(numOfMembers);
					createClub.setUniversity(university);
					clubList.add(createClub);
					
					//Manages the array adding the toString to any 
					//club that has been added 
					for (int i = 0; i < clubList.size(); i++) {
						
						clubListStr += clubList.get(i).toString();
					}
					
					//displays the clubs that were added in the text area
					clubDispaly.setText(clubListStr);
					
					//updates the updateClubList in the selectPane class
					selectPane.updateClubList(createClub);
					
					//sets the text to new text
					warning.setText("Club added");
					
					//Clears the textFields 
					titleField.clear();
					memberField.clear();
					uniField.clear();
					
			}catch(NumberFormatException e){
					
					//In case the input is not and int it shows this message
					warning.setText("Please enter an integer for a number of members");
				}
				
			}

      } //end of handle() method
   } //end of ButtonHandler class

}