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
		listaPessoa();

		// this.dtNascimento = dtNascimento;
	}

	public Pessoa() {

	}

	// Métodos
	
	
	// Método de listagem inicial.
	public void solicitarPessoa() {
		System.out.println("Exibindo Pessoa - Teste\n");
		pessoaLista.forEach(System.out::println);
	}
	
	//Método secundário para testes
	public static void listaPessoa() {
		System.out.println("Exibindo Pessoas da Classe Pessoa:");
		for (Pessoa p : pessoaLista) {
			System.out.println(p);
		}
	}

	public void cadastrarPessoa() {
		throw new UnsupportedOperationException("Not supported yet.");
		

	}

	public void excluirPessoa() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	private void adiciona(Pessoa p) {
		if (pessoaLista.contains(p)) {
			throw new IllegalArgumentException("A Pessoa " + getIdPessoa() + " já possui registro\n");
		} else {
			pessoaLista.add(p);
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

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", cpf=" + cpf + "]"
				+ "Dados de Funcionario: ";
	}

}
