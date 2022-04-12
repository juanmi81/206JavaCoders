package javacoders.vista;

import java.util.Scanner;

public class VMenuPrincipal {

	Scanner sc = new Scanner(System.in);
		
	public VMenuPrincipal() {
		
	}
	
	public int getOpcion() {
		int op = 0;
		try {
			System.out.println(" 1. Gesti�n de Clientes \n 2. Gesti�n de Art�culos \n 3. Gesti�n de Pedidos \n 4. Salir del programa");
			op = sc.nextInt();
			// si la opcion no esta entre 1 y 3 se ejecuta una excepciÃ³n
			if ((op<1)||(op>4)) {
				throw new Exception ("#La opci�n es invalida");
			}
		} catch (Exception e) {
			// en caso de excepciÃ³n se muestra el mensaje
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// devuelve la opcion
		return op;
	}
	// OP = 4 final
	public void OPfinal() {
		System.out.println("Fin del programa");
	}
	
}
