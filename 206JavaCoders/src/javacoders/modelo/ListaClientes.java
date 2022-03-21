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
}
