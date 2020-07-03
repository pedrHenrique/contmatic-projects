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

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		if (teste == "") {
			throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
		} else {
			this.teste = teste;
		}
	}

	public DateFormat getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(DateFormat dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public ProjetoFuncionario getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoFuncionario projeto) {
		this.projeto = projeto;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isStatusFun() {
		return statusFun;
	}
	
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
