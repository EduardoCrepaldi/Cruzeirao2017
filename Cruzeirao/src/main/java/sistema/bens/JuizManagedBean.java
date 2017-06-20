package sistema.bens;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Juiz;
import sistema.service.JuizService;


@ManagedBean(name="JuizMB")
@ViewScoped
public class JuizManagedBean {

	private Juiz Juiz = new Juiz();
	private List<Juiz> juizes;
	private JuizService service = new JuizService();
	
	public void onRowEdit(RowEditEvent event){
		Juiz l = ((Juiz) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		
		Juiz = service.salvar(Juiz);
		
		if(juizes != null)
			juizes.add(Juiz);
		
		Juiz = new Juiz();
	}
	
	public Juiz getJuiz(){
		return Juiz;
	}
	
	public void setJuiz(Juiz Juiz){
		this.Juiz = Juiz;
	}
	
	public List<Juiz> getjuizes(){
		if(juizes == null)
			juizes = service.getjuizes();
		
		return juizes;
	}
	
	public void remover(Juiz Juiz){
		service.remover(Juiz);
		juizes.remove(Juiz);
		
	}
	
}
