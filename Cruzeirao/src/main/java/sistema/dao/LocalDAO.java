package sistema.dao;

import sistema.cruzeirao.Local;
import sistema.dao.generic.DAOImpl;

public class LocalDAO extends DAOImpl<Local , Integer>{

	@Override
	protected Class<Local> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Local.class;
	}

}
