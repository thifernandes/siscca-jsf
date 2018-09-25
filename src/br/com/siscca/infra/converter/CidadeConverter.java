package br.com.siscca.infra.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.siscca.entidade.Cidade;

@FacesConverter(forClass=Cidade.class)
public class CidadeConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		Cidade cidade = new Cidade(arg2);
		return cidade;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		String idCidade = null;
		
		if (arg2 != null) {
			Cidade cidade = (Cidade) arg2;
			idCidade = cidade.getId() != null ? cidade.getId().toString() : null;
		}
		
		return idCidade;
	}

}
