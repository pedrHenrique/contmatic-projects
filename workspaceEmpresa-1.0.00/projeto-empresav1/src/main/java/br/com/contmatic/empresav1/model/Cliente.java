package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Collection;
import java.util.HashSet;

public class Cliente extends Pessoa {

	// Variáveis

	private DateFormat dtInscricao;

	private DateFormat ultContato;

	private boolean statusCli;

	private static Collection<Cliente> clienteLista = new HashSet<Cliente>();

	// Construtores

	public Cliente(long idPessoa, String nome, String cpf/* , DateFormat dtNascimento */) {
		super(idPessoa, nome, cpf);
	}
	
	public Cliente() {
		super();
	}

	// Métodos

	@Override
	public void solicitarPessoa() {
		
	}

	@Override
	public void cadastrarPessoa() {
		System.out.println("#### Iniciando Cadastro de Cliente ### \n\n\n Ainda não Implementado");

	}

	@Override
	public void excluirPessoa() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	// Getters and Setters

	/**
	 * @return the dtInscricao
	 */
	public DateFormat getDtInscricao() {
		return dtInscricao;
	}

	/**
	 * @param dtInscricao the dtInscricao to set
	 */
	public void setDtInscricao(DateFormat dtInscricao) {
		this.dtInscricao = dtInscricao;
	}

	/**
	 * @return the ultContato
	 */
	public DateFormat getUltContato() {
		return ultContato;
	}

	/**
	 * @param ultContato the ultContato to set
	 */
	public void setUltContato(DateFormat ultContato) {
		this.ultContato = ultContato;
	}

	/**
	 * @return the statusCli
	 */
	public boolean isStatusCli() {
		return statusCli;
	}

	/**
	 * @param statusCli the statusCli to set
	 */
	public void setStatusCli(boolean statusCli) {
		this.statusCli = statusCli;
	}

}
