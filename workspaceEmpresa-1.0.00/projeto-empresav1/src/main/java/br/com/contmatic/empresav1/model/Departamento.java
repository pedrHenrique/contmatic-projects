package br.com.contmatic.empresav1.model;

public class Departamento {

	/**
	 * @param idDepartamento
	 * @param nome
	 * @param ramal
	 */

	public Departamento(long idDepartamento, String nome, int ramal) {
		setIdDepartamento(idDepartamento);
		setNome(nome);
		setRamal(ramal);
	}

	private long idDepartamento;

	private String nome;

	private int ramal;

	public void adicionarDep() {

	}

	public void removerDep() {

	}

	public void solicitarDep() {

	}

	// Getters And Setters

	public long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(long idDepartamento) {
		if (idDepartamento > 0) {
			this.idDepartamento = idDepartamento;
		} else {
			throw new IllegalArgumentException("O ID do departamento deve ser maior que zero!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 5 || nome.equalsIgnoreCase("TI")) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
		}
		
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		if (ramal > 0 && ramal <= 300) {
			this.ramal = ramal;
		} else {
			throw new IllegalArgumentException("Número de ramal precisa ser entre 1 a 300!");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ramal;
		result = prime * result + (int) (idDepartamento ^ (idDepartamento >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (ramal != other.ramal)
			return false;
		if (idDepartamento != other.idDepartamento)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nome=" + nome + ", Ramal=" + ramal + "]";
	}
	
	

}
