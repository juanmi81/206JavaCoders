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
			if () {
				pendent += tmp.toString();
			} 
		}
		return pendent;
	}
	// mostrar pendientes filtrado por cliente
	public String pendiente(String codcli) {
		String pendent= "";
		for (Pedido tmp: this.lista) {
			// si el pedido es del cliente
			if () {
				// si el pedido esta pendiente
				if() {	
				pendent += tmp.toString();
				}
			} 
		}
		return pendent;
	}
	// mostrar enviados
	public String enviados() {
		String envio= "";
		for (Pedido tmp: this.lista) {
			// si el pedido es del cliente
			if () {
				// si el pedido esta pendiente
				if() {	
				envio += tmp.toString();
				}
			} 
		}
		return envio;
	}
	// mostrar enviados filtrado por cliente
	public String enviados(String codcli) {
		String envio= "";
		for (Pedido tmp: this.lista) {
			// si el pedido es del cliente
			if () {
				// si el pedido esta pendiente
				if() {	
				envio += tmp.toString();
				}
			} 
		}
		return envio;
	}
}
