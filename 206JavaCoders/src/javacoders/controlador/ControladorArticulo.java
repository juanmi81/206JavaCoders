package javacoders.controlador;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
		System.out.println("Inserte el cod");
		String cod = sc.next();
		System.out.println("Inserte el descripción");
		String des = sc.next();
		System.out.println("Inserte el pvp");
		float pvp = sc.nextFloat();
		System.out.println("Inserte el gastos");
		float gastos = sc.nextFloat();
		System.out.println("Inserte el tiempo de preparación");
		int tiempoPre = sc.nextInt();
		
		Articulo art = new Articulo(cod, des, pvp, gastos, tiempoPre);
		
		datos.addArticulo(art);
		System.out.println(datos);
	}
	
	
}
