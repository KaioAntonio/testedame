package org.digitalse.TextExtractSvc.Form;

import java.util.Date;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.digitalse.TextExtractSvc.repository.ProdutoRepository;

public class AtualizaProdutoForm {
	private String nome;
	private String descricao;
	private String emanta;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getEmanta() {
		return emanta;
	}



	public void setEmanta(String emanta) {
		this.emanta = emanta;
	}



	public Date getDataCadastro() {
		return dataCadastro;
	}



	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	public Date getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public String getNome() {
		return nome;
	}
	
	public Produto atualizar(Long id, ProdutoRepository repositorio) {
		Produto produto = repositorio.getOne(id);
		produto.setNome(this.nome);
		produto.setDescricao(this.descricao);
		produto.setEmanta(this.emanta);
		produto.setDataCadastro(this.dataCadastro);
		produto.setDataInicio(this.dataInicio);
		produto.setValor(this.valor);
		return produto;
	}
}
