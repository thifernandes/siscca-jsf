package br.com.siscca.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.siscca.servico.RedeReferenciaServico;

@ManagedBean
@ViewScoped
public class RedeReferenciaController extends CrudController {
	
	/**
	 * Serial UID.
	 */
	private static final long serialVersionUID = 1L;

	@Override
	void carregarServico() {
		this.setServico(RedeReferenciaServico.getInstance());
		this.nomeFuncionalidade = "Rede de referência";
	}
}
