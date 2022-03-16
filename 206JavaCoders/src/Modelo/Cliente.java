package Modelo;

public class Cliente {

    private String email;
    private String nombre;
    private String domicilio;
    private String nif;

    public Cliente(String email, String nombre, String domicilio, String nif) {
        this.setEmail(email);
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setNif(nif);
    }

    public Cliente(String email, String nombre, String domicilio) {
        this.setEmail(email);
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
    }

    public Cliente(String email, String nombre) {
        this.setEmail(email);
        this.setNombre(nombre);
    }

    public Cliente(String email) {
        this.setEmail(email);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", nombre=" + nombre + "]";
    }
}
