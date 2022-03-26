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
			int op2 = 0;
			// bucle de subprograma Clientes
			while (op2 != 3) {
				op2 = vista.getOpcion();
				switch (op2) {
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
						break;
				default:
					System.out.println("La opcion es incorrecta");
				}
			};
		}
		// --------------------------------------------------------   Funciones de nuevo cliente -------------------------------------
		public void nuevoCliente() {
			
			// TODO Auto-generated method stub
			
			int op2 = this.vista.nuevoCliente();
			this.vista.datosCliente();
			switch (op2) {
				case 1:
					//nuevo cliente estandar
					Premium cliente = new Premium (this.modelo.getEmail(),this.modelo.getNombre(),this.modelo.getDomicilio(),this.modelo.getNif() );
					datos.addCliente(cliente);
				case 2:
					//Nuevo cliente premium
					Estandar cliente2 = new Estandar(this.modelo.getEmail(),this.modelo.getNombre(),this.modelo.getDomicilio(),this.modelo.getNif());
					datos.addCliente(cliente2);
				case 3:
					//cancelar nuevo cliente
					break;
			}
		}
		// funcion sobrecargada de nuevo cliente
		public void nuevoCliente(String mail) {
			
			// TODO Auto-generated method stub
			int op2 = this.vista.nuevoCliente();
			this.vista.datosCliente(mail);
			switch (op2) {
				case 1:
					//nuevo cliente estandar
					Premium cliente = new Premium (mail,this.modelo.getNombre(),this.modelo.getDomicilio(),this.modelo.getNif() );
					datos.addCliente(cliente);
				case 2:
					//Nuevo cliente premium
					Estandar cliente2 = new Estandar(mail,this.modelo.getNombre(),this.modelo.getDomicilio(),this.modelo.getNif() );
					datos.addCliente(cliente2);
				case 3:
					//cancelar nuevo cliente
					break;
			}
			
		}

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
