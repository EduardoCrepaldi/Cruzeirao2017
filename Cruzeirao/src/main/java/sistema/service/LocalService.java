package sistema.service;

import java.util.List;

import sistema.cruzeirao.Local;
import sistema.dao.LocalDAO;

public class LocalService {
	LocalDAO localDAO = new LocalDAO();
	
	public Local salvar(Local local){
		local = localDAO.save(local);
		localDAO.closeEntityManager();
		return local;
	}
	
	public List<Local> getLocais(){
		List<Local> locais = localDAO.getAll(Local.class);
		localDAO.closeEntityManager();
		return locais;
	}
	
	public void alterar(Local local){
		localDAO.save(local);
		localDAO.closeEntityManager();
	}
	
	public void remover(Local local){
		local = localDAO.getById(Local.class, local.getIdLocal());
		localDAO.remove(local);
		localDAO.closeEntityManager();
	}
	
}
