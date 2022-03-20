package javacoders.modelo;

import java.util.Timer;

public class Articulo {

	private char codArticulo;
	private String descripcion;
	private float pvp;
	private float gastoEnvio;
	private Timer tiempoPrep;

	/**
	 * @param codArticulo
	 * @param descripcion
	 * @param pvp
	 * @param tiempoPrep
	 */

	public Articulo(char codArticulo, String descripcion, float pvp, float gastoEnvio, Timer tiempoPrep) {

		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.gastoEnvio = gastoEnvio;
		this.tiempoPrep = tiempoPrep;

	}

	/*public Articulo(char codArticulo, String descripcion, double pvp) {

		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.pvp = pvp;

	}

	public Articulo(char codArticulo, String descripcion) {

		this.codArticulo = codArticulo;
		this.descripcion = descripcion;

	}

	public Articulo(char codArticulo) {

		this.codArticulo = codArticulo;

	}*/

	public float getGastoEnvio() {
		return gastoEnvio;
	}

	public void setGastoEnvio(float gastoEnvio) {
		this.gastoEnvio = gastoEnvio;
	}

	public char getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(char codArticulo) {
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

	public Timer getTiempoPrep() {
		return tiempoPrep;
	}

	public void setTiempoPrep(Timer tiempoPrep) {
		this.tiempoPrep = tiempoPrep;
	}

	@Override
	public String toString() {
		return "Articulo [codArticulo=" + codArticulo + ", descripcion=" + descripcion + ", pvp=" + pvp
				+ ", tiempoPrep=" + tiempoPrep + "]";
	}
}
