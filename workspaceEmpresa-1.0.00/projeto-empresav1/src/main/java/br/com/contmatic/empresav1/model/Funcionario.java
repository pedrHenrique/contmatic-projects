package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Funcionario extends Pessoa {

	// Variáveis

	private String email;
	private DateFormat dtAdmissao;
	private Departamento departamento;
	private double salario;
	private boolean statusFun;
	// TODO private ProjetoFuncionario projeto; Furutamente ProjetoFuncionario
	// poderá ser adicionado

	// Construtores

	public Funcionario(long idPessoa, String nome, String cpf, String endereco, String telefone, String email, /* DateFormat dtadimissao, Departamento dep*/ double salario) {
		super(idPessoa, nome, cpf, endereco, telefone);
		setEmail(email);
		setSalario(salario);
		// setAtributo(atributo);
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
	public void cadastrarPessoa(long ID, String nome, String cpf, String endereco, String telefone, String email, double salario) {
		System.out.print("#### Cadastrando Funcionario \n");
		new Funcionario(ID, nome, cpf, endereco, telefone, email, salario);
	}
	
	@Override
	public void cadastrarPessoa(long idPessoa) {
		System.out.print("#### Iniciando Cadastro de Funcionario ### \n");
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		setNome(input.nextLine());
		System.out.print("\nDigite o CPF sem pontuação: ");
		setCpf(input.nextLine());
		System.out.print("\nDigite o endereço: ");
		setEndereco(input.nextLine());
		System.out.print("\nDigite o telefone: ");
		setTelefone(input.nextLine());
		System.out.print("\nDigite o Email: ");
		setEmail(input.nextLine());
		System.out.print("\nDigite o Salario: ");
		setSalario(input.nextDouble());
		new Funcionario(idPessoa, getNome(), getCpf(), getEndereco(), getTelefone(), getEmail(), getSalario());
	}

	@Override
	public void excluirPessoa(long id) {
		// Instânciando Scanner e Iterator

		Scanner input = new Scanner(System.in);
		Iterator<Pessoa> iterator = getPessoaLista().iterator();

		while (iterator.hasNext()) {
			Pessoa obj = iterator.next();
			if (obj.getIdPessoa() == id) {
				System.out.println("O Funcionario encontrado foi: " + obj + ". Deseja remove-la? (s/n)");
				String resposta = input.nextLine();
				input.close();
				if (resposta.equalsIgnoreCase("s")) {
					iterator.remove();
					System.out.println("O Funcionario foi removida com sucesso\n");
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

	public DateFormat getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(DateFormat dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "Funcionario: [ID= " + getIdPessoa() + ", Nome= " + getNome() + ", Cpf= " + getCpf() + " Endereço= "
				+ getEndereco() + " Telefone=  " + getTelefone() + " Email= "
						+ getEmail() + " Salario=  " + getSalario() +"]";
	}
}

//public String toString() {
// Exemplo de Concatenar
// String s = "Pessoa: [idPessoa= " + getIdPessoa() + ", nome= " + getNome() + " [teste=" + teste + "]" ;
// s += super.toString();
// return s;
