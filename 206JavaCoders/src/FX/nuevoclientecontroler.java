package FX;

import javafx.event.ActionEvent;
import javafx.event.Event;

import javacoders.controlador.*;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class nuevoclientecontroler extends Application{
	
	
	ControladorArticulo articulo = new ControladorArticulo();
	
	@FXML private  ChoiceBox<String> tipocli;
	@FXML private TextField clienteemail;
	@FXML private TextField clientedomicilio;
	@FXML private TextField clientenif;
	@FXML private TextField clientenombre;
	@FXML private Button crearnuevocli;
	
	
	ObservableList<String> tipolista = FXCollections.observableArrayList("Estandar","Premium");
	
	@FXML public void crearnuevocliente(ActionEvent event) {
		
	}
	
	@FXML
	private void initialize() {
		tipocli.setItems(tipolista);
		tipocli.setValue("Estandar");
	}

	public void main(String[] args) {
			// TODO Auto-generated method stub
		//Application.launch(args);
	}

	
		@Override
		public void start(Stage primaryStage) throws Exception {
			 Parent root = FXMLLoader.load(getClass().getResource("nuevocli.fxml"));
			 Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	
	
}

