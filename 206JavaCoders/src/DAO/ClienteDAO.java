//package DAO;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import exception.ClientException;
//import exception.DAOException;
//import javacoders.modelo.Cliente;
//import javacoders.modelo.Estandar;
//import javacoders.modelo.Premium;
//
//public class ClienteDAO implements DAO<Cliente, String> {
//
//	public int existeCliente(String email) throws SQLException {
//		Connection conexion = null;
//		PreparedStatement stmt = null;
//		int total = 0;
//
//		try {
//
//			conexion = Conexion.conectar();
//			String query = "SELECT count(*) as total FROM cliente WHERE email LIKE ?";
//			stmt = conexion.prepareStatement(query);
//			stmt.setString(1, email);
//
//			ResultSet rs = stmt.executeQuery();
//
//			while (rs.next()) {
//				total = rs.getInt("total");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//			if (conexion != null) {
//				conexion.close();
//			}
//		}
//
//		return total;
//	}
//
//	public List<Cliente> findAll() throws SQLException, ClassNotFoundException {
//		Connection conexion = null;
//		PreparedStatement stmt = null;
//		List<Cliente> lstCliente = new ArrayList<Cliente>();
//
//		try {
//
//			conexion = Conexion.conectar();
//			String query = "SELECT * FROM cliente";
//			stmt = conexion.prepareStatement(query);
//			ResultSet rs = stmt.executeQuery();
//
//			while (rs.next()) {
//				String email = rs.getString("email");
//				String nombre = rs.getString("nombre");
//				String domicilio = rs.getString("direccion");
//				String nif = rs.getString("nif");
//				boolean isPremium = rs.getBoolean("isPremium");
//
//				Cliente cliente;
//				if (isPremium) {
//					cliente = new Premium(email, nombre, domicilio, nif);
//				} else {
//					cliente = new Estandar(email, nombre, domicilio, nif);
//				}
//				lstCliente.add(cliente);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//			if (conexion != null) {
//				conexion.close();
//			}
//		}
//
//		return lstCliente;
//	}
//
//	public List<Cliente> findByType(boolean isPremium) throws SQLException, ClassNotFoundException {
//		Connection conexion = null;
//		PreparedStatement stmt = null;
//		List<Cliente> lstCliente = new ArrayList<Cliente>();
//
//		try {
//
//			conexion = Conexion.conectar();
//			String query = "SELECT * FROM cliente WHERE isPremium = ?";
//			stmt = conexion.prepareStatement(query);
//			stmt.setBoolean(1, isPremium);
//
//			ResultSet rs = stmt.executeQuery();
//
//			while (rs.next()) {
//				String email = rs.getString("email");
//				String nombre = rs.getString("nombre");
//				String domicilio = rs.getString("direccion");
//				String nif = rs.getString("nif");
//
//				Cliente cliente;
//				if (isPremium) {
//					cliente = new Premium(email, nombre, domicilio, nif);
//				} else {
//					cliente = new Estandar(email, nombre, domicilio, nif);
//				}
//				lstCliente.add(cliente);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (stmt != null) {
//				stmt.close();
//			}
//			if (conexion != null) {
//				conexion.close();
//			}
//		}
//
//		return lstCliente;
//
//	}
//
//	@Override
//	public void insertar(Cliente cliente) throws DAOException {
//		Connection conexion = null;
//		PreparedStatement stmt = null;
//		try {
//			if (existeCliente(cliente.getEmail()) == 0) {
//
//				conexion = Conexion.conectar();
//				String query = "INSERT INTO cliente (email, nif, nombre, direccion, isPremium)VALUES (?, ?, ?, ?, ?);";
//
//				stmt = conexion.prepareStatement(query);
//				stmt.setString(1, cliente.getEmail());
//				stmt.setString(2, cliente.getNif());
//				stmt.setString(3, cliente.getNombre());
//				stmt.setString(4, cliente.getDomicilio());
//
//				if (cliente instanceof Premium) {
//					stmt.setBoolean(5, true);
//				} else {
//					stmt.setBoolean(5, false);
//				}
//				stmt.executeUpdate();
//
//			} else {
//				throw new ClientException("Ya existe un cliente con email " + cliente.getEmail());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (stmt != null) {
//					stmt.close();
//				}
//				if (conexion != null) {
//					conexion.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	}
//
//	@Override
//	public void modificar(Cliente a) throws DAOException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void eliminar(Cliente a) throws DAOException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public List<Cliente> obtener() throws DAOException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Cliente buscar(String id) throws DAOException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
