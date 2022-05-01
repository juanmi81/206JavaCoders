package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import exception.DAOException;
import javacoders.modelo.Articulo;

public class ArticuloDAO implements DAO<Articulo, String> {

	@Override
	public void insertar(Articulo articulo) throws DAOException {
		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Save the student object
			manager.persist(articulo);

			// Commit the transaction
			transaction.commit();
		} catch (Exception ex) {
			// If there are any exceptions, roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the Exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
	}

	@Override
	public void modificar(Articulo a) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Articulo a) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Articulo> obtener() throws DAOException {
		List<Articulo> lstArticulo = null;

		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Get a List of Cliente
			lstArticulo = manager.createQuery("SELECT c FROM Articulo c", Articulo.class).getResultList();

			// Commit the transaction
			transaction.commit();
		} catch (Exception ex) {
			// If there are any exceptions, roll back the changes
			if (transaction != null) {
				transaction.rollback();
			}
			// Print the Exception
			ex.printStackTrace();
		} finally {
			// Close the EntityManager
			manager.close();
		}
		return lstArticulo;
	}

	@Override
	public Articulo buscar(String id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
