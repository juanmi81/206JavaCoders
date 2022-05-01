package DAO;

public class Factory implements FactoryDAO {

	@Override
	public DAO crear(String tipo) {
		DAO dao = null;
		if (tipo.equals(FactoryDAO.CLIENTE)) {
			dao = new ClienteDAO2();
		}else if(tipo.equals(FactoryDAO.ARTICULO)) {
			dao = new ArticuloDAO();
		}
		return dao;
	}

}
