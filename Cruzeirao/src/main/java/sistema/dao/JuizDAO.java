package sistema.dao;

import sistema.cruzeirao.Juiz;
import sistema.dao.generic.DAOImpl;

public class JuizDAO extends DAOImpl<Juiz, Integer>{

	@Override
	protected Class<Juiz> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Juiz.class;
	}

}
