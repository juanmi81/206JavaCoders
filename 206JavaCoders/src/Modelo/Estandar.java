package Modelo;

public class Estandar extends Cliente {

    public Estandar(String email, String nombre, String domicilio, String nif) {
        super(email, nombre, domicilio, nif);
        
    }

    @Override
    public String toString() {
        return "Estandar []";
    }
}
