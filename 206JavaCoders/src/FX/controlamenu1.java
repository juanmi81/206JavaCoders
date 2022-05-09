package FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class controlamenu1 extends Application{
	
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
		/*	ObservableList<String> items = FXCollections.observableArrayList();
			items.addAll("1. Gestión de clientes", "2. Gestión de Articulos", "3. Gestión de Pedidos", "4. Salir del programa");

			ComboBox<String> cbx = new ComboBox<>(items);
			StackPane pane = new StackPane(cbx);

			Scene scene = new Scene(pane, 250, 150);
			primaryStage.setTitle("ComboBox JavaFX");*/
			 Parent root = FXMLLoader.load(getClass().getResource("menu1.fxml"));
			 Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	
	
}

