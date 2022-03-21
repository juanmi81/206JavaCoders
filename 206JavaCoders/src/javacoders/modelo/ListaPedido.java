package javacoders.modelo;

public class ListaPedido extends Lista<Pedido> {
  // agregar pedido
  public void addPedido(Pedido a) {
		if(!lista.contains(a)) {
			lista.add(a);
		}
	}
}
