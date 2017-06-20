package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.cruzeirao.Categoria;
import sistema.service.CategoriaService;

public class CategoriaDataModel extends ListDataModel<Categoria> implements SelectableDataModel<Categoria>{

	
	private CategoriaService service = new CategoriaService();
	public CategoriaDataModel() {
		// TODO Auto-generated constructor stub
	}
	
	public CategoriaDataModel(List<Categoria> list){
		super(list);
	}
	@Override
	public Categoria getRowData(String rowKey) {
		
		for(Categoria c : service.getCategorias())
			if(Integer.parseInt(rowKey) == c.getIdCategoria())
				return service.pesquisar(c);
		
		return null;
	}

	@Override
	public Object getRowKey(Categoria arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
