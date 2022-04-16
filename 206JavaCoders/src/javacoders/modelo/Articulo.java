package javacoders.modelo;

public class Articulo {

	private String codArticulo;
	private String descripcion;
	private float pvp;
	private float gastoEnvio;
	private int tiempoPrep;

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

	/*
	 * public Articulo(char codArticulo, String descripcion, double pvp) {
	 * 
	 * this.codArticulo = codArticulo; this.descripcion = descripcion; this.pvp =
	 * pvp;
	 * 
	 * }
	 * 
	 * public Articulo(char codArticulo, String descripcion) {
	 * 
	 * this.codArticulo = codArticulo; this.descripcion = descripcion;
	 * 
	 * }
	 * 
	 * public Articulo(char codArticulo) {
	 * 
	 * this.codArticulo = codArticulo;
	 * 
	 * }
	 */

	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Articulo(String descripcion, float pvp, float gastoEnvio, int tiempoPrep) {
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
		return "Articulo [codArticulo=" + codArticulo + ", descripcion=" + descripcion + ", pvp=" + pvp
				+ ", tiempoPrep=" + tiempoPrep + "]";
	}
}
