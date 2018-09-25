package br.com.siscca.infra.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.siscca.entidade.EntidadeCrud;

@FacesConverter(forClass=EntidadeCrud.class)
public class EntidadeCrudConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		EntidadeCrud entidade = new EntidadeCrud(arg2);
		return entidade;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		String id = null;
		
		if (arg2 != null) {
			EntidadeCrud entidade = (EntidadeCrud) arg2;
			id = entidade.getId().toString();
		}
		
		return id;
	}

}
