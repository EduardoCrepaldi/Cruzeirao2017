package sistema.service;

import java.util.List;

import sistema.cruzeirao.Equipe;
import sistema.dao.EquipeDAO;

public class EquipeService {
	
EquipeDAO equipeDAO = new EquipeDAO();
	
	public Equipe salvar(Equipe equipe){
		equipe = equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
		return equipe;
	}
	
	public List<Equipe> getEquipes(){
		List<Equipe> equipes = equipeDAO.getAll(Equipe.class);
		equipeDAO.closeEntityManager();
		return equipes;
	}
	
	public void alterar(Equipe equipe){
		equipeDAO.save(equipe);
		equipeDAO.closeEntityManager();
	}
	
	public void remover(Equipe equipe){
		equipe = equipeDAO.getById(Equipe.class, equipe.getIdEquipe());
		equipeDAO.remove(equipe);
		equipeDAO.closeEntityManager();
	}

}
