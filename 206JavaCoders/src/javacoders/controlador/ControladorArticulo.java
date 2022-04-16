package javacoders.controlador;


import exception.DAOException;
import javacoders.modelo.Articulo;
import javacoders.modelo.Datos;
import javacoders.vista.VistaArticulo;
// clase controlador, para articulo
public class ControladorArticulo {
	// Atributos
	private VistaArticulo vista;
	private Datos datos;
	
	public ControladorArticulo(Datos datos) {
		vista = new VistaArticulo();
		this.datos = datos;
	}

	public VistaArticulo getVista(Articulo art) {
		return vista;
	}

	public void setVista(VistaArticulo vista) {
		this.vista = vista;
	}
	// visualizaciÃ³n del menu articulos
	public void iniciar() {
		int op2 = 0;
		// bucle de subprograma articulos
		while (op2 != 3) {
			op2 = vista.getOpcion();
			switch (op2) {
				case 1:
					//añadir articulo
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

	private void verTodos() {
		// llamar a la vista 
		String ver = this.datos.MostrarArticulos();
		this.vista.MostrarTodos(ver);
	}
	
	private void verArticulo() {
		// llamar a la vista 
		this.vista.verArticulo();
	}
// ------------------------------ nuevo articulo ---------------------------------------
	private void nuevoArticulo() {
		Articulo art = new Articulo(vista.damedescripcion(), vista.damepvp(), vista.damegastosdeenvio(), vista.dametiempopreparaion());
		try {
			this.datos.addArticulo(art);
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	
	
}
