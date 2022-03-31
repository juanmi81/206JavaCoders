package javacoders.controlador;

import javacoders.modelo.Articulo;
import javacoders.modelo.Datos;
import javacoders.vista.VistaArticulo;
// clase controlador, para articulo
public class ControladorArticulo {
	// Atributos
	private VistaArticulo vista;
	private Datos datos;
	private Scanner sc = new Scanner(System.in);
	
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
					verArticulo();
					break;
				case 3:
					// salir del menu articulo
					vista.fingestion();
					break;
			}
		};
	}

	private void verArticulo() {
		// llamar a la vista 
		this.vista.verArticulo();
	}
// ------------------------------ nuevo articulo ---------------------------------------
	private void nuevoArticulo() {
		Articulo art = new Articulo(vista.damecodigo(), vista.damedescripcion(), vista.damepvp(), vista.damegastosdeenvio(), vista.dametiempopreparaion());
		this.datos.addArticulo(art);
	}
	
	
}
