package javacoders.controlador;

import javax.swing.JOptionPane;

import javacoders.modelo.Cliente;
import javacoders.modelo.Datos;
import javacoders.vista.VistaCliente;


public class ControladorCliente {
	// Atributos
		private Cliente modelo;
		private VistaCliente vista;
		private Datos datos;
		
		public ControladorCliente(Datos datos) {
			this.datos= datos;
		}
		
		// geter y seter de atributos
		public Cliente getCliente(Cliente cli) {
			return modelo;
		}
		
		public void setCliente(Cliente cli) {
			
			
		}

		public VistaCliente getVista(Cliente cli) {
			return vista;
		}

		public void setVista(VistaCliente vista) {
			this.vista = vista;
		}
		// visualizaciÃ³n del menu clientes
		public void iniciar() {
			int opcli = 0;
			// bucle de subprograma Clientes
			while (opcli != 3) {
				opcli = vista.getOpcion();
				switch (opcli) {
					case 1:
						//añadir cliente
						nuevoCliente();
						break;
					case 2:
						//Mostrar clientes, podra seleccionar entre todos, estandar o premium
						verClientes();
						break;
					case 3:
						//fin del subprograma Clientes
						System.out.println("saliendo de la gestion de clientes");
						break;
				default:
					System.out.println("La opcion es incorrecta");
				}
			};
		}
// ---------------------------------- nuevo cliente ---------------------------------------------------------------------
		public void nuevoCliente() {
			
			// que tipo de cliente
			int op2 = this.vista.nuevoCliente();
			if (op2 != 3) {
				switch (op2) {
					case 1:
						//nuevo cliente estandar
						this.modelo = new Estandar(null,null,null,null);
						break;
					case 2:
						//Nuevo cliente premium
						modelo = new Premium(null,null,null,null);
						break;
				}
				// datos del cliente
				this.modelo.setEmail(this.vista.damemail());
				this.modelo.setNombre(this.vista.damenombre());
				this.modelo.setDomicilio(this.vista.damedomicilio());
				this.modelo.setNif(this.vista.damenif());
				// añadir a la lista
				datos.addCliente(this.modelo);
			}else System.out.println("Salir sin crear nuevo cliente");
		}
		// nuevo cliente sobrecargado
		public void nuevoCliente(String mail) {
			//que tipo de cliente
			int op2 = this.vista.nuevoCliente();
			if (op2 != 3) {
				switch (op2) {
					case 1:
						//nuevo cliente estandar
						this.modelo = new Estandar(null,null,null,null);
						break;
					case 2:
						//Nuevo cliente premium
						modelo = new Premium(null,null,null,null);
						break;
				}
				// datos del cliente
				this.modelo.setEmail(mail);
				this.modelo.setEmail(this.vista.damenombre());
				this.modelo.setEmail(this.vista.damedomicilio());
				this.modelo.setEmail(this.vista.damenif());
				System.out.println(this.modelo);
				// añadir cliente a la lista
				datos.addCliente(this.modelo);
			}
			// si se cancela ...
			else System.out.println("Salir sin crear nuevo cliente");
			
		}
		// funcion sobrecargada de nuevo cliente

		private void verClientes() {
			// variable lista de clientes, es lo que se va a mostrar por pantalla
			String quieroLista;
			// preguntaremos que opcion quiere el usuario, listar todos los clientes, los premium o los estandar
			int op2 = 0;
			op2 = vista.queLista();
			// seleccionamos la opcion correcta y guardamos la lista en la variable quieroLista
			switch (op2) {
				case 1:
					quieroLista = this.datos.toStringClientes();
				case 2:
					//solo clientes standar
					quieroLista = "";
				case 3:
					//solo clientes premium
					quieroLista = "";
				default:
					System.out.println(null, "La opcion es incorrecta");
			}
			// se envia a imprimir por pantalla la lista resultante
			this.vista.verlista(quieroLista);
			
		}
}
