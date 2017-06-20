package sistema.dao;

import sistema.cruzeirao.Categoria;
import sistema.dao.generic.DAOImpl;

public class CategoriaDAO extends DAOImpl<Categoria, Integer>{

	@Override
	protected Class<Categoria> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Categoria.class;
	}

}
