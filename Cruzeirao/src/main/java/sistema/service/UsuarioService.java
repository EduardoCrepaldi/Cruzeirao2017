package sistema.service;

import java.util.List;

import sistema.cruzeirao.Usuario;
import sistema.dao.UserDAO;


public class UsuarioService {

	UserDAO usuarioDAO = new UserDAO();
	
	public Usuario salvar(Usuario usuario){
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}
	public List<Usuario> getUsuarios() {
		List<Usuario> list = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	
	public void alterar(Usuario usuario) {
		usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
	}

	public void remover(Usuario usuario) {

		usuario = usuarioDAO.getById(Usuario.class,usuario.getId());
		usuarioDAO.remove(usuario);
		usuarioDAO.closeEntityManager();
	}
}
