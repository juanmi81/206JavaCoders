package javacoders.controlador;

import java.util.ArrayList;
import java.util.List;

import DAO.ClienteDAO2;
import DAO.Factory;
import DAO.FactoryDAO;
import exception.DAOException;
import javacoders.modelo.Cliente;
import javacoders.modelo.Datos;
import javacoders.modelo.Estandar;
import javacoders.modelo.Premium;
import javacoders.vista.VistaCliente;

public class ControladorCliente {
	// Atributos
	private Cliente modelo;
	private VistaCliente vista;
	private Datos datos;
	private ClienteDAO2 clienteDAO;

	public ControladorCliente(Datos datos) {
		this.datos = datos;
		this.vista = new VistaCliente();
		FactoryDAO factoryDAO = new Factory();
		clienteDAO = (ClienteDAO2) factoryDAO.crear(FactoryDAO.CLIENTE);
	}

	// geter y seter de atributos
	public Cliente getCliente(Cliente cli) {
		return modelo;
	}

	public Cliente getCliente() {
		return modelo;
	}

	public void setCliente(Cliente cli) {

	}

	public VistaCliente getVista(Cliente cli) {
		return vista;
	}

	public void setVista(VistaCliente vista) {
		this.vista = vista;
	}

	// visualización del menu clientes
	public void iniciar() {
		int opcli = 0;
		// bucle de subprograma Clientes
		while (opcli != 3) {
			opcli = vista.getOpcion();
			switch (opcli) {
			case 1:
				// añadir cliente
				nuevoCliente();
				break;
			case 2:
				// Mostrar clientes, podra seleccionar entre todos, estandar o premium
				verClientes();
				break;
			case 3:
				// fin del subprograma Clientes
				vista.imprimir("Salir de la gestion de clientes");
				break;
			}
		}
		;
	}

// ---------------------------------- nuevo cliente ---------------------------------------------------------------------
	public void nuevoCliente() {

		// que tipo de cliente
		int op2 = this.vista.nuevoCliente();
		if (op2 != 3) {
			switch (op2) {
			case 1:
				// nuevo cliente estandar
				this.modelo = new Estandar(null, null, null, null);
				break;
			case 2:
				// Nuevo cliente premium
				modelo = new Premium(null, null, null, null);
				break;
			}
			// datos del cliente
			this.modelo.setEmail(this.vista.damemail());
			this.modelo.setNombre(this.vista.damenombre());
			this.modelo.setDomicilio(this.vista.damedomicilio());
			this.modelo.setNif(this.vista.damenif());
			// añadir a la lista
			// datos.addCliente(this.modelo);
			// añadirlo a la base de datos
			try {
				clienteDAO.insertar(modelo);
			}  catch (DAOException e) {
				System.err.println(e.getMessage());
			}
		} else
			System.out.println("Salir sin crear nuevo cliente");
	}

	// nuevo cliente sobrecargado
	public void nuevoCliente(String mail) {
		// que tipo de cliente
		int op2 = this.vista.nuevoCliente();
		if (op2 != 3) {
			switch (op2) {
			case 1:
				// nuevo cliente estandar
				this.modelo = new Estandar(null, null, null, null);
				break;
			case 2:
				// Nuevo cliente premium
				modelo = new Premium(null, null, null, null);
				break;
			}
			// datos del cliente
			this.modelo.setEmail(mail);
			this.modelo.setEmail(this.vista.damenombre());
			this.modelo.setEmail(this.vista.damedomicilio());
			this.modelo.setEmail(this.vista.damenif());
			System.out.println(this.modelo);
			// aÃ±adir cliente a la lista
			datos.addCliente(this.modelo);
		}
		// si se cancela ...
		else
			vista.imprimir("Salir sin crear nuevo cliente");

	}
	// funcion sobrecargada de nuevo cliente

	// -------------------------------------- Ver clientes, clientes estandar y
	// clientes premium ---------------------------------------------------/
	private void verClientes() {
		List lstCliente = new ArrayList<>();
		// variable lista de clientes, es lo que se va a mostrar por pantalla
		// String quieroLista = "";
		// preguntaremos que opcion quiere el usuario, listar todos los clientes, los
		// premium o los estandar
		int op2 = 0;
		op2 = vista.queLista();

		try {
			// seleccionamos la opcion correcta y guardamos la lista en la variable
			// quieroLista
			switch (op2) {
			case 1:
				lstCliente = clienteDAO.obtener();
				break;
				// quieroLista = this.datos.toStringClientes();
			case 2:
				// solo clientes standar
				lstCliente = clienteDAO.findEstandar();
				// quieroLista = this.datos.toStringEstandar();
				break;
			case 3:
				// solo clientes premium
				lstCliente = clienteDAO.findPremium();
				// quieroLista = this.datos.toStringPremium();
				break;
			default:
				vista.imprimir("La opcion es incorrecta");
			}
			// se envia a imprimir por pantalla la lista resultante
			this.vista.imprimir(lstCliente);
		} catch (Exception e) {
			System.err.println("Erro al listar los clientes");
			e.printStackTrace();
		}
	}
}
