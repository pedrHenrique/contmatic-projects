package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	
	//Variáveis
	
	private String teste;

	private DateFormat dtAdmissao;

	private ProjetoFuncionario projeto;

	private Departamento departamento;

	private double salario;

	private boolean statusFun;
	
	private static Collection<Funcionario> funcionarioLista = new HashSet<Funcionario>();
	
	//Construtores

	
	public Funcionario(long idPessoa, String nome, String cpf, String teste/*, DateFormat dtNascimento*/) {
		super(idPessoa, nome, cpf/*, dtNascimento*/);
		setTeste(teste);
		adiciona(this);
	}
	
	public Funcionario() {
		super();
		
	}

	/**
	 * Exemplos de Teste
	 */
	public String getTeste() {
		return teste;
	}

	/**
	 * Exemplos de Teste
	 */
	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	// Métodos 

	@Override
	public void solicitarPessoa() {
		System.out.println("Exibindo Funcionario - Teste\n");
		funcionarioLista.forEach(System.out::println);
	}

	@Override
	public void cadastrarPessoa() {
		System.out.println("#### Iniciando Cadastro de Funcionario ### \n\n\n Ainda não Implementado");
	/*	
		System.out.println("#### Iniciando Cadastro de Funcionario ###");
		String resposta = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um nome p/ testar");
		resposta = input.nextLine();
		setTeste(resposta);
	*/
		
	}

	private void adiciona(Funcionario f) {
		if (funcionarioLista.contains(f)) {
			throw new IllegalArgumentException("A Pessoa " + getIdPessoa() + " já possui registro\n");
		} else {
			funcionarioLista.add(f);
		}
	}
	
	@Override
	public void excluirPessoa() {

	}
	
	
	// Getters and Setters
	

	/**
	 * @return the dtAdmissao
	 */
	public DateFormat getDtAdmissao() {
		return dtAdmissao;
	}

	/**
	 * @param dtAdmissao the dtAdmissao to set
	 */
	public void setDtAdmissao(DateFormat dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	/**
	 * @return the projeto
	 */
	public ProjetoFuncionario getProjeto() {
		return projeto;
	}

	/**
	 * @param projeto the projeto to set
	 */
	public void setProjeto(ProjetoFuncionario projeto) {
		this.projeto = projeto;
	}

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the statusFun
	 */
	public boolean isStatusFun() {
		return statusFun;
	}

	/**
	 * @param statusFun the statusFun to set
	 */
	public void setStatusFun(boolean statusFun) {
		this.statusFun = statusFun;
	}	

}
