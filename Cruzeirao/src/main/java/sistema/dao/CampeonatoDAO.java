package sistema.dao;

import sistema.cruzeirao.Campeonato;
import sistema.dao.generic.DAOImpl;

public class CampeonatoDAO extends DAOImpl<Campeonato, Integer>{

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Campeonato.class;
	}
	

}
