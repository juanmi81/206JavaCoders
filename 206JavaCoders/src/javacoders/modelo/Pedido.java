package javacoders.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Pedido {

	private String nPedido;
	private Cliente cliente;
	private Articulo articulo;
	private int cantArticulo;
	private LocalDateTime fechaHora;
	private boolean enviado;

	public Pedido(String nPedido, Cliente cliente, Articulo articulo, int cantArticulo, LocalDateTime fechaHora) {
		this.nPedido = nPedido;
		this.cliente = cliente;
		this.articulo = articulo;
		this.cantArticulo = cantArticulo;
		this.fechaHora = fechaHora;
		enviado = false;
	}

	/*
	 * public Pedido(String nPedido, Cliente cliente, Articulo articulo, int
	 * cantArticulo) { this.nPedido = nPedido; this.cliente = cliente; this.articulo
	 * = articulo; this.cantArticulo = cantArticulo;
	 * 
	 * }
	 * 
	 * public Pedido(String nPedido, Cliente cliente, Articulo articulo) {
	 * this.nPedido = nPedido; this.cliente = cliente; this.articulo = articulo;
	 * 
	 * }
	 * 
	 * public Pedido(String nPedido, Cliente cliente) { this.nPedido = nPedido;
	 * this.cliente = cliente;
	 * 
	 * }
	 * 
	 * public Pedido(String nPedido) { this.nPedido = nPedido;
	 * 
	 * }
	 */

	public String getnPedido() {
		return nPedido;
	}

	public void setnPedido(String nPedido) {
		this.nPedido = nPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public int getCantArticulo() {
		return cantArticulo;
	}

	public void setCantArticulo(int cantArticulo) {
		this.cantArticulo = cantArticulo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public boolean pedidoEnviado() {
		return enviado;
	}

	public void setEnviado(boolean b) {	
		this.enviado = b;
	}
	
	public float precioEnvio() {
		float gastosEnvio = articulo.getGastoEnvio();
		float precioEnvio = gastosEnvio;
		String tipoCliente = cliente.tipoCliente();
		if (tipoCliente.equals(Cliente.PREMIUM)) {
			float des = cliente.descuentoEnv();
			precioEnvio = (gastosEnvio - gastosEnvio * (des / 100));
		}

		return precioEnvio;
	}

	@Override
	public String toString() {

		String enviado = "enviado";
		if (!pedidoEnviado()) {
			enviado = "no enviado";
		}

		float pvp = articulo.getPvp();
		float precioTotal = (pvp * cantArticulo) + precioEnvio();

		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy - hh:mm");
		String pedidoStr = "Numero pedido: " + nPedido;
		pedidoStr += "\nFecha: " + sf.format(fechaHora);
		pedidoStr += "\nNif: " + cliente.getNif();
		pedidoStr += "\nNombre: " + cliente.getNombre();
		pedidoStr += "\nCódigo: " + articulo.getCodArticulo();
		pedidoStr += "\nDescripción: " + articulo.getDescripcion();
		pedidoStr += "\nCantidad: " + cantArticulo;
		pedidoStr += "\nPrecio unitario: " + pvp;
		pedidoStr += "\nPrecio total: " + precioTotal;
		pedidoStr += "\nEstado: " + enviado;

		return pedidoStr;
	}
	// devuelve cierto si el pedido esta pendiente de envio, se calcula por fecha y tiempo de preparación
	public boolean pendiente() {
		LocalDateTime time = this.getFechaHora().plusHours(this.getArticulo().getTiempoPrep());
		return time.isBefore(LocalDateTime.now());
	}
}
