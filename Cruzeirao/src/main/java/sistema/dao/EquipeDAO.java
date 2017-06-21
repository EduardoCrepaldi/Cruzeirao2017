package sistema.dao;

import sistema.cruzeirao.Equipe;
import sistema.dao.generic.DAOImpl;

public class EquipeDAO extends DAOImpl<Equipe, Integer>{

	@Override
	protected Class<Equipe> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Equipe.class;
	}

}