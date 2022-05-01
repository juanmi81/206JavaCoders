package javacoders.controlador;

import exception.DAOException;
import javacoders.modelo.Articulo;
import javacoders.modelo.Cliente;
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
			public void iniciar() throws DAOException {
				int op2 = 0;
				// bucle de subprograma Pedido
				while (op2 != 5) {
					op2 = vista.getOpcion();
					switch (op2) {
						case 1:
							//añadir Pedido
							nuevoPedido();
							break;
						case 2:
							//Eliminar Pedido
							eliminarPedido();
							break;
						case 3:
							//Mostrar pedidos pendientes
							mostrarPendientes();
							break;
						case 4:
							//Mostrar pedidos entregados
							mostrarEnviados();
							break;
						case 5:
							//fin del subprograma Pedido
							break;
					default:
						vista.imprimir("La opcion es incorrecta");
					}
				};
			}

			private void nuevoPedido() throws DAOException {
				
				// articulo del pedido -----------------------------------
				Articulo art = buscaarticulo();
				// si el articulo no existe
				if (art != null ) {
				
					// cliente del pedido --------------------------------------
					Cliente cli = buscacliente();
					// resto de datos --------------------------------------------
					this.vista.nuevoPedido();
					this.modelo.setCliente(cli);
					this.modelo.setArticulo(art);
					// guardar los datos
					datos.addPedido(this.modelo);
				}
			}
	
			// función para buscar un articulo
			public Articulo buscaarticulo() throws DAOException {
				int codarticulo = vista.NPpedirArticulo();
				// buscar articulo
				Articulo a = new Articulo(codarticulo,"", 0, 0, 0);
				a = datos.buscarArticulo(a);
				// si el articulo no existe
				if (a == null ) {
					vista.imprimir("el codigo no existe");
					return a;
				}
				return a;
			}
			
			// funcion para buscar un cliente, si no existe crea uno nuevo
			public Cliente buscacliente() {
				// pedimos el mail o codigo del cliente
				String codcliente = vista.NPpedirCliente();
				// guardamos la información en la variable correspondiente
				this.modelo.getCliente().setEmail(codcliente);
				// buscamos el cliente
				this.modelo.setCliente(datos.buscarCliente(this.modelo.getCliente()));
				// si no existe hay que crearlo ---------------------------------------------------------
				if (this.modelo.getCliente() == null ) {
					vista.imprimir("el cliente no existe, vamos a crear un nuevo cliente");
					// crear nuevo cliente
					ControladorCliente control = new ControladorCliente(this.datos);
					control.nuevoCliente(codcliente);
					// una vez creado hay que devolver el cliente.
					this.modelo.setCliente(control.getCliente());
				}
				return this.modelo.getCliente();
			}

			private void eliminarPedido() {
				// pedir codpedido
				String codpedido = vista.EPpedir();
				// buscar pedido
				Pedido c = new Pedido(codpedido,null,null,0,null);
				c = datos.buscarPedido(c);
				// si el articulo no existe se acaba la rutina
				if (c == null ) {
					vista.imprimir("el pedido no existe");
					return;
				}
				// si se puede se elimina
				if (c.pendiente()) {
					this.datos.eliminarPedido(c);
					vista.imprimir("el pedido se ha eliminado");
				}
				else {
					vista.imprimir("el pedido no se puede eliminar, esta fuera de plazo");
					return;
				}
			}

			private void mostrarPendientes() {
				// filtrar lista, pedir cliente o no
				String listamostrar;
				String codcli = vista.MPcliente();
				// crear lista 
				if (codcli == null) {
					listamostrar = this.datos.mostrarpendientes();
				}
				else {
					// guardamos la información en la variable correspondiente
					this.modelo.getCliente().setEmail(codcli);
					// buscamos el cliente
					this.modelo.setCliente(datos.buscarCliente(this.modelo.getCliente()));
					// si no existe fin de la funcion ---------------------------------------------------------
					if (this.modelo.getCliente() == null ) {
						vista.imprimir("el cliente no existe");
						listamostrar = null;
					}
					else {
						listamostrar = this.datos.mostrarpendientes(this.modelo.getCliente());
					}
				}
				//mostrar lista
				vista.imprimir(listamostrar);
			}

			private void mostrarEnviados() {
				String listamostrar;
				String codcli = vista.MPcliente();
				// crear lista 
				if (codcli == null) listamostrar = this.datos.mostrarenviados();
				else{
					// guardamos la información en la variable correspondiente
					this.modelo.getCliente().setEmail(codcli);
					// buscamos el cliente
					this.modelo.setCliente(datos.buscarCliente(this.modelo.getCliente()));
					// si no existe fin de la funcion ---------------------------------------------------------
					if (this.modelo.getCliente() == null ) {
						vista.imprimir("el cliente no existe");
						listamostrar = null;
					}
					else {
						listamostrar = this.datos.mostrarenviados(this.modelo.getCliente());
					}
				}
				//mostrar lista
				vista.imprimir(listamostrar);
			}
			
}
