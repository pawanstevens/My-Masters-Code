import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class E12C14E12DisplayBarChart extends Application
{
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) 
	{
		  Pane pane = new Pane();
		  
		  Rectangle rect1 = new Rectangle(10, 90, 100, 60);
		  rect1.setFill(Color.RED);
		  Text txt1 = new Text(10, 80, "PROJECT-(20%)");
		 

		  Rectangle rect2 = new Rectangle(120, 120, 100, 30);
		  rect2.setFill(Color.BLUE);
		  Text txt2 = new Text(120, 110, "QUIZ-(10%)");
		 

          Rectangle rect3 = new Rectangle(230, 60, 100, 90);
		  rect3.setFill(Color.GREEN);
		  Text txt3 = new Text(230, 50, "MIDTERM-(30%)");
		

		  Rectangle rect4 = new Rectangle(340, 30, 100, 120);
		  rect4.setFill(Color.ORANGE);
		  Text txt4 = new Text(340, 20, "FINAL-(40%)");
		  

		  pane.getChildren().addAll(rect1, txt1, rect2, txt2, rect3, txt3, rect4, txt4);

		  Scene scene = new Scene(pane, 450, 150);
		  primaryStage.setTitle("Grading Criteria"); 
		  primaryStage.setScene(scene); 
		  primaryStage.show(); 


	}

	  public static void main(String[] args) 
	  {
		  Application.launch(args);
	  }
   } 
