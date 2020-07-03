package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Funcionario extends Pessoa {

	// Variáveis

	private String teste;

	private DateFormat dtAdmissao;

	private ProjetoFuncionario projeto;

	private Departamento departamento;

	private double salario;

	private boolean statusFun;

	// Construtores

	public Funcionario(long idPessoa, String nome, String cpf, String teste/* , DateFormat dtNascimento */) {
		super(idPessoa, nome, cpf/* , dtNascimento */);
		setTeste(teste);
	}

	public Funcionario() {
		super();

	}

	// Métodos

	@Override
	public void solicitarPessoa() {
		getPessoaLista().forEach(System.out::println);
	}

	@Override
	public void cadastrarPessoa(long idPessoa, String nome, String cpf) {
		System.out.println("#### Iniciando Cadastro de Funcionario ### \n");

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um nome p/ testar: ");
		String resposta = input.nextLine();
		setTeste(resposta);
		new Funcionario(idPessoa, nome, cpf, getTeste());
	}

	@Override
	public void excluirPessoa(long id) {
		// Instânciando Scanner e Iterator

		Scanner input = new Scanner(System.in);
		Iterator<Pessoa> iterator = getPessoaLista().iterator();

		while (iterator.hasNext()) {
			Pessoa obj = iterator.next();
			if (obj.getIdPessoa() == id) {
				System.out.println("A empresa encontrada foi: " + obj + ". Deseja remove-la? (s/n)");
				String resposta = input.nextLine();
				input.close();
				if (resposta.equalsIgnoreCase("s")) {
					iterator.remove();
					System.out.println("A empresa foi removida com sucesso\n");
					break;
				} else {
					System.out.println("Operação Abortada");
					break;
				}
			} else if (iterator.hasNext() == false && obj.getIdPessoa() != id) {
				extracted(id);
			}
		}

	}

	private void extracted(long id) {
		throw new IllegalArgumentException("A Empresa " + id + " não existe\n");
	}

	// Getters and Setters

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
		if (teste == "") {
			throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
		} else {
			this.teste = teste;
		}

	}

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

	@Override
	public String toString() {
		// Exemplo de Concatenar
		// String s = "Pessoa: [idPessoa= " + getIdPessoa() + ", nome= " + getNome() + "
		// [teste=" + teste + "]" ;
		// s += super.toString();
		return "Pessoa: [idPessoa= " + getIdPessoa() + ", nome= " + getNome() + ", cpf= " + getCpf() + " [teste="
				+ getTeste() + "]";
	}

}
