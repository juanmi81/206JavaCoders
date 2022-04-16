package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String Controlador = "com.mysql.cj.jdbc.Driver";// "com.mysql.jdbc.Connection";
	private static final String URL = "jdbc:mysql://localhost:3306/db_producto3";
	private static final String User = "alumno";//"root"; // "juanmi";
	private static final String Pass = "javacoders";//"Vivi83719"; //"javacoders";

	static {
		try {
			Class.forName(Controlador);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador de la sql");
			e.printStackTrace();
		}
	}

	public static Connection conectar() {
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(URL, User, Pass);
			if (conn != null) {
				System.out.println("Conexion a base de datos " + URL + " . . . Ok");
			}
		} catch (SQLException ex) {
			System.out.println("Hubo un problema al intentar conecarse a la base de datos" + URL);
		}
		return conn;
	}

	/**
	 * Consultas a la Base de Datos.
	 * 
	 * @param _query
	 * @return
	 */
	/*public ResultSet getQuery(String _query) {
		Statement state = null;
		ResultSet resultado = null;

		try {
			state = (Statement) conn.createStatement();
			resultado = state.executeQuery(_query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}*/

	/**
	 * Modificacion a la Base de Datos.
	 * 
	 * @param _query
	 */
	/*public void setQuery(String _query) {
		Statement state = null;

		try {
			state = (Statement) conn.createStatement();
			state.execute(_query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/

}
