import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class E12C14E1DisplayImages extends Application 
{
	@Override
	public void start(Stage primaryStage)
  
	{
		
		GridPane grdPane = new GridPane();
		grdPane.setHgap(10);
		grdPane.setVgap(10);
        grdPane.setPadding(new Insets(5, 5, 5, 5));

		Image img1 = new Image("US-FLAG.GIF");
		ImageView US = new ImageView(img1);
		US.setFitHeight(200);
        US.setFitWidth(300);
        US.setSmooth(true);
        US.setCache(true);
		grdPane.add(US, 0, 0);

        Image img2 = new Image("INDIA-FLAG.GIF");
		ImageView INDIA = new ImageView(img2);
		INDIA.setFitHeight(200);
        INDIA.setFitWidth(300);
        INDIA.setSmooth(true);
        INDIA.setCache(true);
		grdPane.add(INDIA, 1, 0);

		Image img3 = new Image("NORWAY-FLAG.GIF");
		ImageView NORWAY = new ImageView(img3);
		NORWAY.setFitHeight(200);
        NORWAY.setFitWidth(300);
        NORWAY.setSmooth(true);
        NORWAY.setCache(true);
		grdPane.add(NORWAY, 0, 1);

		Image img4 = new Image("ISRAEL-FLAG.GIF");
		ImageView ISRAEL = new ImageView(img4);
        ISRAEL.setFitHeight(200);
        ISRAEL.setFitWidth(300);
        ISRAEL.setSmooth(true);
        ISRAEL.setCache(true);
		grdPane.add(ISRAEL, 1, 1);

		Scene scene = new Scene(grdPane);
		primaryStage.setTitle("FLAGS");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
}


