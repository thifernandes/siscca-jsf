package br.com.siscca.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.siscca.servico.DeficienciaServico;

@ManagedBean
@ViewScoped
public class DeficienciaController extends CrudController {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	void carregarServico() {
		this.setServico(DeficienciaServico.getInstance());
		this.nomeFuncionalidade = "Deficiência";
	}
}
