package javacoders.modelo;

import exception.DAOException;

public class Datos {

	private ListaArticulos listaArticulos;
	private ListaClientes listaClientes;
	private ListaPedido listaPedido;
	
	public Datos() {
		listaArticulos = new ListaArticulos();
		listaClientes = new ListaClientes();
		listaPedido = new ListaPedido();
	}
	// ********* metodos y funciones de la Lista Articulos **************
	// añadir un Articulo
	public void addArticulo(Articulo articulo) throws DAOException {
		listaArticulos.addArticulo(articulo);
	}
	// busca un articulo y lo devuelve
	public Articulo buscarArticulo(Articulo art) throws DAOException {
		return listaArticulos.existe(art);
	}
	
	public String MostrarArticulos() {
		return listaArticulos.toString();
	}

	
	// ********* metodos y funciones de la Lista Clientes **************
	// añadir un cliente
	public void addCliente(Cliente cliente) {
		// llamar al metodo correspondiente pasando los datos del cliente
		listaClientes.addCliente(cliente);
	}
	// toString solo para la lista clientes
	public String toStringClientes() {
		return "Datos [listaClientes=" + listaClientes + "]";
	}		
	// toString solo de clientes estandar
	public String toStringEstandar() {
		return listaClientes.VerEstandar();
	}
	// toString solo de clientes premium
	public String toStringPremium() {
		return listaClientes.VerPremium();
	}
	// busca un cliente y lo devuelve
	public Cliente buscarCliente(Cliente b) {
		return listaClientes.existe(b);
	}
	// ********* metodos y funciones de la Lista Pedidos **************
	// añadir un pedido	
	public void addPedido(Pedido pedido) {
		listaPedido.addPedido(pedido);
	}
	// buscar pedido
	public Pedido buscarPedido(Pedido c) {
		return listaPedido.existe(c);
	}
	// eliminar pedido
	public void eliminarPedido(Pedido c) {
		listaPedido.eliminarPedido(c);
	}
	// mostrar todos los pedidos pendientes
	public String mostrarpendientes() {
		return listaPedido.pendiente();
	}
	// mostrar pedidos pendientes filtrado por cliente
	public String mostrarpendientes(Cliente cliente) {
		return listaPedido.pendiente(cliente);
	}
	// mostrar pedidos enviados
	public String mostrarenviados() {
		return listaPedido.enviados();
	}
	public String mostrarenviados(Cliente cliente) {
		return listaPedido.enviados(cliente);
	}
	
	// ********* otros metodos y funciones ****************************
	@Override
	public String toString() {
		return "Datos [listaArticulos=" + listaArticulos + ", listaClientes=" + listaClientes + ", listaPedido="
				+ listaPedido + "]";
	}
	
	
}
