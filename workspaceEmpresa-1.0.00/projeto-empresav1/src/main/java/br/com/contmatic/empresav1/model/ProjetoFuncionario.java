package br.com.contmatic.empresav1.model;

import java.text.DateFormat;

public class ProjetoFuncionario {

	/**
	 * @param idProjeto
	 * @param idPessoa
	 * @param dtInicio
	 * @param funcao
	 */
	public ProjetoFuncionario(Projeto idProjeto, Funcionario idPessoa, DateFormat dtInicio, String funcao) {
		super();
		this.idProjeto = idProjeto;
		this.idPessoa = idPessoa;
		this.dtInicio = dtInicio;
		this.funcao = funcao;
	}

	private Projeto idProjeto;

	private Funcionario idPessoa;

	private DateFormat dtInicio;

	private String funcao;
	
	//Ideia inicial. Idelizar a melhor forma de implementar
	public void solicitarProjeto(Funcionario idFuncionario) {
		
	}

	public void removerFunProjeto() {

	}

	public void realocarProjeto() {

	}
	
	
	//Getters And Setters

	/**
	 * @return the idProjeto
	 */
	public Projeto getIdProjeto() {
		return idProjeto;
	}

	/**
	 * @param idProjeto the idProjeto to set
	 */
	public void setIdProjeto(Projeto idProjeto) {
		this.idProjeto = idProjeto;
	}

	/**
	 * @return the idPessoa
	 */
	public Funcionario getIdPessoa() {
		return idPessoa;
	}

	/**
	 * @param idPessoa the idPessoa to set
	 */
	public void setIdPessoa(Funcionario idPessoa) {
		this.idPessoa = idPessoa;
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
	 * @return the funcao
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao the funcao to set
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
