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
					case 2:
						//Mostrar clientes, podra seleccionar entre todos, estandar o premium
						verClientes();
					case 3:
						//fin del subprograma Clientes
						break;
				default:
					JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
				}
			};
		}

		private void nuevoCliente() {
			// TODO Auto-generated method stub
			
		}

		private void verClientes() {
			// TODO Auto-generated method stub
			
		}
}
