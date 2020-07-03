package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Collection;
import java.util.HashSet;

public abstract class Pessoa {

	// Variáveis

	private long idPessoa;

	private String nome;

	private String cpf;

	private DateFormat dtNascimento;

	private String endereco;

	private int telefone;

	private String email;

	private static Collection<Pessoa> pessoaLista = new HashSet<Pessoa>();

	// Construtores

	public Pessoa(long idPessoa, String nome, String cpf/* , DateFormat dtNascimento */) {
		setIdPessoa(idPessoa);
		setNome(nome);
		setCpf(cpf);
		adiciona(this);

		// this.dtNascimento = dtNascimento;
	}

	public Pessoa() {

	}

	// Métodos

	// Método de listagem inicial.
	public abstract void solicitarPessoa();

	// Método secundário para testes
	public void listaPessoa() {
		System.out.println("Exibindo Pessoas da Classe Pessoa:");
		for (Pessoa p : pessoaLista) {
			System.out.println(p);
		}
	}

	public abstract void cadastrarPessoa(long idPessoa, String nome, String cpf);

	public abstract void excluirPessoa(long id);

	private void adiciona(Pessoa p) {
		if (pessoaLista.contains(p)) {
			throw new IllegalArgumentException("A Pessoa " + getIdPessoa() + " já possui registro\n");
		} else {
			pessoaLista.add(p);
			System.out.println("Pessoa adicionada com sucesso.\n");
		}
	}

	// Getters and Setters

	/**
	 * @return the idPessoa
	 */
	public long getIdPessoa() {
		return idPessoa;
	}

	/**
	 * @param idPessoa the idPessoa to set
	 */
	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dtNascimento
	 */
	public DateFormat getDtNascimento() {
		return dtNascimento;
	}

	/**
	 * @param dtNascimento the dtNascimento to set
	 */
	public void setDtNascimento(DateFormat dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the pessoaLista
	 */
	public static Collection<Pessoa> getPessoaLista() {
		return pessoaLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idPessoa ^ (idPessoa >>> 32));
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
		Pessoa other = (Pessoa) obj;
		if (idPessoa != other.idPessoa)
			return false;
		return true;
	}

	@Override
	public abstract String toString();

}
