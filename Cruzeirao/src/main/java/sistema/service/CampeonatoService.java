package sistema.service;

import java.util.List;

import sistema.cruzeirao.Campeonato;
import sistema.dao.CampeonatoDAO;

public class CampeonatoService {

	CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	
	public Campeonato save(Campeonato campeonato) {
		campeonato = campeonatoDAO.salvar(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}

	public void update(Campeonato campeonato) {
		campeonatoDAO.salvar(campeonato);
		campeonatoDAO.closeEntityManager();
	}

	public void remove(Campeonato campeonato) {
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getIdCampeonato());
		campeonatoDAO.remover(campeonato);
		campeonatoDAO.closeEntityManager();
	}
	
}
