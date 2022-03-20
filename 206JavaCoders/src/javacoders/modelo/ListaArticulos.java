package javacoders.modelo;

public class ListaArticulos extends Lista<Articulo> {

	public void addArticulo(Articulo a) {
		if(!lista.contains(a)) {
			lista.add(a);
		}
	}

	@Override
	public String toString() {
		return "ListaArticulos [lista=" + lista + "]";
	}
	
}
