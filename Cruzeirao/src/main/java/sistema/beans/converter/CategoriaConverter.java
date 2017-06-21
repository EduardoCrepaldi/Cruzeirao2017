package sistema.beans.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import sistema.cruzeirao.Categoria;
import sistema.service.CategoriaService;

@FacesConverter(forClass=Categoria.class, value="categoriaConverter")
public class CategoriaConverter implements Converter{

	private CategoriaService servico = new CategoriaService();
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.isEmpty()) {
			
			  for(Categoria c : servico.getCategorias())
				 if(c.getNome().equals(value))
				  	return c;
					
		}

		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value instanceof Categoria && value !=null)
			return ((Categoria) value).getNome();
		return null;
	}
}
