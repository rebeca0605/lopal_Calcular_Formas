package br.sp.senai.jandira.calcular_formas.ui;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.CalculoDePoligonos;
import br.sp.senai.jandira.calcular_formas.model.Trapezio;
import br.sp.senai.jandira.calcular_formas.repository.CircuferenciaRepository;
import br.sp.senai.jandira.calcular_formas.repository.QuadradoRepository;
import br.sp.senai.jandira.calcular_formas.repository.RetanguloRepository;
import br.sp.senai.jandira.calcular_formas.repository.TrapezioRepository;
import br.sp.senai.jandira.calcular_formas.repository.TrianguloRepository;

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
		System.out.println("6 - Sair");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1 - 6): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoRepository quadradoRepository = new QuadradoRepository();
			quadradoRepository.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloRepository retanguloRepository = new RetanguloRepository();
			retanguloRepository.criarRetangulo();
		} else if (opcao == 3 ) {
			TrapezioRepository trapezioRepository = new TrapezioRepository();
			trapezioRepository.criarTrapezio();
		} else if (opcao == 4 ) {
			TrianguloRepository trianguloRepository = new TrianguloRepository();
			trianguloRepository.criarTriangulo();
		} else if (opcao == 5 ) {
			CircuferenciaRepository circuferenciaRepository = new CircuferenciaRepository();
			circuferenciaRepository.criarCircunferencia();
		} else if (opcao == 6) {
			System.out.print("Tem certeza que deseja sair? (S/N) ");
			String escolha = leitor.next();
			
			if (escolha.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Encerrando o sistema. Até mais!");
				System.out.println();
				System.exit(0);
			} else if (escolha.equalsIgnoreCase("n")) {
				criarMenu();
			} else {
				System.out.println();
				System.out.println("Você deve escolher somente \"s\" ou \"n\"!");
				criarMenu();
			} 
			
			
		} else {
			System.out.println("A opção selecionada ainda não foi implementada!");
		}
		
	}
}
