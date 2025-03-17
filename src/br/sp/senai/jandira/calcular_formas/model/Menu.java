package br.sp.senai.jandira.calcular_formas.model;

import java.util.Scanner;

public class Menu {
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("---------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Triângulo");
		System.out.println("5 - Circunferência");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 2) {
			CalculoDePoligonos.calcularRetangulo();
	
		} else {
			System.out.println("A opção selecionada ainda não foi implementada!");
		}
		
	}
}
