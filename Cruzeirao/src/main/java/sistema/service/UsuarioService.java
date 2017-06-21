package sistema.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import enums.Roles;
import sistema.cruzeirao.Usuario;

import sistema.dao.UsuarioDAO;
import sistema.dao.transactional.Transactional;


@Service
public class UsuarioService {

	@Inject
	UsuarioDAO userDAO;

	public UsuarioService() {
		userDAO = new UsuarioDAO();
	}

	@Transactional
	public Usuario salvar(Usuario usuario) {
		userDAO.salvar(usuario);
		userDAO.closeEntityManager();
		return usuario;
	}

	public Usuario Ativo(String username) {
		return userDAO.pesquisarPorUserName(username);
	}

	public List<Usuario> getUsuarios() {
		List<Usuario> list = userDAO.getAll(Usuario.class);
		userDAO.closeEntityManager();
		return list;
	}

	public void alterar(Usuario usuario) {
		userDAO.atualizar(usuario);
		userDAO.closeEntityManager();
	}

	public void remover(Usuario usuario) {

		usuario = userDAO.pesquisarPorId(usuario.getId());
		userDAO.remover(usuario);
		userDAO.closeEntityManager();
	}
	
	public Usuario retornaUsuario(String nome){
		return userDAO.pesquisarPorUserName(nome);
	}
	
	public List<Usuario> retornaJogadores(){
		return userDAO.usuarioJogadores();
	}
	
	public Usuario atualizandoUser(Usuario usuario){
		return userDAO.pesquisarPorId(usuario.getId());
	}
}
