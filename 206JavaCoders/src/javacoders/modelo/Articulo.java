package javacoders.modelo;
import java.sql.SQLException;

import javacoders.DAO.conexion;

public class Articulo {

	private String codArticulo;
	private String descripcion;
	private float pvp;
	private float gastoEnvio;
	private int tiempoPrep;

	private conexion qc = new conexion();
	/**
	 * @param codArticulo
	 * @param descripcion
	 * @param pvp
	 * @param tiempoPrep
	 */

	public Articulo(String codArticulo, String descripcion, float pvp, float gastoEnvio, int tiempoPrep) {

		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.gastoEnvio = gastoEnvio;
		this.tiempoPrep = tiempoPrep;
	}

	public float getGastoEnvio() {
		return gastoEnvio;
	}

	public void setGastoEnvio(float gastoEnvio) {
		this.gastoEnvio = gastoEnvio;
	}

	public String getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(String codArticulo) {
		this.codArticulo = codArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	public int getTiempoPrep() {
		return tiempoPrep;
	}

	public void setTiempoPrep(int tiempoPrep) {
		this.tiempoPrep = tiempoPrep;
	}

	public boolean equals(Object obj) {
		boolean eq = false;
		if (obj instanceof Articulo) {
			Articulo art = (Articulo) obj;

			if (art.codArticulo.equals(codArticulo)) {
				eq = true;
			}
		}

		return eq;
	}

	@Override
	public String toString() {
		return "Articulo [codArticulo=" + codArticulo + ", descripcion=" + descripcion + ", pvp=" + pvp + ", tiempoPrep=" + tiempoPrep + "]";
	}

	
	// DAO parte de la base de datos
	public void addArticulo() throws SQLException {
			String query = "INSERT INTO db_producto3.artículo (Descripción, PVP, GastosEnvio, TiempoPrep) VALUES (" + descripcion + "," + pvp + "," + gastoEnvio+"," + tiempoPrep +");";
			qc.setQuery(query);
	}
	
	
}
