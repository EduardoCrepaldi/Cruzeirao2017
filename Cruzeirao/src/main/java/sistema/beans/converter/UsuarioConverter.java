package sistema.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


import sistema.cruzeirao.Local;
import sistema.cruzeirao.Usuario;

import sistema.service.UsuarioService;


@FacesConverter(forClass=Local.class, value="usuarioConverter")
public class UsuarioConverter implements Converter{

	private UsuarioService servico = new UsuarioService();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Usuario u : servico.getUsuarios())
				 if(u.getUsername().equals(value))
				  	return u;
					
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof Local && value !=null)
			return ((Usuario) value).getUsername();
		return null;
	}
}
