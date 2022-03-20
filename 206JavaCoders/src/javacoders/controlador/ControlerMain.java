package javacoders.controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javacoders.modelo.Articulo;
import javacoders.modelo.Datos;
import javacoders.vista.VMenuPrincipal;
// clase de menu princiapl, desde aqui se selecciona que vamos a gestionar
public class ControlerMain {
	
	// inicializar clases
	private VMenuPrincipal menu = new VMenuPrincipal();
		//gestion de aticulos
	private Datos datos;
	private ControladorArticulo CArticulo;
	private ControladorPedido CPedido;
	private ControladorCliente CCliente;
	
	public ControlerMain() {
		 datos = new Datos();
		 CArticulo = new ControladorArticulo(datos);
		 CPedido = new ControladorPedido(datos);
		 CCliente = new ControladorCliente(datos);
	}
	
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
	
	public static void main(String[] args) {
		ControlerMain controlerMain = new ControlerMain();
		controlerMain.iniciar();
	}
}
