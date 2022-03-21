package javacoders.vista;

import javacoders.modelo.Pedido;

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
	// ----------------------------- Añadir Pedido -------------------------------------------------------------------
	// pedir codigo del producto y devuelve un string ----------------------------------------
	public String NPpedirArticulo() {
		System.out.println("Dame el codig del producto que quieres pedir");
		return (sc.next());
	}
	// pedir el mail del cliente para saber si existe -----------------------------------------
	public String NPpedirCliente() {
		System.out.println("Dame el mail del cliente");
		return (sc.next());
	}
	// pedir el resto de datos  ----------------------------------------------------------------
	public void nuevoPedido() {
		// TODO Auto-generated method stub
		System.out.println("Inserte el codigo del pedido");
		this.ped.setnPedido(sc.next());
		System.out.println("Inserte la cantidad");
		this.ped.setCantArticulo(Integer.parseInt(sc.next()));
		ped.setFechaHora(LocalDateTime.now());
		ped.setEnviado(false);
	}
}
