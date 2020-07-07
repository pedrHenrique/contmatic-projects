package br.com.contmatic.empresav1.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Departamento {

	// Variáveis
	private long idDepartamento;
	private String nome;
	private int ramal;
	private static Collection<Departamento> departamentoLista = new HashSet<Departamento>();

	// Construtores
	public Departamento(long idDepartamento, String nome, int ramal) {
		setIdDepartamento(idDepartamento);
		setNome(nome);
		setRamal(ramal);
		adiciona(this);
	}

	public Departamento() {
		
	}
	
	// Métodos
	
	public void listarDepartamentos() {
		System.out.println("Lista Departamentos\n");
		departamentoLista.forEach(System.out::println);
	}

	public void adicionarDep(long id) {
		System.out.print("#### Iniciando Cadastro de Departamento ### \n");
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o nome do Departamento: ");
		setNome(input.nextLine());
		System.out.print("\nDigite o Ramal do Departamento: ");
		setRamal(input.nextInt());
		new Departamento(id, getNome(), getRamal());

	}

	public void adicionarDep(long id, String nome, int ramal) {
		new Departamento(id, nome, ramal);
	}

	private void adiciona(Departamento departamento) {
		if (departamentoLista.contains(departamento)) {
			throw new IllegalArgumentException("O Departamento " + getIdDepartamento() + " já possui registro\n");
		} else {
			departamentoLista.add(departamento);
		}
	}
	
	public Departamento solicitarDep(long id) {
		Iterator<Departamento> iterator = getDepartamentoLista().iterator();
		while (iterator.hasNext()) {
			Departamento obj = iterator.next();
			if (obj.getIdDepartamento() != id && iterator.hasNext() == false) {
				throw new IllegalArgumentException("Departamento " + id + " não existe\n");
			} else if (obj.getIdDepartamento() == id) {
				return obj;
			}
		}
		return null;

	}

	public Departamento solicitarDep() { //Not able to run with multiples requests 
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Insira o número do ID do Departamento");
			long id = input.nextLong();
			Iterator<Departamento> iterator = getDepartamentoLista().iterator();
			while (iterator.hasNext()) {
				Departamento obj = iterator.next();
				if (obj.getIdDepartamento() != id && iterator.hasNext() == false) {
					throw new IllegalArgumentException("Departamento " + id + " não existe\n");
				} else if (obj.getIdDepartamento() == id) {
					return obj;
				}
			}
		}
		return null;
	}

	public void removerDep(long id) {
		Iterator<Departamento> iterator = getDepartamentoLista().iterator();
		while (iterator.hasNext()) {
			Departamento obj = iterator.next();
			if (obj.getIdDepartamento() != id && iterator.hasNext() == false) {
				throw new IllegalArgumentException("O Departamento " + id + " não existe\n");
			} else if (obj.getIdDepartamento() == id) {
				break;
			}
			System.out.println("Departamento encontrado: " + obj + ". Deseja removelo?");
			try (Scanner input = new Scanner(System.in)) {
				String resposta = input.nextLine();
				if (resposta.equalsIgnoreCase("s")) {
					iterator.remove();
					System.out.println("Departamento foi excluido com sucesso\n");
				} else {
					System.out.println("Operação Abortada");
				}
			}
		}

	}


	// Getters And Setters

	public long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(long idDepartamento) {
		if (idDepartamento > 0 && idDepartamento <= 300) {
			this.idDepartamento = idDepartamento;
		} else {
			throw new IllegalArgumentException("O ID do departamento deve ser maior que zero!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!(nome.length() < 5) && !(nome.isEmpty())) { //Se Nome ñ tiver um tam > que 5 e nome não estiver vazio
			this.nome = nome;// adicione nome
		} else {
			throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
		}

	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		if (ramal > 0 && ramal <= 999) {
			this.ramal = ramal;
		} else {
			throw new IllegalArgumentException("Número de ramal precisa ser entre 1 a 999!");
		}

	}

	public static Collection<Departamento> getDepartamentoLista() {
		return departamentoLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idDepartamento ^ (idDepartamento >>> 32));
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
		Departamento other = (Departamento) obj;
		if (idDepartamento != other.idDepartamento)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("Departamento: " + nome + ", idDepartamento=" + idDepartamento + ", Ramal=" + ramal);

	}

}
