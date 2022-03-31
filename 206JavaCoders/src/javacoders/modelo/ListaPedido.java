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
	// mostrar pendientes
	public String pendiente() {
		String pendent= "";
		for (Pedido tmp: this.lista) {
			// si el pedido esta pendiente
			if (tmp.pendiente()) {
				pendent += tmp.toString();
			} 
		}
		return pendent;
	}
	// mostrar pendientes filtrado por cliente
	public String pendiente(Cliente cliente) {
		String pendent= "";
		for (Pedido tmp: this.lista) {
			// si el pedido es del cliente
			if (tmp.getCliente().equals(cliente)) {
				// si el pedido esta pendiente
				if(tmp.pendiente()) {	
				pendent += tmp.toString();
				}
			} 
		}
		return pendent;
	}
	// mostra enviados
	public String enviados() {
		String envio= "";
		for (Pedido tmp: this.lista) {
				// si el pedido esta pendiente
				if(!tmp.pendiente()) {	
				envio += tmp.toString();
				} 
		}
		return envio;
	}
	// mostrar enviados filtrados por cliente
	public String enviados(Cliente cliente) {
		String envio= "";
		for (Pedido tmp: this.lista) {
			// si el pedido es del cliente
			if (tmp.getCliente().equals(cliente)) {
				// si el pedido esta pendiente
				if(!tmp.pendiente()) {
				envio += tmp.toString();
				}
			} 
		}
		return envio;
	}
}
