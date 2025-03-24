package br.sp.senai.jandira.calcular_formas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.Trapezio;

public class TrapezioRepository {
	
	public void criarTrapezio() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um Trapézio...");
		System.out.println();
		System.out.print("Qual é a base menor do Trapézio? ");
		
		Trapezio trapezio = new Trapezio();
		
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Qual é a base maior do Trapézio? ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Qual é a altura do Trapézio? ");
		trapezio.setAltura(leitor.nextDouble());
		trapezio.mostrarDados();
		
		leitor.close();
		
	}

}
