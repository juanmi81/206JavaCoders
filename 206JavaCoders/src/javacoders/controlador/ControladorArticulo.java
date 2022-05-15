package javacoders.controlador;


import java.io.IOException;

import FX.Nuevoarticulocontroler;
import exception.DAOException;
import javacoders.modelo.Articulo;
import javacoders.modelo.Datos;
import javacoders.vista.VistaArticulo;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// clase controlador, para articulo
public class ControladorArticulo {
	// Atributos
	private String[] args;
	private VistaArticulo vista;
	private Datos datos;
	
	
	public ControladorArticulo(Datos datos) {
		vista = new VistaArticulo();
		this.datos = datos;
	}

	public ControladorArticulo() {
		// TODO Auto-generated constructor stub
	}

	public VistaArticulo getVista(Articulo art) {
		return vista;
	}

	public void setVista(VistaArticulo vista) {
		this.vista = vista;
	}
	// visualizaciÃ³n del menu articulos
	public void iniciar() throws DAOException {
		int op2 = 0;
		// bucle de subprograma articulos
		while (op2 != 3) {
			op2 = vista.getOpcion();
			switch (op2) {
				case 1:
					//a�adir articulo
					nuevoArticulo();
					break;
				case 2:
					//ver articulo
					verTodos();
					break;
				case 3:
					// salir del menu articulo
					vista.fingestion();
					break;
			}
		};
	}

	private void verTodos() throws DAOException {
		// llamar a la vista 
		String ver = this.datos.MostrarArticulos();
		this.vista.MostrarTodos(ver);
	}
	
	public void verArticulo() throws IOException {
		// llamar a la vista 
		//this.vista.verArticulo();
		Stage stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("listaarticulo.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
// ------------------------------ nuevo articulo ---------------------------------------
	// producto 4
/*	public void nuevoArticulo() {
		Articulo art = new Articulo(vista.damedescripcion(), vista.damepvp(), vista.damegastosdeenvio(), vista.dametiempopreparaion());
		try {
			this.datos.addArticulo(art);
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}*/
	// producto 5
	public void nuevoArticulo() {
		Nuevoarticulocontroler articul = new Nuevoarticulocontroler();
		try {
			articul.showWindow();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Articulo art = new Articulo(vista.damedescripcion(), vista.damepvp(), vista.damegastosdeenvio(), vista.dametiempopreparaion());
		try {
			this.datos.addArticulo(art);
		} catch (DAOException e) {
			e.printStackTrace();
		}*/
	}

	
	
}
