package javacoders.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codArticulo", unique = true)
	private int codArticulo;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "pvp", unique = true)
	private float pvp;

	@Column(name = "gastosEnvio", unique = true)
	private float gastosEnvio;

	@Column(name = "tiempoPrep", unique = true)
	private int tiempoPrep;

	/**
	 * @param codArticulo
	 * @param descripcion
	 * @param pvp
	 * @param tiempoPrep
	 */
	public Articulo(int codArticulo, String descripcion, float pvp, float gastoEnvio, int tiempoPrep) {
		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.gastosEnvio = gastoEnvio;
		this.tiempoPrep = tiempoPrep;

	}

	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Articulo(String descripcion, float pvp, float gastoEnvio, int tiempoPrep) {
		this.descripcion = descripcion;
		this.pvp = pvp;
		this.gastosEnvio = gastoEnvio;
		this.tiempoPrep = tiempoPrep;
	}

	public float getGastosEnvio() {
		return gastosEnvio;
	}

	public void setGastosEnvio(float gastoEnvio) {
		this.gastosEnvio = gastoEnvio;
	}

	public int getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(int codArticulo) {
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

			if (art.codArticulo == codArticulo) {
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
