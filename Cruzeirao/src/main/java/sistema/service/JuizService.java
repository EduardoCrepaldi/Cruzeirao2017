package sistema.service;

import java.util.List;

import sistema.cruzeirao.Juiz;
import sistema.dao.JuizDAO;

public class JuizService {

	JuizDAO juizDAO = new JuizDAO();
	
	public Juiz salvar(Juiz Juiz){
		Juiz = juizDAO.salvar(Juiz);
		juizDAO.closeEntityManager();
		return Juiz;
	}
	
	public List<Juiz> getjuizes(){
		List<Juiz> juizes = juizDAO.getAll(Juiz.class);
		juizDAO.closeEntityManager();
		return juizes;
	}
	
	public void alterar(Juiz Juiz){
		juizDAO.salvar(Juiz);
		juizDAO.closeEntityManager();
	}
	
	public void remover(Juiz Juiz){
		Juiz = juizDAO.getById(Juiz.class, Juiz.getIdJuiz());
		juizDAO.remover(Juiz);
		juizDAO.closeEntityManager();
	}
	
}
