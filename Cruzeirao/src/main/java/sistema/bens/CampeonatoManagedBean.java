package sistema.bens;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Campeonato;
import sistema.service.CampeonatoService;

public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos;
	private CampeonatoService service = new CampeonatoService();
	
	public void onRowEdit(RowEditEvent event){
		Campeonato l = ((Campeonato) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		try{
			
			campeonato = service.salvar(campeonato);
			
			if(campeonatos != null)
				campeonatos.add(campeonato);
			
			campeonato = new Campeonato();
		}catch(Exception e){
			e.printStackTrace();
            //FacesUtil.addErrorMessage(e.getMessage());
		}
		
	}
	
	public Campeonato getCampeonato(){
		return campeonato;
	}
	
	public void setCampeonatos(Campeonato campeonato){
		this.campeonato = campeonato;
	}
	
	public List<Campeonato> getCampeonatos(){
		if(campeonatos == null)
			campeonatos = service.getCampeonatos();
		
		return campeonatos;
	}
	
	public void remover(Campeonato campeonato){
		service.remover(campeonato);
		campeonatos.remove(campeonato);
		
	}


}
