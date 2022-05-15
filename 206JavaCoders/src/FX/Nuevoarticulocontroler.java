package FX;

import DAO.ArticuloDAO;
import exception.DAOException;
import javacoders.controlador.ControladorArticulo;
import javacoders.modelo.Articulo;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Nuevoarticulocontroler extends Application {

	Stage stage = new Stage();

	ControladorArticulo articulo = new ControladorArticulo();
	

	@FXML
	private TextField articulodescripcion;
	@FXML
	private TextField articulopvp;
	@FXML
	private TextField articuloGE;
	@FXML
	private TextField articuloTiempo;
	@FXML
	private Button crearnuevoart;
	
	private ArticuloDAO articuloDAO = new ArticuloDAO();
	@FXML
	public void crearnuevoarticulo(ActionEvent event) throws DAOException {
		// Datos del nuevo articulo
		Articulo art = new Articulo();
		art.setDescripcion(articulodescripcion.getText());
		art.setPvp(Float.parseFloat(articulopvp.getText()));
		art.setGastosEnvio(Float.parseFloat(articuloGE.getText()));
		art.setTiempoPrep(Integer.parseInt(articuloTiempo.getText()));
		articuloDAO.insertar(art);
		
		//Platform.exit();
       // System.exit(0);
		
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
