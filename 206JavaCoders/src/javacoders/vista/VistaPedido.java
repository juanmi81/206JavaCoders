package javacoders.vista;
import java.time.LocalDateTime;
import java.util.Scanner;
import javacoders.modelo.Pedido;

public class VistaPedido {
	Scanner sc = new Scanner(System.in);
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
	public int NPpedirArticulo() {
		System.out.println("Dame el c?digo del producto que quieres pedir");
		return (sc.nextInt());
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
	
	// -------------------------------  Eliminar pedido ----------------------------------------------------------------
	public String EPpedir() {
		System.out.println("Dame el codigo del pedido a eliminar");
		return (sc.next());
	}
	
	// ------------------------------- Ver listas de pedidos ----------------------------------------------------------
	public String MPcliente() {
		String cod = null;
		System.out.println("Si quieres filtrar por cliente dame el mail del cliente");
		cod = sc.next();
		if (cod == "") return null;
		else return cod;
	}
	 // ------------------------- ------------------------------------- -------------------------------------------------
	// imprime por pantalla, para indicar un error, fin del programa, o los datos solicitados ...
			public void imprimir(String salida) {
				System.out.println(salida);
			}
}
