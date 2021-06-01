package org.digitalse.TextExtractSvc.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String descricao;
	private String emanta;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;

	
	public Produto(String nome, String descricao, String emanta, Date dataCadastro, Date dataInicio,
			float valor) {
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setEmanta(emanta);
		this.setDataCadastro(dataCadastro);
		this.setDataInicio(dataInicio);
		this.setValor(valor);
	}

	public Produto() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
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

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + " ]";
	}
	
	
	

}
