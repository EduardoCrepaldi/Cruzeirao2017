package sistema.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;


import sistema.cruzeirao.Local;

import sistema.service.LocalService;

public class LocaisConverter implements Converter{

	private LocalService servico = new LocalService();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Local l : servico.getLocais())
				 if(l.getNome().equals(value))
				  	return l;
					
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof Local && value !=null)
			return ((Local) value).getNome();
		return null;
	}
}
