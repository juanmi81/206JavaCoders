package javacoders.modelo;

public class ListaPedido extends Lista<Pedido> {
  	// agregar pedido
  	public void addPedido(Pedido a) {
		if(!lista.contains(a)) {
			lista.add(a);
		}
	}
	// buscar pedido
	public Pedido existe(Pedido c) {
		int indice = lista.indexOf(c);
		if (indice !=-1) {
			return lista.get(indice);
		}
		else return null;
	}
	// eliminar pedido
	public void eliminarPedido(Pedido c) {
		int indice = lista.indexOf(c);
		lista.remove(indice);
	}
}
