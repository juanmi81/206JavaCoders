package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javacoders.modelo.Cliente;
import javacoders.modelo.Premium;

public class ClienteDAO implements DAO {

	public void addCliente(Cliente cliente) throws SQLException {
		Connection conexion = null;
		PreparedStatement stmt = null;
		try {
			conexion = Conexion.conectar();
			String query = "INSERT INTO cliente (email, nif, nombre, direccion, isPremium)VALUES (?, ?, ?, ?, ?);";

			stmt = conexion.prepareStatement(query);
			stmt.setString(1, cliente.getEmail());
			stmt.setString(2, cliente.getNif());
			stmt.setString(3, cliente.getNombre());
			stmt.setString(4, cliente.getDomicilio());

			if (cliente instanceof Premium) {
				stmt.setBoolean(5, true);
			} else {
				stmt.setBoolean(5, false);
			}
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conexion != null) {
				conexion.close();
			}
		}
	}
	
	public List<Cliente> findAll(){
		return null;
	}
	
	public List<Cliente> findByType(boolean isPremium){
		return null;
	}
}
