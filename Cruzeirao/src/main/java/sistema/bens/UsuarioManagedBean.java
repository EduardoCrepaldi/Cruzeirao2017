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
		Usuario u = ((Usuario) event.getObject());
		service.alterar(u);
	}
	
	public void salvar(){
		
		usuario = service.salvar(usuario);
		if(usuarios!=null)
			usuarios.add(usuario);
		
		usuario = new Usuario();
	}
	
	public Usuario getUsuario(){
		return usuario;
	}
	
	public void setUsuario(Usuario usuario){
		this.usuario = usuario;
	}
	
	public List<Usuario> getUsuarios(){
		if(usuarios == null)
			usuarios = service.getLocais();
		
		return usuarios;
	}	
	
	public void remover(Usuario usuario){
		service.remover(usuario);
		usuarios.remove(usuario);
		
	}
	
}
