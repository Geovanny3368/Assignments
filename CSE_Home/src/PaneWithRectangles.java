// Assignment #: Arizona State University CSE205
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: PaneWithRectangles class creates a pane where we can use
//               mouse key to drag on grids and there will be some color following
//               the mouse. We can also use combo boxes to change its colors and stroke widths

//import any classes necessary here
//----
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class PaneWithRectangles extends BorderPane
{
   private ComboBox<String> primaryColorCombo;
   private ComboBox<String> backColorCombo;
   private ComboBox<String> widthCombo;
    
   private Color primaryColor, secondaryColor, backgroundColor;
   private double selectWidth;

   private Rectangle[][] rectArray;


   public PaneWithRectangles()
   {
       primaryColor = Color.BLACK;
       secondaryColor = Color.GRAY;
       backgroundColor = Color.WHITE;
       selectWidth = 1.0;
       
       //Instantiate and initialize labels, combo boxes
       

       //Instantiate and initialize the two dimensional array rectArray
       //to contain 7 columns and 7 rows (49 rectangles total)
       //It is recommended to use nested loops
       
       
       //grid is a GridPane containing 49 rectangles.
       GridPane grid = new GridPane();
       //---- add 49 rectangles to the grid pane, it is recommended to use nested loops
       //----
       //----

       //leftPane is a VBox, it should contain labels and combo boxes
       VBox leftPane = new VBox();
       leftPane.setSpacing(20);
       leftPane.setPadding(new Insets(10, 0, 10, 0));


       //add the left pane to the left of the pane
       //and the grid pane contains rectangles at the center
       this.setLeft(leftPane);
       this.setCenter(grid);

      //register/link the source nodes with its handler objects
      grid.setOnMouseDragged(new MouseHandler());
      //----
      //----
      //----
  
   }
    

   //Step #2(A) - MouseHandler
   private class MouseHandler implements EventHandler<MouseEvent>
   {
      public void handle(MouseEvent event)
       {
            //handle MouseEvent here
            //Note: you can use if(event.getEventType()== MouseEvent.MOUSE_DRAGGED)
            //to check whether the mouse key is dragged
            //write your own codes here
            //----


          
      }//end handle()

   }//end MouseHandler

   //A handler class used to handle primary and secondary colors
   private class PrimColorHandler implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent event)
      {
          //write your own codes here
          //----
      }
   }//end PrimColorHandler
    
   //A handler class used to handle background color
    private class BackColorHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----
        }
    }//end BackColorHandler
    
    //A handler class used to handle stroke width
    private class WidthHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent event)
        {
            //write your own codes here
            //----
        }
    }//end WidthHandler
} //end of PaneWithRectangles