package org.digitalse.TextExtractSvc.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.digitalse.TextExtractSvc.entity.Produto;
import org.springframework.data.domain.Page;

public class ProdutoDto {
	private int id;
	private String nome;
	private String descricao;
	private String emanta;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	public ProdutoDto(Produto produto) {
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.emanta = produto.getEmanta();
		this.dataCadastro = produto.getDataCadastro();
		this.dataInicio = produto.getDataInicio();
		this.valor = produto.getValor();
		
	}
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String getEmanta() {
		return emanta;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public float getValor() {
		return valor;
	}
	
	public static List<ProdutoDto> converter(List<Produto> produtos){
		return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
		//return produtos.map(ProdutoDto::new);
	}


}
