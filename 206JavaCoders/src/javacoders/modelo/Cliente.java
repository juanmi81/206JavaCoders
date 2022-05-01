package javacoders.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@DiscriminatorColumn(name="tipo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cliente {

	public static final String ESTANDAR = "estandar";
	public static final String PREMIUM = "premium";
	
	@Id
    @Column(name = "email", unique = true)
	private String email;
	
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "direccion")
	private String domicilio;
    
    @Column(name = "nif", unique = true)
	private String nif;

    public Cliente() {
    	
    }
    
	public Cliente(String email, String nombre, String domicilio, String nif) {
		this.email = email;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.nif = nif;
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

	public abstract String tipoCliente();

	public abstract float calcAnual();

	public abstract float descuentoEnv();

	@Override
	public String toString() {
		return "[domicilio=" + domicilio + ", email=" + email + ", nif=" + nif + ", nombre=" + nombre + "]";
	}
}
