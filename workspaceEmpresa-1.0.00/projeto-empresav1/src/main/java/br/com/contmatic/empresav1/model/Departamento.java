package br.com.contmatic.empresav1.model;

public class Departamento {

	/**
	 * @param idDepartamento
	 * @param nome
	 * @param ramal
	 */
	
	public Departamento(long idDepartamento, String nome, int ramal) {
		super();
		Departamento.idDepartamento = idDepartamento;
		this.nome = nome;
		Ramal = ramal;
	}

	private static long idDepartamento;

	private String nome;

	private int Ramal;

	public void adicionarDep() {

	}

	public void removerDep() {

	}

	public void solicitarDep() {

	}
	
	// Getters And Setters 

	/**
	 * @return the idDepartamento
	 */
	public long getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

}
