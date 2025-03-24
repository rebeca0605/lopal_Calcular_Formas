package br.sp.senai.jandira.calcular_formas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.Retangulo;

public class RetanguloRepository {
	
	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Retângulo...");
		System.out.println();
		System.out.print("Qual é a altura do Retângulo? ");
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.print("Qual é a base do Retângulo? ");
		
		retangulo.setBase(leitor.nextDouble());
		retangulo.mostrarDados();
		
		leitor.close();
	}

}
