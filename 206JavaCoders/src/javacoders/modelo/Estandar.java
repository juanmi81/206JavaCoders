package javacoders.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Estandar")
public class Estandar extends Cliente {

	public Estandar() {
		
	}
	
	public Estandar(String email, String nombre, String domicilio, String nif) {
		super(email, nombre, domicilio, nif);

	}

	@Override
	public String toString() {
		return "Estandar [" + super.toString() + "]";
	}

	@Override
	public String tipoCliente() {
		return Cliente.ESTANDAR;
	}

	@Override
	public float calcAnual() {
		return 0;
	}

	@Override
	public float descuentoEnv() {
		return 0;
	}
}
