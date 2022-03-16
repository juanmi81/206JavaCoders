package Controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import Modelo.*;
import Vista.*;

import java.util.ArrayList;
// clase de menu princiapl, desde aqui se selecciona que vamos a gestionar
public class ControlerMain {
	
	// inicializar clases
	VMenuPrincipal menu = new VMenuPrincipal();
		//gestion de aticulos
	ControladorArticulo CArticulo = new ControladorArticulo();
	ArrayList<Articulo> art= new ArrayList<Articulo>();
	
	// metodo para el control del menu principal
	public void iniciar() {
	
		// inicializar variables
		int op = 0;
		
		//Bucle del programa
		while (op != 4) {
			op = menu.getOpcion();
			switch (op) {
				case 1:
					//gestión clientes
				
				case 2:
					//Gestion Articulos
					CArticulo.iniciar();
				
				case 3:
					//Gestion Pedidos
				
			default:
				JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
			}
		};
	}
}
