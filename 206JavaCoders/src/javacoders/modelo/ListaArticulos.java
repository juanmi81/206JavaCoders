package javacoders.modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.Conexion;
import DAO.DAO;
import MYSQL.MysqlArticuloDao;
import exception.DAOException;

public class ListaArticulos extends Lista<Articulo> {
	// añadir un articulo
	// PRODUCTO3
	public void addArticulo(Articulo a) throws DAOException {
		Connection conn = null;
		try {
			conn = Conexion.conectar();
			DAO dao = new MysqlArticuloDao(conn);
			dao.insertar(a);

		} catch (DAOException e) {
			// TODO Auto-generated catch block
			throw new DAOException("error en insertar sql", e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					throw new DAOException("Error en insertar de la base de datos de articulo", ex);
				}
			}
		}

	}

	// PRODUCTO 2
	/*
	 * public void addArticulo(Articulo a) { if(!lista.contains(a)) { lista.add(a);
	 * } }
	 */
	// busca un articulo y lo devuelve
	// PRODUCTO 3
	public Articulo existe(Articulo a) throws DAOException {
		Connection conn = null;
		Articulo art = null;
		try {
			conn = Conexion.conectar();
			DAO dao = new MysqlArticuloDao(conn);
			art = (Articulo) dao.buscar(a.getCodArticulo());
		} catch (DAOException e) {
			throw new DAOException("Error en insertar de la base de datos de articulo", e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					throw new DAOException("Error en insertar de la base de datos de articulo", ex);
				}
			}
		}
		return art;
	}
	// PRODUCTO 2
	/*
	 * public Articulo existe(Articulo a) { int indice = lista.indexOf(a); if
	 * (indice !=-1) { return lista.get(indice); } else return null; }
	 */

	@Override
	// PRODUCTO 3
	public String toString() {
		Connection conn = null;
		try {
			conn = Conexion.conectar();
			DAO dao = new MysqlArticuloDao(conn);

			this.lista = (ArrayList<Articulo>) dao.obtener();
		} catch (DAOException e) {
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return "ListaArticulos [lista=" + lista + "]";
	}
	// PRODUCTO 2
	/*
	 * public String toString() { return "ListaArticulos [lista=" + lista + "]"; }
	 */

}
