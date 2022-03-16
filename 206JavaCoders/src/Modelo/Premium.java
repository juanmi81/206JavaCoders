package Modelo;

public class Premium extends Cliente{
	 public Premium(String email, String nombre, String domicilio, String nif, Double cuota, Double descuentoEnvio) {
	        super(email, nombre, domicilio, nif);
	        
	    }

	    @Override
	    public String toString() {
	        return "Premium []";
	    }
}
