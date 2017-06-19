package sistema.service;

import java.util.List;

import sistema.cruzeirao.Campeonato;
import sistema.dao.CampeonatoDAO;

public class CampeonatoService {

	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	
	public Campeonato salvar(Campeonato campeonato){
		campeonato = campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}
	
	public List<Campeonato> getCampeonatos(){
		List<Campeonato> campeonatos = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return campeonatos;
	}
	
	public void alterar(Campeonato campeonato){
		campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
	public void remover(Campeonato campeonato){
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getIdCampeonato());
		campeonatoDAO.remove(campeonato);
		campeonatoDAO.closeEntityManager();
	}

}
