package sistema.bens;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.cruzeirao.Equipe;
import sistema.cruzeirao.Usuario;
import sistema.service.EquipeService;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class EquipeManagedBean {

	private Equipe equipe = new Equipe();
	private List<Equipe> equipes;
	private EquipeService service = new EquipeService();
	private UsuarioService userDiretor = new UsuarioService();
	private Usuario jogadorSelecionado;
	
	
	public void onRowEdit(RowEditEvent event){
		Equipe l = ((Equipe) event.getObject());
		service.alterar(l);
	}
	
	public void salvar(String nome){
		
		equipe.setDiretor(userDiretor.retornaUsuario(nome));
		addEquipenoDiretor(equipe);
		
		equipe = service.salvar(equipe);
		
		if(equipes != null)
			equipes.add(equipe);
		
		equipe = new Equipe();
	}
	
	//Salvando equipes em um diretor(usuario)
	public void addEquipenoDiretor(Equipe e){
		Usuario diretor = userDiretor.retornaUsuario(e.getDiretor().getUsername());
		diretor.addEquipes(e);
		
	}
	
	public void altera(String nomeDiretor){
		
		
		
		Usuario diretorAtual = userDiretor.retornaUsuario(nomeDiretor);
		Equipe equipeAtual = null;
		for(Equipe u : service.getEquipes())
			if(u.getDiretor() == diretorAtual)
				equipeAtual = u;
			
				
		
		equipeAtual.addJogadores(jogadorSelecionado);
		service.alterar(equipeAtual);
		//jogadorSelecionado.addEquipes(equipe);
		Usuario userAtual = userDiretor.atualizandoUser(jogadorSelecionado);
		userAtual.addEquipes(equipeAtual);
		userDiretor.alterar(userAtual);
		
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

	public Usuario getJogadorSelecionado() {
		return jogadorSelecionado;
	}

	public void setJogadorSelecionado(Usuario jogadorSelecionado) {
		this.jogadorSelecionado = jogadorSelecionado;
	}
	
	
	
}