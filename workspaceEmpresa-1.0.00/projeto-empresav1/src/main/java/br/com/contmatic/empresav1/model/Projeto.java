package br.com.contmatic.empresav1.model;

import java.text.DateFormat;

/**
 * 
 * -> IDEA:Projeto poderia funcionar como forma de remuneração aos funcionários. Tendo interação com as datas do projeto. 
 * * Atributo Exemplo para uma possível funcionalidade:
 *  - dtEstimativa : DateFormat *
 */
public class Projeto {

	/**
	 * @param idProjeto
	 * @param nome
	 * @param descricao
	 * @param dtInicio
	 * @param statusPro
	 */
	public Projeto(long idProjeto, String nome, String descricao, DateFormat dtInicio, boolean statusPro) {
		super();
		this.idProjeto = idProjeto;
		this.nome = nome;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.statusPro = statusPro;
	}

	private long idProjeto;

	private String nome;

	private String descricao;

	private DateFormat dtInicio;

	private DateFormat dtFim;

	private boolean statusPro;

	public void adicionarPro() {

	}

	public void canelarPro(int dtFim) {

	}

	public void solicitarPro() {

	}
	
	
	
	//Getters And Setters
	
	/**
	 * @return the idProjeto
	 */
	public long getIdProjeto() {
		return idProjeto;
	}
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the dtInicio
	 */
	public DateFormat getDtInicio() {
		return dtInicio;
	}

	/**
	 * @param dtInicio the dtInicio to set
	 */
	public void setDtInicio(DateFormat dtInicio) {
		this.dtInicio = dtInicio;
	}

	/**
	 * @return the dtFim
	 */
	public DateFormat getDtFim() {
		return dtFim;
	}

	/**
	 * @param dtFim the dtFim to set
	 */
	public void setDtFim(DateFormat dtFim) {
		this.dtFim = dtFim;
	}

	/**
	 * @return the statusPro
	 */
	public boolean isStatusPro() {
		return statusPro;
	}

	/**
	 * @param statusPro the statusPro to set
	 */
	public void setStatusPro(boolean statusPro) {
		this.statusPro = statusPro;
	}

}
