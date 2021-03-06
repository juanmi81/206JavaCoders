package javacoders.controlador;

import DAO.Conexion;
import exception.DAOException;
import javacoders.modelo.Datos;
import javacoders.vista.VMenuPrincipal;

// clase de menu princiapl, desde aqui se selecciona que vamos a gestionar
public class ControlerMain {

	private String[] args;
	// inicializar clases
	private VMenuPrincipal menu = new VMenuPrincipal(args);
	// gestion de aticulos
	private Datos datos;
	private ControladorArticulo CArticulo;
	private ControladorPedido CPedido;
	private ControladorCliente CCliente;

	public ControlerMain() {
		datos = new Datos();
		CArticulo = new ControladorArticulo(datos);
		CPedido = new ControladorPedido(datos);
		CCliente = new ControladorCliente(datos);
	}

	// metodo para el control del menu principal
	public void iniciar() throws DAOException {

		// inicializar variables
		int op = 0;

		// Bucle del programa
		while (op != 4) {
			op = menu.getOpcion(args);
			switch (op) {
			case 1:
				// gestion clientes
				CCliente.iniciar();
				break;
			case 2:
				// Gestion Articulos
				CArticulo.iniciar();
				break;
			case 3:
				// Gestion Pedidos
				CPedido.iniciar();
				break;
			case 4:
				// fin de ejecución del programa
				menu.OPfinal();
				break;
			}
		}
		;
	}

	// Create an EntityManagerFactory when you start the application.
	public static void main(String[] args) throws Exception {
		ControlerMain controlerMain = new ControlerMain();
		controlerMain.iniciar();

		// NEVER FORGET TO CLOSE THE ENTITY_MANAGER_FACTORY
		Conexion.ENTITY_MANAGER_FACTORY.close();
	}
}
