package br.sp.senai.jandira.calcular_formas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.Circunferencia;

public class CircuferenciaRepository {
	
	public void criarCircunferencia() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando uma Circunferência...");
		System.out.println();
		System.out.print("Qual é o raio da Circunferência? ");
		
		Circunferencia circunferencia = new Circunferencia();
		
		circunferencia.setRaio(leitor.nextDouble());
		circunferencia.mostrarDados();
		
		leitor.close();
	}

}
