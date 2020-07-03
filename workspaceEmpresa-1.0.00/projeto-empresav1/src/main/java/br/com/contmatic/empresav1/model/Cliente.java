package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Scanner;

public class Cliente extends Pessoa {

	// Variáveis

	private static final String msg = "Not yet implemented";
	private DateFormat dtInscricao;
	private DateFormat ultContato;
	private boolean statusCli;

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
		System.out.print(msg);
	}

	@Override
	public void cadastrarPessoa(long idPessoa, String nome, String cpf) {
		System.out.print(msg);
	}

	@Override
	public void excluirPessoa(long id) {
		System.out.print(msg);
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

	@Override
	public String toString() {
		return "Cliente [dtInscricao=" + dtInscricao + ", ultContato=" + ultContato + ", statusCli=" + statusCli + "]";
	}

}
