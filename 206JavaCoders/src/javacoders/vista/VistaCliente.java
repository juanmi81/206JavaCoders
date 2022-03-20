package javacoders.vista;

import javacoders.modelo.Cliente;

public class VistaCliente {
	Cliente client;
	
	 public VistaCliente(Cliente clienteinstanciado) {
	        this.client = clienteinstanciado;
	    }

	 // visualización del menu articulos
	 public int getOpcion() {
			int op = 0;
			try {
				System.out.println("1. Agregar Cliente \n 2. Mostrar Clientes \n 3. Salir del menu Articulos");
				op = Integer.parseInt(System.console().readLine());
				// si la opcion no esta entre 1 y 3 se ejecuta una excepción
				if ((op<1)||(op>3)) {
					throw new Exception ("#La opción es invalida");
				}
			} catch (Exception e) {
				// en caso de excepción se muestra el mensaje
				System.out.println(e.getMessage());
			}
			// devuelve la opcion
			return op;
		}
		// Añadir un cliente
		public Cliente nuevoCliente() {
			// pedir los datos por pantalla y guardarlos en el atributo
			// aqui se puede hacer una primera comprobación de los datos.
			System.out.println("Inserte el correoElectrónico");
			this.client.setEmail(sc.next());
			System.out.println("Inserte el nombre");
			this.client.setNombre(sc.next());
			System.out.println("Inserte el domicilio");
			this.client.setDomicilio(sc.next());
			System.out.println("Inserte el nif");
			this.client.setNif(sc.next());
			// devolver el atributo
			return this.client;
		}

		
}
