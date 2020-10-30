package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			 ScrollPane scrollpane = loader.load();
			
			 // faz com que o menu fique por toda a extremidade da tela
			 scrollpane.setFitToHeight(true);
			 scrollpane.setFitToWidth(true);
			 
			 Scene mainScene = new Scene(scrollpane);
			 primaryStage.setScene(mainScene);
			 primaryStage.setTitle("Sample JavaFX application");
			 primaryStage.show(); 
			 mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
