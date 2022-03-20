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
	
	public void addArticulo(Articulo articulo) {
		listaArticulos.addArticulo(articulo);
	}

	@Override
	public String toString() {
		return "Datos [listaArticulos=" + listaArticulos + ", listaClientes=" + listaClientes + ", listaPedido="
				+ listaPedido + "]";
	}
	
	
}
