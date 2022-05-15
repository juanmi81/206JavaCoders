package javacoders.vista;

import java.util.Scanner;

import FX.Controlamenu1;

public class VMenuPrincipal {

	Scanner sc = new Scanner(System.in);
	
	//private Stage primaryStage = new Stage();
		
	public VMenuPrincipal(String[] args) {
		//Fondo fondo = new Fondo();
	//	fondo.main(args);
	}
	
	public int getOpcion(String[] args) {
		int op = 0;
		
		Controlamenu1 menu = new Controlamenu1();
		menu.main(args);
		
/*		int op = 0;
		try {
			System.out.println(" 1. Gestión de Clientes \n 2. Gestión de Artículos \n 3. Gestión de Pedidos \n 4. Salir del programa");
			op = sc.nextInt();
			// si la opcion no esta entre 1 y 3 se ejecuta una excepciÃƒÂ³n
			if ((op<1)||(op>4)) {
				throw new Exception ("#La opción es invalida");
			}
		} catch (Exception e) {
			// en caso de excepciÃƒÂ³n se muestra el mensaje
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// devuelve la opcion
		return op;
	}
	// OP = 4 final
	 * 
	 */
		return op;
	}
	public void OPfinal() {
		System.out.println("Fin del programa");
	}
	
}
