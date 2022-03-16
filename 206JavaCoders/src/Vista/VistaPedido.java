package Vista;

import Modelo.Pedido;

public class VistaPedido {

	Pedido ped;
	
	public VistaPedido(Pedido pedidoinstanciado) {
        this.ped = pedidoinstanciado;
    }

 // visualización del menu articulos
	public int getOpcion() {
		int op = 0;
		try {
			System.out.println(" 1. Agregar Articulo \n 2. Mostrar Articulo \n 3. Mostrar pedidos pendientes \n 4. Mostrar pedidos realizados \n 5. Salir del menu Articulos");
			op = Integer.parseInt(System.console().readLine());
			// si la opcion no esta entre 1 y 3 se ejecuta una excepción
			if ((op<1)||(op>5)) {
				throw new Exception ("#La opción es invalida");
			}
		} catch (Exception e) {
			// en caso de excepción se muestra el mensaje
			System.out.println(e.getMessage());
		}
		// devuelve la opcion
		return op;
	}
	// Añadir Pedido
	public Pedido nuevoped() {
		/*System.out.println("Dame el código del articulo");
		this.articul.setCodArticulo(System.console().readLine());
		System.out.println("Escribe la descripción del articulo");
		op = Integer.parseInt(System.console().readLine());
		System.out.println("¿Cual es el Precio Venta al Publico?");
		op = Integer.parseInt(System.console().readLine());
		System.out.println("¿Cuanto tempo tarda en prepararse?");
		op = Integer.parseInt(System.console().readLine());
		*/
		return this.ped;

	}
}
