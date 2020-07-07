package br.com.contmatic.empresav1.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Scanner;

public class Empresa {

	// Variáveis
	private long idEmpresa;
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	private static Collection<Empresa> empresaLista = new HashSet<Empresa>();

	/*
	 * Construtor utilizado para instanciar a classe empresa
	 */
	public Empresa(long idEmpresa, String nome, String cnpj, String endereco, String telefone) {
		setIdEmpresa(idEmpresa);
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	/*
	 * Construtor para a utilização da classe sem a necessidade de parâmetros
	 */
	public Empresa() {

	}

	public void registrarEmpresa(long idEmpresa, String nome, String cnpj, String endereco, String telefone) {
		setIdEmpresa(idEmpresa);
		setNome(nome);
		setCnpj(cnpj);
		setEndereco(endereco);
		setTelefone(telefone);

		Empresa empresa = new Empresa(getIdEmpresa(), getNome(), getCnpj(), getEndereco(), getTelefone());

		if (empresaLista.contains(empresa)) {
			throw new IllegalArgumentException("A Empresa " + getIdEmpresa() + " já possui registro\n");
		} else {
			empresaLista.add(empresa);
			System.out.println("A empresa com ID: " + getIdEmpresa() + " Foi cadastrada com sucesso!\n");
		}
	}

	public void removerEmpresa(long id) {
		Iterator<Empresa> iterator = empresaLista.iterator();
		while (iterator.hasNext()) {
			Empresa obj = iterator.next();
			if (obj.getIdEmpresa() != id && iterator.hasNext() == false) {
				throw new IllegalArgumentException("A Empresa " + id + " não existe\n");
			} else if (obj.getIdEmpresa() == id) {
				break;
			}
			System.out.println("A empresa encontrado foi: " + obj + ". Deseja removela?");
			try (Scanner input = new Scanner(System.in)) {
				String resposta = input.nextLine();
				if (resposta.equalsIgnoreCase("s")) {
					iterator.remove();
					System.out.println("A empresa foi excluido com sucesso\n");
				} else {
					System.out.println("Operação Abortada");
				}
			}
		}
	}

	public void listarEmpresas() {
		empresaLista.forEach(System.out::println);
	}

	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 5) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
		}
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {//TODO Modificar CPF amanhã
		if (cnpj.length() == 18) {
			this.cnpj = cnpj;
		} else {
			throw new IllegalArgumentException(
					"CNPJ precisa ter os 14 números mais a pontuação. Ex.: 00.000.000/0001-00!");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		//TODO Definir configuração para Endereco
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() > 11 || telefone.length() < 15) {
			this.telefone = telefone;
		} else {
			throw new IllegalArgumentException("O telefone está incorreto. Ex.: 011998420563");
		}

	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		if (idEmpresa > 0) {
			this.idEmpresa = idEmpresa;
		} else {
			throw new IllegalArgumentException("O ID da empresa deve ser maior que zero!");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idEmpresa ^ (idEmpresa >>> 32));
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
		Empresa other = (Empresa) obj;
		if (idEmpresa != other.idEmpresa)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa: " + "[ID=" + idEmpresa + ", Nome=" + nome + ", CNPJ=" + cnpj + ", Endereco=" + endereco + "]";
	}

}
