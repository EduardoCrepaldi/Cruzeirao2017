package sistema.service;

import java.io.Serializable;
import java.util.List;

import sistema.cruzeirao.Categoria;
import sistema.dao.CategoriaDAO;

public class CategoriaService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	CategoriaDAO categoriaDAO = new CategoriaDAO();
	
	public Categoria save(Categoria categoria){
		categoria = categoriaDAO.salvar(categoria);
		categoriaDAO.closeEntityManager();
		return categoria;
	}
	public List <Categoria> getCategorias()
	{
		List <Categoria> list = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		return list;
	}
	public void update(Categoria categoria)
	{
		categoriaDAO.salvar(categoria);
		categoriaDAO.closeEntityManager();
	}
	public void remove(Categoria categoria)
	{
		categoria = categoriaDAO.getById(Categoria.class, categoria.getIdCategoria());
		categoriaDAO.remover(categoria);
		categoriaDAO.closeEntityManager();
	}
	
	public Categoria pesquisar(Categoria fornecedor) {

		fornecedor = categoriaDAO.getById(Categoria.class, fornecedor.getIdCategoria());
		categoriaDAO.closeEntityManager();
		return fornecedor;
	}
	
	public List<Categoria> categoriaNoCampeonato(Categoria categoria) {

		List<Categoria> categorias = categoriaDAO.getAll(Categoria.class);
		categoriaDAO.closeEntityManager();
		
		return categorias;
	}
	
}
