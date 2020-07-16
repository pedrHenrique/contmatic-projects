package br.com.contmatic.empresav1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.contmatic.empresav1.model.Departamento;
import junit.framework.Assert;

public class DepartamentoTestAdiciona {

	@Test
	public void testAdiciona1() {
		long passaValor = 1;
		String passaNome = "Carlos";
		int passaRamal = 145;

		Departamento test1 = new Departamento(passaValor, passaNome, passaRamal);
		assertEquals(passaValor, test1.getIdDepartamento());
		assertNotNull(test1.solicitarDep(passaValor));
	}

	@Test
	public void testeAdiciona2() {
		long passaValor = 2;
		String passaNome = "Rogerio";
		int passaRamal = 100;

		Departamento test2 = new Departamento();
		test2.adicionarDep(passaValor, passaNome, passaRamal);
		assertEquals("ID Esperado era:", passaValor, test2.getIdDepartamento());
		assertNotNull(test2.solicitarDep(2));
	}

	@Test
	public void testAdiciona3() { // Possui Erro
		Departamento test3 = new Departamento();
		test3.adicionarDep();
		assertNotNull(test3.solicitarDep());
		assertSame(test3, test3.solicitarDep());

	}
	
	@Test
	public void adicionaMultiplos() {
		Departamento test4 = new Departamento();
		test4.adicionarDep(10, "Rogerio", 556);
		test4.adicionarDep(11, "Robertino", 762);
		test4.adicionarDep(12, "Rogerio Ragozini", 426);
		assertNotNull("Confirmando Departamentos registrados", test4.solicitarDep(10));
		assertNotNull("Confirmando Departamentos registrados", test4.solicitarDep(11));
		assertNotNull("Confirmando Departamentos registrados", test4.solicitarDep(12));
		test4.listarDepartamentos();
	}
	
	
	
	

}
