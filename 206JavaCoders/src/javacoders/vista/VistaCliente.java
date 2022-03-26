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
	// -----------------------------------------------Añadir un cliente ----------------------------------------------------
	// que tipo de cliente
	public int nuevoCliente() {
			int op = 0;
			while (op > 2 && op < 1) {
				System.out.println("que tipo de cliente: \n 1 standar \n 2 premium \n 3 cancelar");
				op =  Integer.parseInt(System.console().readLine());
				if (op == 2) {
					System.out.println("Crear cliente estandar");
				}else if (op == 1) {
					System.out.println("Crear cliente premium");
				}else if (op == 3) {
					System.out.println("salir");
					break;
				}else System.out.println("opcion incorrecta");
			}
			return op;
		}
	// pedir datos de cliente
		public void datosCliente() {
			System.out.println("Inserte el correoElectrónico");
			this.client.setEmail(sc.next());
			System.out.println("Inserte el nombre");
			this.client.setNombre(sc.next());
			System.out.println("Inserte el domicilio");
			this.client.setDomicilio(sc.next());
			System.out.println("Inserte el nif");
			this.client.setNif(sc.next());
			
		}
	// pedir datos de cliente sobrecargada
		public void datosCliente(String mail) {
			this.client.setEmail(mail);
			System.out.println("Inserte el nombre");
			this.client.setNombre(sc.next());
			System.out.println("Inserte el domicilio");
			this.client.setDomicilio(sc.next());
			System.out.println("Inserte el nif");
			this.client.setNif(sc.next());
		}
	
	public int queLista() {
		int op = 0;
		try {
			System.out.println("1. Mostrar todos los clientes \n 2. Mostrar clientes estandar \n 3. Mostrar clientes premium");
			op = Integer.parseInt(System.console().readLine());
			// si la opcion no esta entre 1 y 3 se ejecuta una excepciÃ³n
			if ((op<1)||(op>3)) {
				throw new Exception ("#La opciÃ³n es invalida");
			}
		} catch (Exception e) {
			// en caso de excepciÃ³n se muestra el mensaje
			System.out.println(e.getMessage());
		}
		// devuelve la opcion
		return op;
	}

	public void verlista(String quieroLista) {
		// Lista de clientes, este metodo es indiferente a que tipo de lista, todos, premium o estandar
		// para formatearlo se modificaría en lugar de utilizar el toString se utilizaria un toArray por ejemplo
		
		System.out.println(quieroLista);
		
	}

		
}
