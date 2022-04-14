package javacoders.DAO;

import javacoders.modelo.Articulo;
import javacoders.modelo.Cliente;
import javacoders.modelo.Pedido;

import java.sql.SQLException;

public class Datos_DAO {
	
	// ********* metodos y funciones de la Lista Articulos **************
	// añadir un Articulo
	Articulo articulo;
	Cliente cliente;
	Pedido pedido;
	
	public void addArticulo(Articulo articulo) throws SQLException {
		articulo.addArticulo();
	}
		// busca un articulo y lo devuelve
/*		public Articulo buscarArticulo(Articulo art) {
			return listaArticulos.existe(art);
		}*/
		// ********* metodos y funciones de la Lista Clientes **************
		// añadir un cliente
/*		public void addCliente(Cliente cliente) {
			// llamar al metodo correspondiente pasando los datos del cliente
			listaClientes.addCliente(cliente);
		}*/
		// toString solo para la lista clientes
/*		public String toStringClientes() {
			return "Datos [listaClientes=" + listaClientes + "]";
		}*/		
		// toString solo de clientes estandar
/*		public String toStringEstandar() {
			return listaClientes.VerEstandar();
		}*/
		// toString solo de clientes premium
/*		public String toStringPremium() {
			return listaClientes.VerPremium();
		}*/
		// busca un cliente y lo devuelve
/*		public Cliente buscarCliente(Cliente b) {
			return listaClientes.existe(b);
		}*/
		// ********* metodos y funciones de la Lista Pedidos **************
		// añadir un pedido	
/*		public void addPedido(Pedido pedido) {
			listaPedido.addPedido(pedido);
		}*/
		// buscar pedido
/*		public Pedido buscarPedido(Pedido c) {
			return listaPedido.existe(c);
		}*/
		// eliminar pedido
/*		public void eliminarPedido(Pedido c) {
			listaPedido.eliminarPedido(c);
		}*/
		// mostrar todos los pedidos pendientes
/*		public String mostrarpendientes() {
			return listaPedido.pendiente();
		}*/
		// mostrar pedidos pendientes filtrado por cliente
/*		public String mostrarpendientes(Cliente cliente) {
			return listaPedido.pendiente(cliente);
		}*/
		// mostrar pedidos enviados
/*		public String mostrarenviados() {
			return listaPedido.enviados();
		}
		public String mostrarenviados(Cliente cliente) {
			return listaPedido.enviados(cliente);
		}
		*/
		// ********* otros metodos y funciones ****************************
/*		@Override
		public String toString() {
			return "Datos [listaArticulos=" + listaArticulos + ", listaClientes=" + listaClientes + ", listaPedido="
					+ listaPedido + "]";
		}
	*/
}
