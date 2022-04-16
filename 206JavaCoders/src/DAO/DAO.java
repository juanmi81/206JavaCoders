package DAO;

import java.util.List;

import exception.DAOException;

public interface DAO<T, K> {
	void insertar (T a) throws DAOException;
	void modificar(T a) throws DAOException;
	void eliminar(T a) throws DAOException;
	List<T> obtener() throws DAOException;
	T buscar(K id) throws DAOException;
}
