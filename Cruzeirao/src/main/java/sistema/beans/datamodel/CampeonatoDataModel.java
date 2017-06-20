package sistema.beans.datamodel;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import sistema.cruzeirao.Campeonato;
import sistema.service.CampeonatoService;

public class CampeonatoDataModel extends ListDataModel<Campeonato> implements SelectableDataModel<Campeonato>  {

	
	private CampeonatoService service = new CampeonatoService();
	
	public CampeonatoDataModel() {

	}
	public CampeonatoDataModel(List<Campeonato> list) {
		super(list);
	}
	@Override
	public Object getRowKey(Campeonato object) {
		return object.getIdCampeonato();
	}

	@Override
	public Campeonato getRowData(String rowKey) {
		for(Campeonato c: service.getCampeonatos())
			   if(Integer.parseInt(rowKey) ==  c.getIdCampeonato())
				   return c;
			return null;
	}

}
