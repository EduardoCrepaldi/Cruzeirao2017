package sistema.bens;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Equipe;

import sistema.service.EquipeService;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class EquipeManagedBean {

	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();
	private UsuarioService userDiretor = new UsuarioService();
	
	public void onRowEdit(RowEditEvent event){
		Equipe l = ((Equipe) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(String nome){
		
		equipe.setDiretor(userDiretor.retornaUsuario(nome));
		equipe = service.salvar(equipe);
		
		if(equipes != null)
			equipes.add(equipe);
		
		equipe = new Equipe();
	}
	
	public Equipe getEquipe(){
		return equipe;
	}
	
	public void setEquipe(Equipe equipe){
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

	public EquipeService getService() {
		return service;
	}

	public void setService(EquipeService service) {
		this.service = service;
	}

	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	
	
}