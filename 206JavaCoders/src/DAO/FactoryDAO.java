package DAO;

public interface FactoryDAO {
    public static final String CLIENTE = "cliente";
    public static final String ARTICULO = "articulo";
   
     public abstract DAO crear(String tipo);
}