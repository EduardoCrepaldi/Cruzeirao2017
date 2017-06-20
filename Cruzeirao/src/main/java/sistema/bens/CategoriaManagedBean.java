package sistema.bens;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Categoria;
import sistema.service.CategoriaService;


@ManagedBean
@SessionScoped
public class CategoriaManagedBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Categoria categoria = new Categoria();
	private List<Categoria> categorias = null;
	private CategoriaService service = new CategoriaService();
	
	// Edição de um Local na tabela
	public void onRowEdit(RowEditEvent event) {

			Categoria a = ((Categoria) event.getObject());
			service.update(a);
	}
	
	public void salvar() {
		categoria = service.save(categoria);
		if(categorias!=null)
			categorias.add(categoria);
		categoria = new Categoria();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void delete(Categoria a) {
		service.remove(a);
		categorias.remove(a);
	}

	public List<Categoria> getCategorias() {
		if(categorias == null)
			categorias = service.getCategorias();
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public CategoriaService getService() {
		return service;
	}

	public void setService(CategoriaService service) {
		this.service = service;
	}
	
	
}
