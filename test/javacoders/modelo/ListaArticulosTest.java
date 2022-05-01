package javacoders.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exception.DAOException;

public class ListaArticulosTest {

	@Test
	public void addArticulo_listaVacia() throws DAOException {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art = new Articulo(1, "Des", 100, 50, 30);
		listaArticulos.addArticulo(art);
		
		
		assertEquals(1, listaArticulos.lista.size());
		
		Articulo aux = listaArticulos.lista.get(0);
		assertEquals(art.getCodArticulo(), aux.getCodArticulo());
		assertEquals(art.getDescripcion(), aux.getDescripcion());
		assertEquals(art.getGastosEnvio(), aux.getGastosEnvio());
		assertEquals(art.getPvp(), aux.getPvp());
		assertEquals(art.getTiempoPrep(), aux.getTiempoPrep());
		
	}
	
	@Test
	public void addArticulo_existeEnLista() throws DAOException {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art = new Articulo(1, "Des", 100, 50, 30);
		listaArticulos.lista.add(art);
		
		Articulo art2 = new Articulo(2, "Des1", 100, 50, 30);
		listaArticulos.addArticulo(art2);
		
		assertEquals(1, listaArticulos.lista.size());
		
		Articulo aux = listaArticulos.lista.get(0);
		assertEquals(art.getCodArticulo(), aux.getCodArticulo());
		assertEquals(art.getDescripcion(), aux.getDescripcion());
		assertEquals(art.getGastosEnvio(), aux.getGastosEnvio());
		assertEquals(art.getPvp(), aux.getPvp());
		assertEquals(art.getTiempoPrep(), aux.getTiempoPrep());
		
	}
	
	@Test
	public void addDosArticulo_listaVacia() throws DAOException {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art1 = new Articulo(1, "Des", 100, 50, 30);
		Articulo art2 = new Articulo(2, "Des1", 100, 50, 30);
		listaArticulos.addArticulo(art1);
		listaArticulos.addArticulo(art2);
		
		assertEquals(2, listaArticulos.lista.size());
	}
}
