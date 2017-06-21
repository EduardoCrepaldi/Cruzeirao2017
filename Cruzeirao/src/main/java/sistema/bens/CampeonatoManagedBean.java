package sistema.bens;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;

import sistema.beans.datamodel.CampeonatoDataModel;
import sistema.cruzeirao.Campeonato;
import sistema.cruzeirao.Categoria;
import sistema.cruzeirao.Local;
import sistema.service.CampeonatoService;
import sistema.service.CategoriaService;
import sistema.service.LocalService;

@ManagedBean(name="campeonatoMB")
@SessionScoped
public class CampeonatoManagedBean {

	private Campeonato campeonato = new Campeonato();
	private CampeonatoService serviceCampeonato = new CampeonatoService();
	private CategoriaService serviceCategoria = new CategoriaService();
	private LocalService serviceLocal = new LocalService();
	private ArrayList<Categoria> categoriasDesejadas = new ArrayList<Categoria>();

	public void onRowEdit(RowEditEvent event) {

		Campeonato c = ((Campeonato) event.getObject());
		serviceCampeonato.update(c);
	}

	public void salvar() {
		campeonato.setCategorias(categoriasDesejadas);
		for(Categoria categoria : campeonato.getCategorias())
			categoria.getCampeonatos().add(campeonato);
		for(Local local : campeonato.getLocais())
			local.getCampeonatos().add(campeonato);
		
		campeonato = serviceCampeonato.save(campeonato);
		campeonato = new Campeonato();
		categoriasDesejadas = new ArrayList<Categoria>();
	}
	
	public void delete(Campeonato a) {
		serviceCampeonato.remove(a);
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public List<Categoria> getCategorias(){
		return serviceCategoria.getCategorias();
	}
	
	public List<Local> getLocais(){
		return serviceLocal.getLocais();
	}
	
	public CampeonatoDataModel getCampeonatos(){
		return new CampeonatoDataModel(serviceCampeonato.getCampeonatos());
	}

	public CampeonatoService getServiceCampeonato() {
		return serviceCampeonato;
	}

	public void setServiceCampeonato(CampeonatoService serviceCampeonato) {
		this.serviceCampeonato = serviceCampeonato;
	}

	public CategoriaService getServiceCategoria() {
		return serviceCategoria;
	}

	public void setServiceCategoria(CategoriaService serviceCategoria) {
		this.serviceCategoria = serviceCategoria;
	}

	public LocalService getServiceLocal() {
		return serviceLocal;
	}

	public void setServiceLocal(LocalService serviceLocal) {
		this.serviceLocal = serviceLocal;
	}

	public ArrayList<Categoria> getCategoriasDesejadas() {
		return categoriasDesejadas;
	}

	public void setCategoriasDesejadas(ArrayList<Categoria> categoriasDesejadas) {
		this.categoriasDesejadas = categoriasDesejadas;
	}
	
	
	

	
}
