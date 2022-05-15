package FX;

import javafx.event.ActionEvent;
import javafx.event.Event;

import javacoders.controlador.*;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class controlamenu1 extends Application{
	
	ControladorArticulo articulo = new ControladorArticulo();
	
	@FXML private  javafx.scene.control.Menu salir;
	@FXML private  javafx.scene.control.MenuItem verart;
	@FXML private  javafx.scene.control.MenuItem nuevoart;
	@FXML private  javafx.scene.control.MenuItem vercli;
	@FXML private  javafx.scene.control.MenuItem nuevocli;
	
	@FXML public void fuera(ActionEvent event) {
	//	Node source = (Node) event.getSource();
	//    Stage stage = (Stage) source.getScene().getWindow();
	//    stage.close();
		Platform.exit();
        System.exit(0);
	}
	@FXML public void nuevoarticulo(ActionEvent event) {
		articulo.nuevoArticulo();
		
	}
	@FXML public void nuevocliente(ActionEvent event) {
		articulo.nuevoArticulo();
		
	}
	
	
	@Override
	public void init() throws Exception { }

	@Override
	public void stop() throws Exception { }

	public void main(String[] args) {
			// TODO Auto-generated method stub
		launch(args);
	}

	
		@Override
		public void start(Stage primaryStage) throws Exception {
			 Parent root = FXMLLoader.load(getClass().getResource("menu1.fxml"));
			 Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		}

	
	
}


