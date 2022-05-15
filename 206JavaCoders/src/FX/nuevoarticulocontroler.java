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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class nuevoarticulocontroler extends Application{

	 Stage stage = new Stage();

ControladorArticulo articulo = new ControladorArticulo();
	
@FXML private TextField articulodescripcion;
@FXML private TextField articulopvp;
@FXML private TextField articuloGE;
@FXML private TextField articuloTiempo;
@FXML private Button crearnuevoart;



@FXML public void crearnuevoarticulo(ActionEvent event) {
	
}

public void main(String[] args) {
		// TODO Auto-generated method stub
	Application.launch(args);
}

public void showWindow() throws Exception {
	start(stage);
}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 Parent root = FXMLLoader.load(getClass().getResource("nuevoarticulo.fxml"));
		 Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
}

