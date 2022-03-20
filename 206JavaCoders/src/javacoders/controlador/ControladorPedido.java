package javacoders.controlador;

import javax.swing.JOptionPane;

import javacoders.modelo.Pedido;
import javacoders.vista.VistaPedido;

public class ControladorPedido {
	// Atributos
			private Pedido modelo;
			private VistaPedido vista;
			
			// geter y seter de atributos
			public Pedido getPedido(Pedido ped) {
				return modelo;
			}
			
			public void setPedido(Pedido ped) {
				
				
			}

			public VistaPedido getVista(Pedido cli) {
				return vista;
			}

			public void setPedido(VistaPedido vista) {
				this.vista = vista;
			}
			// visualizaciÃ³n del menu Pedido
			public void iniciar() {
				int op2 = 0;
				// bucle de subprograma Pedido
				while (op2 != 5) {
					op2 = vista.getOpcion();
					switch (op2) {
						case 1:
							//añadir Pedido
							nuevoPedido();
						case 2:
							//Eliminar Pedido
							eliminarPedido();
						case 3:
							//Mostrar pedidos pendientes
							mostrarPendientes();
						case 4:
							//Mostrar pedidos entregados
							mostrarEnviados();
						case 5:
							//fin del subprograma Pedido
							break;
					default:
						JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
					}
				};
			}

			private void nuevoPedido() {
				// TODO Auto-generated method stub
				
			}

			private void eliminarPedido() {
				// TODO Auto-generated method stub
				
			}

			private void mostrarPendientes() {
				// TODO Auto-generated method stub
				
			}

			private void mostrarEnviados() {
				// TODO Auto-generated method stub
				
			}
			
			
}
