package br.com.contmatic.empresav1.model;

import java.text.DateFormat;
import java.util.Iterator;
import java.util.Scanner;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Funcionario extends Pessoa {

	// Variáveis

	private String email;
	private Departamento departamento;
	private double salario;
	private boolean statusFun;
	// TODO private ProjetoFuncionarioProjeto e DtAdmissão furutamente planejados

	// Construtores

	public Funcionario(long idPessoa, String nome, String cpf, String endereco, String telefone, String email,
			Departamento dep, double salario) {
		super(idPessoa, nome, cpf, endereco, telefone);
		setEmail(email);
		setDepartamento(dep);
		setSalario(salario);
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
	public void cadastrarPessoa(long id, String nome, String cpf, String endereco, String telefone, String email,
			double salario) {
		Departamento dep = new Departamento();
		new Funcionario(id, nome, cpf, endereco, telefone, email, dep.solicitarDep(), salario);
	}

	@Override
	public void cadastrarPessoa(long idPessoa) {
		long resposta;
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
		// Instânciando Departamento
		Departamento d = new Departamento();
		d.listarDepartamentos();
		System.out.print("\nDigite o Departamento desejado: ");
		resposta = input.nextLong();
		input.close();
		setDepartamento(d.solicitarDep(resposta));
		new Funcionario(idPessoa, getNome(), getCpf(), getEndereco(), getTelefone(), getEmail(), getDepartamento(),
				getSalario());
	}

	@Override
	public void removerPessoa(long id) {
		Iterator<Pessoa> iterator = getPessoaLista().iterator();
		while (iterator.hasNext()) {
			Pessoa obj = iterator.next();
			if (obj.getIdPessoa() != id && iterator.hasNext() == false) {
				throw new IllegalArgumentException("A pessoa com o ID: " + id + " não existe\n");
			} else if (obj.getIdPessoa() == id) {
				break;
			}
			System.out.println("Pessoa encontrado[a: " + obj + ". Deseja removelo?");
			try (Scanner input = new Scanner(System.in)) {
				String resposta = input.nextLine();
				if (resposta.equalsIgnoreCase("s")) {
					iterator.remove();
					System.out.println("Pessoa removida com sucesso\n");
				} else {
					System.out.println("Operação Abortada");
				}
			}
		}
	}

	// Getters and Setters

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@") && !(email.isEmpty() && email.length() < 5)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException(
					"Por favor, digite um email válido. Ex.: pedro.silva@contmatic.com.br\n");
		}
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) { // Está Verificando
		if (Departamento.getDepartamentoLista().contains(departamento)) {
			this.departamento = departamento;
		} else {
			throw new IllegalArgumentException("Este departamento não possui registro\n");
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0 && salario <= 10000.00) {
			this.salario = salario;
		} else {
			throw new IllegalArgumentException("Salario está incorreto!");
		}

	}

	public boolean isStatusFun() {

		throw new NotImplementedException();
	}

	public void setStatusFun(boolean statusFun) {
		throw new NotImplementedException();
	}

	@Override
	public String toString() {
		return "Funcionario: [ID= " + getIdPessoa() + ", Nome= " + getNome() + ", Cpf= " + getCpf() + " Endereço= "
				+ getEndereco() + " Telefone= " + getTelefone() + " Email= " + getEmail() + " Salario=  " + getSalario()
				+ getDepartamento() + "]";
	}
}

//public String toString() {
// Exemplo de Concatenar
// String s = "Pessoa: [idPessoa= " + getIdPessoa() + ", nome= " + getNome() + " [teste=" + teste + "]" ;
// s += super.toString();
// return s;
