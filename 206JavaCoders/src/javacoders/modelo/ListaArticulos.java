package javacoders.modelo;

public class ListaArticulos extends Lista<Articulo> {
	// añadir un articulo
	public void addArticulo(Articulo a) {
		if(!lista.contains(a)) {
			lista.add(a);
		}
	}
	// busca un articulo y lo devuelve
	public Articulo existe(Articulo a) {
		int indice = lista.indexOf(a);
		if (indice !=-1) {
			return lista.get(indice);
		}
		else return null;
	}
	
	@Override
	public String toString() {
		return "ListaArticulos [lista=" + lista + "]";
	}
	
}
