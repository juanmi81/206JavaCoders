package javacoders.modelo;

public class ListaClientes extends Lista<Cliente> {

  	// Ingresar nuevo cliente a la lista
  	public void addCliente(Cliente cliente) {
    		if(!lista.contains(cliente)) {
			lista.add(cliente);
		}
	}
	// busca un cliente y lo devuelve
  	public Cliente existe(Cliente b) {
		int indice = lista.indexOf(b);
		if (indice !=-1) {
			return lista.get(indice);
		}
		else return null;
	}
	// listado de clientes premium
	public String VerPremium() {
		String premium = "";
		for (Cliente tmp: this.lista) {
			if (tmp instanceof Premium) {
				premium += tmp.toString();
			} 
		}
		return premium;
	}
	// listado de clientes estandar
	public String VerEstandar() {
		String estandar = "";
		for (Cliente tmp: this.lista) {
			if (tmp instanceof Estandar) {
				estandar += tmp.toString();
			} 
		}
		return estandar;
	}
}
