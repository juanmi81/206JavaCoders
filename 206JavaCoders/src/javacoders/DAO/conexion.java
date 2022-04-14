package javacoders.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
	private static final String Controlador = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/db_producto3";
	private static final String User = "alumno";
	private static final String Pass = "javacoders";
	private Connection conn = null;
	
	static {
		try {
			Class.forName(Controlador);
		}catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador de la sql");
			e.printStackTrace();
		}
	}
	
	public  Connection	conectar() {
		try {
			conn = (Connection)DriverManager.getConnection(URL, User, Pass);   
			if (conn != null) {
			    System.out.println("Conexion a base de datos "+URL+" . . . Ok");
			}
		} catch(SQLException ex) {
			System.out.println("Hubo un problema al intentar conecarse a la base de datos"+URL);
		} 
		return conn;
	}
	
	 /**
	  * Consultas a la Base de Datos.
	  * @param _query
	  * @return
	  */
	 public ResultSet getQuery(String _query) {
	  Statement state = null;
	  ResultSet resultado = null;
	  
	  try {
	   state = (Statement) conn.createStatement();
	   resultado = state.executeQuery(_query);
	  } catch(SQLException e) {
	   e.printStackTrace();  
	  }
	  
	  return resultado;
	 }
	 
	 
	 /**
	  * Modificacion a la Base de Datos.
	  * @param _query
	  */
	 public void setQuery(String _query) throws SQLException {
		 conectar();
		 if (conn != null) {
			 Statement state = null;
			 try {
				 state=(Statement) conn.createStatement();
				 state.execute(_query);
			 } catch (SQLException e) {
					 e.printStackTrace();
			 }
			 
		 }
		 close();
	}

	public void close() throws SQLException {
		conn.close();
	}

}
