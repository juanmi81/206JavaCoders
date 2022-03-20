package javacoders.modelo;

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
	public void addArticulo(Articulo articulo) {
		listaArticulos.addArticulo(articulo);
	}
	
	
	// ********* metodos y funciones de la Lista Clientes **************
	// añadir un cliente
	public void addCliente(Cliente cliente) {
		// llamar al metodo correspondiente pasando los datos del cliente
		listaClientes.addCliente(Cliente cliente)
	}

	// ********* metodos y funciones de la Lista Pedidos **************
	
	
	// ********* otros metodos y funciones ****************************
	@Override
	public String toString() {
		return "Datos [listaArticulos=" + listaArticulos + ", listaClientes=" + listaClientes + ", listaPedido="
				+ listaPedido + "]";
	}
	
	
}
