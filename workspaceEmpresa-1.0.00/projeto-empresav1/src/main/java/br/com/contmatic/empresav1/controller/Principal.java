package br.com.contmatic.empresav1.controller;

import br.com.contmatic.empresav1.model.Cliente;
import br.com.contmatic.empresav1.model.Departamento;
import br.com.contmatic.empresav1.model.Empresa;
import br.com.contmatic.empresav1.model.Projeto;
import br.com.contmatic.empresav1.model.ProjetoFuncionario;
import br.com.contmatic.empresav1.model.Funcionario;
import br.com.contmatic.empresav1.model.Pessoa;

/* -> Tarefas P/ Semana do dia 03
 * 	> Implementar Hashcode, registrando e removendo o objeto - Feito
 *  > Implementar a correta funcionalidade para a classe Pessoa e suas subclasses - Iniciado
 *  > Qualquer tempo que sobrar, continuar incorporando o projeto. 
*/

public class Principal {
	public static void main (String [] args) {
		
	/* Métodos de Teste da Classe Empresa	
		Empresa e = new Empresa();
		e.registrarEmpresa(1, "TestMatic", "57.695.925/0001-11", "Rua do Mangericao 83", "1145649304");
		
		Empresa d = new Empresa();
		d.registrarEmpresa(2,"MarcaoTimatic", "89.138.206/0001-96", "Rua do Ricardo Guina 75", "11941063792");
		
		Empresa f = new Empresa();
		f.registrarEmpresa(3, "TestMatiiic", "60.449.385/0001-09", "Rua do São Sebastião 55", "1104028922");
		
		Empresa g = new Empresa();
		g.removerEmpresa(3);
	*/
		
	// Testando Polimorfismo das classes Pessoa/Cliente/Funcionario
	Pessoa p = new Funcionario(1, "Carlos Alberto", "005.845.669.15", "Teeestando" );

	p.cadastrarPessoa();

	
	}
}
