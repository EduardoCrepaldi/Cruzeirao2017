package sistema.bens;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;
import org.primefaces.model.UploadedFile;

import sistema.cruzeirao.Local;
import sistema.service.LocalService;

@ManagedBean(name="localMB")
@ViewScoped
public class LocalManagedBean {

	private Local local = new Local();
	private List<Local> locais;
	private LocalService service = new LocalService();
	private UploadedFile file;
	
	public void onRowEdit(RowEditEvent event){
		Local l = ((Local) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		try{
			if(file != null)
				local.setImage(file.getContents());
			
			local = service.salvar(local);
			
			if(locais != null)
				locais.add(local);
			
			local = new Local();
		}catch(Exception e){
			e.printStackTrace();
            //FacesUtil.addErrorMessage(e.getMessage());
		}
		
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

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	
}
