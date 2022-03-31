package javacoders.vista;

import java.util.Scanner;

import javacoders.modelo.Articulo;

public class VistaArticulo {
	
	Scanner sc = new Scanner(System.in);
	Articulo articul;
    
    public VistaArticulo() {
    }

 // visualización del menu articulos
	public int getOpcion() {
		int op = 0;
		try {
			System.out.println(" 1. Agregar Articulo \n 2. Mostrar Articulo \n 3. Salir del menu Articulos");
			op = sc.nextInt();
			// si la opcion no esta entre 1 y 3 se ejecuta una excepción
			if ((op<1)||(op>3)) {
				throw new Exception ("#La opción es invalida");
			}
		} catch (Exception e) {
			// en caso de excepción se muestra el mensaje
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// devuelve la opcion
		return op;
	}
		// nuevo Articulo
	public String damedescripcion() {
		System.out.println("Inserte la descripcion del articulo");
		return sc.nextLine();
	}
	public String damecodigo() {
		System.out.println("Inserte el codigo del articulo");
		return sc.next();
	}
	public Float damepvp() {
		System.out.println("Inserte el pvp");
		return sc.nextFloat();
	}
	public Float damegastosdeenvio() {
		System.out.println("Inserte los gastos de envio");
		return sc.nextFloat();
	}
	public int dametiempopreparaion() {
		System.out.println("Inserte el tiempo de preparación");
		return sc.nextInt();
	}
	// ver articulo
	public void verArticulo() {
		// llamar a la funcion
		System.out.println(this.articul);
	}
// OP = 3 FIN DE GESTION
	public void fingestion() {
		System.out.println("saliendo de la gestion de articulos");
	}
	
}
