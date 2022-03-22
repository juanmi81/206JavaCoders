package javacoders.controlador;

import javax.swing.JOptionPane;

import javacoders.modelo.Datos;
import javacoders.modelo.Pedido;
import javacoders.vista.VistaPedido;

public class ControladorPedido {
	// Atributos
			private Pedido modelo;
			private VistaPedido vista;
			private Datos datos;
			
			public ControladorPedido(Datos datos) {
				this.datos= datos;
			}
			
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
				
				// articulo del pedido -----------------------------------
				String codarticulo = vista.NPpedirArticulo();
				// buscar articulo
				Articulo a = new Articulo(codarticulo,"", 0, 0, 0);
				a.setCodArticulo(codarticulo);
				a = datos.buscarArticulo(a);
				// si el articulo no existe se acaba la rutina
				if (a == null ) {
					System.out.println("el codigo no existe");
					return;
				}
				
				// cliente del pedido --------------------------------------
				String codcliente = vista.NPpedirCliente();
				// se guarda en un objeto cliente
				Cliente b = null ;
				b.setEmail(codcliente);
				b = datos.buscarCliente(b);
				// si el cliente no existe
				if (b == null ) {
					System.out.println("el cliente no existe, vamos a crear un nuevo cliente");
					// crear nuevo cliente  ????????????????????????
				}
				// resto de datos --------------------------------------------
				this.vista.nuevoPedido();
				this.modelo.setCliente(b);
				this.modelo.setArticulo(a);
				// guardar los datos
				datos.addPedido(this.modelo);
			}

			private void eliminarPedido() {
				// pedir codpedido
				String codarticulo = vista.NPpedirArticulo();
				// buscar pedido
				Articulo a = new Articulo(codarticulo,"", 0, 0, 0);
				a.setCodArticulo(codarticulo);
				a = datos.buscarArticulo(a);
				// si el articulo no existe se acaba la rutina
				if (a == null ) {
					System.out.println("el codigo no existe");
					return;
				}
				// si se puede se elimina
				
			}

			private void mostrarPendientes() {
				// filtrar lista, pedir cliente o no
				
				// crear lista 
				
				//mostrar lista
				
			}

			private void mostrarEnviados() {
				// filtrar lista, pedir cliente o no
				
				// crear lista 
				
				//mostrar lista
				
			}
			
			
}
