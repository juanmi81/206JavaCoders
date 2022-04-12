package DAO;

public interface FactoryDAO {
    public static final String CLIENTE = "cliente";
   
     public abstract DAO crear(String tipo);
}