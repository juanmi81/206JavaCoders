package Modelo;

import java.util.Date;

public class Pedido {

    private String nPedido;
    private Cliente cliente;
    private Articulo articulo;
    private int cantArticulo;
    private Date fechaHora;

    public Pedido(String nPedido, Cliente cliente, Articulo articulo, int cantArticulo, Date fechaHora) {
        this.nPedido = nPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantArticulo = cantArticulo;
        this.fechaHora = fechaHora;
    } 

      public Pedido(String nPedido, Cliente cliente, Articulo articulo, int cantArticulo) {
        this.nPedido = nPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantArticulo = cantArticulo;
       
    } 
    
    public Pedido(String nPedido, Cliente cliente, Articulo articulo) {
        this.nPedido = nPedido;
        this.cliente = cliente;
        this.articulo = articulo;
       
    } 

    public Pedido(String nPedido, Cliente cliente) {
        this.nPedido = nPedido;
        this.cliente = cliente;
       
    }

    public Pedido(String nPedido) {
        this.nPedido = nPedido;
               
    }

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

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Pedido [articulo=" + articulo + ", cantArticulo=" + cantArticulo + ", cliente=" + cliente
                + ", fechaHora=" + fechaHora + ", nPedido=" + nPedido + "]";
    }

    

}
