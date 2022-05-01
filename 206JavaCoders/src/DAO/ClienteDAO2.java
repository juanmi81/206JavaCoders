package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import exception.DAOException;
import javacoders.modelo.Cliente;
import javacoders.modelo.Estandar;
import javacoders.modelo.Premium;

public class ClienteDAO2 implements DAO<Cliente, String> {

	@Override
	public void insertar(Cliente cliente) throws DAOException {
		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Save the student object
			manager.persist(cliente);

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
	public List<Cliente> obtener() throws DAOException {
		List<Cliente> lstCliente = null;

		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Get a List of Cliente
			lstCliente = manager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();

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
		return lstCliente;
	}

	public List<Premium> findPremium() {
		List<Premium> lstCliente = null;

		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Get a List of Students
			TypedQuery<Premium> query = manager.createQuery("SELECT c FROM Premium c", Premium.class);
			lstCliente = query.getResultList();

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

		return lstCliente;

	}

	public List<Estandar> findEstandar() {
		List<Estandar> lstCliente = null;

		// Create an EntityManager
		EntityManager manager = Conexion.ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = null;

		try {
			// Get a transaction
			transaction = manager.getTransaction();
			// Begin the transaction
			transaction.begin();

			// Get a List of Students
			TypedQuery<Estandar> query = manager.createQuery("SELECT c FROM Estandar c", Estandar.class);
			lstCliente = query.getResultList();

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

		return lstCliente;

	}

	@Override
	public void modificar(Cliente a) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Cliente a) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente buscar(String id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
