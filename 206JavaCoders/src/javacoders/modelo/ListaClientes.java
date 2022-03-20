package javacoders.modelo;

public class ListaClientes extends Lista<Cliente> {

  // Ingresar nuevo cliente a la lista
  ublic void addCliente(Cliente cliente) {
    if(!lista.contains(cliente)) {
			lista.add(cliente);
		}
	}
  
}
