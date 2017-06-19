package sistema.bens;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Categoria;
import sistema.service.CategoriaService;

public class CategoriaManagedBean {
	
	private Categoria categoria = new Categoria();
	private List<Categoria> categorias;
	private CategoriaService service = new CategoriaService();
	
	public void onRowEdit(RowEditEvent event){
		Categoria l = ((Categoria) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		try{
			
			categoria = service.salvar(categoria);
			
			if(categorias != null)
				categorias.add(categoria);
			
			categoria = new Categoria();
		}catch(Exception e){
			e.printStackTrace();
            //FacesUtil.addErrorMessage(e.getMessage());
		}
		
	}
	
	public Categoria getCategoria(){
		return categoria;
	}
	
	public void setCategorias(Categoria categoria){
		this.categoria = categoria;
	}
	
	public List<Categoria> getCategorias(){
		if(categorias == null)
			categorias = service.getCategorias();
		
		return categorias;
	}
	
	public void remover(Categoria categoria){
		service.remover(categoria);
		categorias.remove(categoria);
		
	}

}
