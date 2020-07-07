package br.com.contmatic.empresav1.controller;

import br.com.contmatic.empresav1.model.Departamento;
import br.com.contmatic.empresav1.model.Empresa;
import br.com.contmatic.empresav1.model.Funcionario;
import br.com.contmatic.empresav1.model.Pessoa;

/*
 * 
 * > Projeto já previamente pronto para ser testado
 * 
 */

public class Principal {
	public static void main (String [] args) {
		// Principal funcionou como base para testes primitivos
	/*
	 //Métodos de Teste da Classe Empresa	
		Empresa e = new Empresa();
		e.registrarEmpresa(1, "TestMatic", "57.695.925/0001-11", "Rua do Mangericao 83", "1145649304");
		
		Empresa d = new Empresa();
		d.registrarEmpresa(2,"MarcaoTimatic", "89.138.206/0001-96", "Rua do Ricardo Guina 75", "11941063792");
		
		Empresa f = new Empresa();
		f.registrarEmpresa(3, "TestMatiiic", "60.449.385/0001-09", "Rua do São Sebastião 55", "1104028922");
		
		Empresa g = new Empresa();
		g.removerEmpresa(3);
	*/
	
	//Testando Polimorfismo e Ligação de Funcionario com Departamento
		
		

		new Departamento(10, "Contábil", 100);
		new Departamento(11, "Fincanceiro", 110);
		new Departamento(12, "Markting", 120);
		Departamento d = new Departamento();
		d.listarDepartamentos();
		
		Pessoa p = new Funcionario();
		//p.cadastrarPessoa(1);
		p.cadastrarPessoa(5, "Junior", "Roberto", "Carlos", "Augusto", "Da silva", 4500);
		//p.cadastrarPessoa(6, "Carlos", "Roberto", "Carlos", "Augusto", "Da silva", 6500);
		//p.cadastrarPessoa(2);
		//p.cadastrarPessoa(3);
		p.solicitarPessoa();
		
		//p.excluirPessoa(4);
	
	
		
	/*	
		Empresa emp = new Empresa();
		emp.registrarEmpresa(4, "JuniorRobertinho", "60.449.385/0001-09", "Rua do São Sebastião 55", "20593218005");
		emp.registrarEmpresa(5, "JuniorRobertinho", "60.449.385/0001-09", "Rua do São Sebastião 55", "20593218005");
		emp.registrarEmpresa(6, "JuniorRobertinho", "60.449.385/0001-09", "Rua do São Sebastião 55", "20593218005");
		emp.removerEmpresa(5);
	*/
		
	//Departamento d = new Departamento();
	//d.adicionarDep(1, "Jubliskeison", 125);
	//d.adicionarDep(2, "Jubiskeison", 123);
	//d.adicionarDep(3, "Jubliskeison", 125);
	

	
	}
}
