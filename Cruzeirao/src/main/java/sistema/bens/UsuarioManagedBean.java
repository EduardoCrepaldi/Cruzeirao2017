package sistema.bens;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import enums.Roles;
import enums.Sexo;
import sistema.cruzeirao.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios = null;
	private UsuarioService service = new UsuarioService();
	private Usuario usuarioAtivo = null;
	
	public void onRowEdit(RowEditEvent event){
		Usuario l = ((Usuario) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		//usuario.setRole(Roles.ORGANIZADOR);
		service.salvar(usuario);
		usuario = new Usuario();
	}

	

	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}

	public List<Usuario> getUsuarios() {
		if(usuarios == null)
			usuarios = service.getUsuarios();
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		usuarioAtivo = null;
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void atualizar(){
		service.salvar(usuario);
	}
	public void remover(Usuario usuario) {
		service.remover(usuario);
	}
	public Sexo[] getSexos(){
		return Sexo.values();
	}
	public Usuario getUsuarioAtivo() {
		if (usuarioAtivo == null)
			Ativacao();
		return usuarioAtivo;
	}

	public void setUsuarioAtivo(Usuario usuarioAtivo) {
		this.usuarioAtivo = usuarioAtivo;
	}
	
	private void Ativacao() {
		Object Ativo = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username;
		if (Ativo instanceof UserDetails) {
			username = ((UserDetails) Ativo).getUsername();
			usuarioAtivo = service.Ativo(username);
		}
	}
	
	public List<Usuario> getJogadores(){
		return service.retornaJogadores();
	}
	
	
	
}
