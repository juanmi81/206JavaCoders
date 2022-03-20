package javacoders.modelo;

public class Premium extends Cliente {
	private static final float CUOTA = 30;
	private static final float DESCUENTO = 20;
	
	public Premium(String email, String nombre, String domicilio, String nif, Double cuota, Double descuentoEnvio) {
		super(email, nombre, domicilio, nif);

	}

	@Override
	public String toString() {
		return "Premium [" + super.toString() + "]";
	}

	@Override
	public String tipoCliente() {
		return Cliente.PREMIUM;
	}

	@Override
	public float calcAnual() {
		return CUOTA;
	}

	@Override
	public float descuentoEnv() {
		return DESCUENTO;
	}
}
