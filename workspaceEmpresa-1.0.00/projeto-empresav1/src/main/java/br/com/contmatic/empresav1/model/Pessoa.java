package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Collection;
import java.util.HashSet;

public abstract class Pessoa {

	// Variáveis

	private long idPessoa;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private static Collection<Pessoa> pessoaLista = new HashSet<Pessoa>();

	// Construtores

	public Pessoa(long idPessoa, String nome, String cpf, String endereco, String telefone) {
		setIdPessoa(idPessoa);
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
		adiciona(this);
	}

	public Pessoa() {

	}

	// Métodos

	// Método de listagem inicial.
	public abstract void solicitarPessoa();
	
	public abstract void cadastrarPessoa(long idPessoa);
	
	public abstract void cadastrarPessoa(long idPessoa, String nome, String cpf, String endereco, String telefone, String email, double salario);

	public abstract void excluirPessoa(long id);

	// Método secundário para testes
	public void listaPessoa() {
		System.out.println("Exibindo Pessoas da Classe Pessoa:");
		for (Pessoa p : pessoaLista) {
			System.out.println(p);
		}
	}

	private void adiciona(Pessoa p) {
		if (pessoaLista.contains(p)) {
			throw new IllegalArgumentException("A Pessoa " + getIdPessoa() + " já possui registro\n");
		} else {
			pessoaLista.add(p);
			System.out.println("Pessoa adicionada com sucesso.\n");
		}
	}

	// Getters and Setters

	public long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

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
