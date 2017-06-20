package sistema.bens;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;
import sistema.cruzeirao.Usuario;
import sistema.service.UsuarioService;

@ManagedBean(name="usuarioMB")
@ViewScoped
public class UsuarioManagedBean {

	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	private UsuarioService service = new UsuarioService();
	
	public void onRowEdit(RowEditEvent event){
		Usuario l = ((Usuario) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		
		usuario = service.salvar(usuario);
		
		if(usuarios != null)
			usuarios.add(usuario);
		
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
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
