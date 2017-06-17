package sistema.service;

import java.util.List;
import sistema.cruzeirao.Usuario;
import sistema.dao.UsuarioDAO;

public class UsuarioService {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	
	public Usuario salvar(Usuario usuario){
		usuario = usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}
	
	public List<Usuario> getLocais(){
		List<Usuario> usuarios = usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return usuarios;
	}
	
	public void alterar(Usuario usuario){
		usuarioDAO.save(usuario);
		usuarioDAO.closeEntityManager();
	}
	
	public void remover(Usuario usuario){
		usuario = usuarioDAO.getById(Usuario.class, usuario.getIdUsuario());
		usuarioDAO.remove(usuario);
		usuarioDAO.closeEntityManager();
	}
}
