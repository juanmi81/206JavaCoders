package javacoders.controlador;

import javax.swing.JOptionPane;

import javacoders.modelo.Articulo;
import javacoders.vista.VistaArticulo;
// clase controlador, para articulo
public class ControladorArticulo {
	// Atributos
	private Articulo modelo;
	private VistaArticulo vista;
	
	// geter y seter de atributos
	public Articulo getArticulo(Articulo art) {
		return modelo;
	}
	
	public void setArticulo(Articulo art) {
		
		
	}

	public VistaArticulo getVista(Articulo art) {
		return vista;
	}

	public void setVista(VistaArticulo vista) {
		this.vista = vista;
	}
	// visualización del menu articulos
	public void iniciar() {
		int op2 = 0;
		// bucle de subprograma articulos
		while (op2 != 3) {
			op2 = vista.getOpcion();
			switch (op2) {
				case 1:
					//añadir articulo
					nuevoArticulo();
				case 2:
					//ver articulo
					verArticulo();
				case 3:
					// salir del menu articulo
					break;
			default:
				JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
			}
		};
	}

	private void verArticulo() {
		// TODO Auto-generated method stub
		
	}

	private void nuevoArticulo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
