package DAO;

public class Factory implements FactoryDAO {

	@Override
	public DAO crear(String tipo) {
		DAO dao = null;
		if (tipo.equals(FactoryDAO.CLIENTE)) {
			dao = new ClienteDAO();
		}
		return dao;
	}

}
