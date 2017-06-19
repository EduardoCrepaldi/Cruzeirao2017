package sistema.service;

import java.util.List;

import sistema.cruzeirao.Categoria;
import sistema.dao.CategoriaDAO;

public class CategoriaService {
	
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
	public Categoria salvar(Categoria categoria){
		categoria = categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
		return categoria;
	}
	
	public List<Categoria> getCategorias(){
		List<Categoria> categorias = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return categorias;
	}
	
	public void alterar(Categoria categoria){
		categoriaDAO.save(categoria);
		categoriaDAO.closeEntityManager();
	}
	
	public void remover(Categoria categoria){
		categoria = categoriaDAO.getById(Categoria.class, categoria.getIdCategoria());
		categoriaDAO.remove(categoria);
		categoriaDAO.closeEntityManager();
	}

}
