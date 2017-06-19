package sistema.bens;

import java.util.List;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Equipe;
import sistema.service.EquipeService;

public class EquipeManagedBean {
	
	
	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();
	
	public void onRowEdit(RowEditEvent event){
		Equipe l = ((Equipe) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(){
		try{
			
			equipe = service.salvar(equipe);
			
			if(equipes != null)
				equipes.add(equipe);
			
			equipe = new Equipe();
		}catch(Exception e){
			e.printStackTrace();
            //FacesUtil.addErrorMessage(e.getMessage());
		}
		
	}
	
	public Equipe getEquipe(){
		return equipe;
	}
	
	public void setEquipes(Equipe equipe){
		this.equipe = equipe;
	}
	
	public List<Equipe> getEquipes(){
		if(equipes == null)
			equipes = service.getEquipes();
		
		return equipes;
	}
	
	public void remover(Equipe equipe){
		service.remover(equipe);
		equipes.remove(equipe);
		
	}


}
