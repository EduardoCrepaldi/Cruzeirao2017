package sistema.bens;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Local;
import sistema.service.LocalService;

@ManagedBean(name="localMB")
@ViewScoped
public class LocalManagedBean {

	private Local local = new Local();
	private List<Local> locais;
	private LocalService service = new LocalService();
	
	public void onRowEdit(RowEditEvent event){
		Local l = ((Local) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		
		local = service.salvar(local);
		
		if(locais != null)
			locais.add(local);
		
		local = new Local();
	}
	
	public Local getLocal(){
		return local;
	}
	
	public void setLocal(Local local){
		this.local = local;
	}
	
	public List<Local> getLocais(){
		if(locais == null)
			locais = service.getLocais();
		
		return locais;
	}
	
	public void remover(Local local){
		service.remover(local);
		locais.remove(local);
		
	}
	
	
}
