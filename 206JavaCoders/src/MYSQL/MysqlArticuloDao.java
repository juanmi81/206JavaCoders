package MYSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.DAO;
import exception.DAOException;
import javacoders.modelo.Articulo;

public class MysqlArticuloDao implements DAO<Articulo, String>{

	final String INSERT = "INSERT INTO db_producto3.artículo (Descripción, PVP, GastosEnvio, TiempoPrep) VALUES ( ? ,? , ?, ?);";
	final String UPDATE = "UPDATE db_producto3.artículo SET Descripción = \"?\", PVP = ?, GastosEnvio = ?, TiempoPrep = ? WHERE codArticulo = ?;";
	final String DELETE = "DELETE FROM db_producto3.artículo WHERE codArticulo = ?;";
	final String GETALL = "SELECT * FROM db_producto3.artículo;";
	final String GETONE = "SELECT * FROM db_producto3.artículo WHERE codArticulo = ?;";
	
	private Connection conn;
	
	public MysqlArticuloDao (Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insertar(Articulo a) throws DAOException {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(INSERT);
			stat.setString(1, a.getDescripcion());
			stat.setDouble(2, (double)a.getPvp());
			stat.setDouble(3, (double)a.getGastosEnvio());
			stat.setInt(4, a.getTiempoPrep());
			
			if (stat.executeUpdate() == 0) {
				throw new DAOException("puede que no se guarde correctamente");
			}
		}catch(SQLException ex) {
			throw new DAOException("Error en insertar de articulo", ex);
		}finally {
			if (stat != null) {
				try{
					stat.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en insertar de articulo", ex);
				}
			}
		}
	}

	@Override
	public void modificar(Articulo a)throws DAOException {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(UPDATE);
			stat.setString(1, a.getDescripcion());
			stat.setDouble(2, (double)a.getPvp());
			stat.setDouble(3, (double)a.getGastosEnvio());
			stat.setInt(4, a.getTiempoPrep());
			stat.setInt(5, a.getCodArticulo());
			
			if (stat.executeUpdate() == 0) {
				throw new DAOException("puede que no se actualice correctamente");
			}
		}catch(SQLException ex) {
			throw new DAOException("Error en actualizar de articulo", ex);
		}finally {
			if (stat != null) {
				try{
					stat.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en insertar de articulo", ex);
				}
			}
		}
	}

	@Override
	public void eliminar(Articulo a) throws DAOException {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(DELETE);
			stat.setInt(1, a.getCodArticulo());
			
			if (stat.executeUpdate() == 0) {
				throw new DAOException("puede que no se limine correctamente");
			}
		}catch(SQLException ex) {
			throw new DAOException("Error en eliminar de articulo", ex);
		}finally {
			if (stat != null) {
				try{
					stat.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en eliminar de articulo", ex);
				}
			}
		}
	}

	private Articulo convertir(ResultSet rs) throws SQLException {
		Articulo art = new Articulo();
		art.setCodArticulo(rs.getInt("codArticulo")); 
		art.setDescripcion(rs.getString("Descripción"));
		art.setPvp((float)rs.getDouble("PVP"));
		art.setGastosEnvio((float)rs.getDouble("GastosEnvio"));
		art.setTiempoPrep(rs.getInt("TiempoPrep"));
		return art;
	}
	
	@Override
	public Articulo buscar(String id) throws DAOException {
		PreparedStatement stat = null;
		ResultSet rs = null;
		Articulo art = null;
		try {
			stat = conn.prepareStatement(GETONE);
			stat.setString(1, id);
			rs = stat.executeQuery();
	
			if (rs.next()) {
				art = convertir(rs);
			}else {
				throw new DAOException("no se ha encontrado ese registro");
			}
		}catch(SQLException ex) {
			throw new DAOException("Error en buscar un articulo", ex);
		}finally {
			if (stat != null) {
				try{
					stat.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en buscar un articulo", ex);
				}
			}
			if (rs != null) {
				try{
					rs.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en buscar un articulo", ex);
				}
			}
		}
		return art;
	}

	@Override
	public List<Articulo> obtener() throws DAOException {
		PreparedStatement stat = null;
		ResultSet rs = null;
		List<Articulo> art = new ArrayList<>();
		try {
			stat = conn.prepareStatement(GETALL);
			rs = stat.executeQuery();
			while(rs.next()) {
				 art.add(convertir(rs));
			}
		}catch(SQLException ex) {
			throw new DAOException("Error en buscar un articulo", ex);
		}finally {
			if (stat != null) {
				try{
					stat.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en buscar un articulo", ex);
				}
			}
			if (rs != null) {
				try{
					rs.close();
				}catch(SQLException ex) {
					throw new DAOException("Error en buscar un articulo", ex);
				}
			}
		}
		return art;
	}

		
}
