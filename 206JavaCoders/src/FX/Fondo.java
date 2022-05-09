package FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fondo extends Application{
	
		   @Override
		   public void init() throws Exception { }

		   @Override
		   public void stop() throws Exception { }

		public void main(String[] args) {
			// TODO Auto-generated method stub
			Application.launch(args);
			
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			 Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
			 Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	
	
}

