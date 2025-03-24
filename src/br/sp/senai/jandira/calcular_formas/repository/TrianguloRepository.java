package br.sp.senai.jandira.calcular_formas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.Triangulo;

public class TrianguloRepository {
	
	public void criarTriangulo() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Triângulo...");
		System.out.println();
		System.out.print("Qual é a base do Triângulo? ");
		
		Triangulo triangulo = new Triangulo();
		
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual é a altura do Triângulo? ");
		triangulo.setAltura(leitor.nextDouble());
		triangulo.mostrarDados();
		
		leitor.close();
		
	}

}
