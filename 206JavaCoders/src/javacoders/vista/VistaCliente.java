package javacoders.vista;

import java.util.List;
import java.util.Scanner;

import javacoders.modelo.Cliente;

public class VistaCliente {
	Scanner sc = new Scanner(System.in);
	Cliente client;

	public VistaCliente() {

	}

	// visualizaci贸n del menu articulos
	public int getOpcion() {
		int op = 0;
		try {
			System.out.println(" 1. Agregar Cliente \n 2. Mostrar Clientes \n 3. Salir del menu cliente");
			op = sc.nextInt();
			// si la opcion no esta entre 1 y 3 se ejecuta una excepci贸n
			if ((op < 1) || (op > 3)) {
				throw new Exception("#La opci贸n es invalida");
			}
		} catch (Exception e) {
			// en caso de excepci贸n se muestra el mensaje
			System.out.println(e.getMessage());
		}
		// devuelve la opcion
		return op;
	}

	// -----------------------------------------------A帽adir un cliente
	// ----------------------------------------------------
	// que tipo de cliente
	public int nuevoCliente() {
		int op = 0;
		while (op > 2 || op < 1) {
			System.out.println("que tipo de cliente: \n 1 standar \n 2 premium \n 3 cancelar");
			op = sc.nextInt();
			if (op == 1) {
				System.out.println("Crear cliente estandar");
			} else if (op == 2) {
				System.out.println("Crear cliente premium");
			} else if (op == 3) {
				System.out.println("salir");
				break;
			} else
				System.out.println("opcion incorrecta");
		}
		return op;
	}

	// a帽adir los datos del cliente
	public String damemail() {
		System.out.println("Inserte el correoElectr髇ico");
		return sc.next();
	}

	public String damenombre() {
		System.out.println("Inserte el nombre");
		return sc.next();
	}

	public String damenif() {
		System.out.println("Inserte el NIF");
		return sc.next();
	}

	public String damedomicilio() {
		String salto = sc.nextLine();
		System.out.println("Inserte el domicilio");
		return sc.nextLine();
	}

	// --------------------------- mostrar clientes
	// ---------------------------------------------
	// que quieres ver? todos, premium o estandar?
	public int queLista() {
		int op = 0;
		try {
			System.out.println(
					" 1. Mostrar todos los clientes \n 2. Mostrar clientes estandar \n 3. Mostrar clientes premium\n");
			op = sc.nextInt();
			// si la opcion no esta entre 1 y 3 se ejecuta una excepci脙鲁n
			if ((op < 1) || (op > 3)) {
				throw new Exception("#La opci髇 es invalida");
			}
		} catch (Exception e) {
			// en caso de excepci脙鲁n se muestra el mensaje
			System.out.println(e.getMessage());
		}
		// devuelve la opcion
		return op;
	}

// --------------------   imprime por pantalla, para indicar un error, fin del programa, o los datos solicitados ...
	public void imprimir(List<Cliente> lstCliente) {

		if (!lstCliente.isEmpty()) {
			for (Cliente cliente : lstCliente) {
				System.out.println(cliente);
			}
		} else {
			System.out.println("No hay clientes");
		}

	}

	public void imprimir(String message) {
		System.out.println(message);

	}

}
