package br.com.siscca.infra.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.siscca.entidade.Uf;

@FacesConverter(forClass=Uf.class)
public class UfConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		Uf uf = new Uf(arg2);
		return uf;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		String siglaUf = null;
		
		if (arg2 != null) {
			Uf uf = (Uf) arg2;
			siglaUf = uf.getSiglaUf();
		}
		
		return siglaUf;
	}

}
