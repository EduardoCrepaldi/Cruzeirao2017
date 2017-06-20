package sistema.dao;

import java.util.HashMap;
import java.util.Map;

import sistema.cruzeirao.Usuario;
import sistema.dao.generic.DAOImpl;

public class UserDAO extends DAOImpl<Usuario, Integer>{

	public Usuario pesquisarPorUserName(String userName) {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("username", userName);

		return super.pesquisarUm(Usuario.PESQUISAR_POR_USERNAME, parametros);
}
}
