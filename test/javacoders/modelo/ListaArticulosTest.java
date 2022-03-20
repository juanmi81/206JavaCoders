package javacoders.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ListaArticulosTest {

	@Test
	public void addArticulo_listaVacia() {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art = new Articulo("codArt", "Des", 100, 50, 30);
		listaArticulos.addArticulo(art);
		
		
		assertEquals(1, listaArticulos.lista.size());
		
		Articulo aux = listaArticulos.lista.get(0);
		assertEquals(art.getCodArticulo(), aux.getCodArticulo());
		assertEquals(art.getDescripcion(), aux.getDescripcion());
		assertEquals(art.getGastoEnvio(), aux.getGastoEnvio());
		assertEquals(art.getPvp(), aux.getPvp());
		assertEquals(art.getTiempoPrep(), aux.getTiempoPrep());
		
	}
	
	@Test
	public void addArticulo_existeEnLista() {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art = new Articulo("codArt", "Des", 100, 50, 30);
		listaArticulos.lista.add(art);
		
		Articulo art2 = new Articulo("codArt", "Des1", 100, 50, 30);
		listaArticulos.addArticulo(art2);
		
		assertEquals(1, listaArticulos.lista.size());
		
		Articulo aux = listaArticulos.lista.get(0);
		assertEquals(art.getCodArticulo(), aux.getCodArticulo());
		assertEquals(art.getDescripcion(), aux.getDescripcion());
		assertEquals(art.getGastoEnvio(), aux.getGastoEnvio());
		assertEquals(art.getPvp(), aux.getPvp());
		assertEquals(art.getTiempoPrep(), aux.getTiempoPrep());
		
	}
	
	@Test
	public void addDosArticulo_listaVacia() {
		ListaArticulos listaArticulos = new ListaArticulos();
		
		Articulo art1 = new Articulo("codArt1", "Des", 100, 50, 30);
		Articulo art2 = new Articulo("codArt2", "Des1", 100, 50, 30);
		listaArticulos.addArticulo(art1);
		listaArticulos.addArticulo(art2);
		
		assertEquals(2, listaArticulos.lista.size());
	}
}
