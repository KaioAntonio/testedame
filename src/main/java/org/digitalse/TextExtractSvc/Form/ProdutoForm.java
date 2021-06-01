package org.digitalse.TextExtractSvc.Form;

import java.util.Date;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;

public class ProdutoForm {
	private String nome;
	private String descricao;
	private String emanta;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEmanta(String emanta) {
		this.emanta = emanta;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Produto converter() {
		return new Produto(nome, descricao, emanta, dataCadastro, dataInicio, valor);
	}
	

}
