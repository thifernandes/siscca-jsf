package br.com.siscca.infra.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="booleanConverter")
public class BooleanConverter implements Converter {

	
	private static final String VALOR_NAO = "NÃO";
	private static final String VALOR_SIM = "SIM";

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		String retorno = null;
		
		if (arg2 != null) {
			Boolean valor = (Boolean) arg2;
			retorno = valor.equals(Boolean.TRUE) ? VALOR_SIM : VALOR_NAO;
		}
		
		return retorno;
	}

}
