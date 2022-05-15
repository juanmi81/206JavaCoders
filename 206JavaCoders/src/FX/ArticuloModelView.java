package FX;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ArticuloModelView {

	private StringProperty codArticulo;

	private StringProperty descripcion;

	private StringProperty pvp;

	private StringProperty gastosEnvio;

	private StringProperty tiempoPrep;

	public ArticuloModelView(int codArticulo, String descripcion, float pvp, float gastoEnvio, int tiempoPrep) {
		this.codArticulo = new SimpleStringProperty(Integer.toString(codArticulo));
		this.descripcion = new SimpleStringProperty(descripcion);
		this.pvp = new SimpleStringProperty(Float.toString(pvp));
		this.gastosEnvio = new SimpleStringProperty(Float.toString(gastoEnvio));
		this.tiempoPrep = new SimpleStringProperty(Integer.toString(tiempoPrep));

	}

	public StringProperty getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(StringProperty codArticulo) {
		this.codArticulo = codArticulo;
	}

	public StringProperty getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(StringProperty descripcion) {
		this.descripcion = descripcion;
	}

	public StringProperty getPvp() {
		return pvp;
	}

	public void setPvp(StringProperty pvp) {
		this.pvp = pvp;
	}

	public StringProperty getGastosEnvio() {
		return gastosEnvio;
	}

	public void setGastosEnvio(StringProperty gastosEnvio) {
		this.gastosEnvio = gastosEnvio;
	}

	public StringProperty getTiempoPrep() {
		return tiempoPrep;
	}

	public void setTiempoPrep(StringProperty tiempoPrep) {
		this.tiempoPrep = tiempoPrep;
	}
	
}
