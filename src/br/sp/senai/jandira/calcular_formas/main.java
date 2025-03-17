package br.sp.senai.jandira.calcular_formas;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

import br.sp.senai.jandira.calcular_formas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formas.model.Menu;
import br.sp.senai.jandira.calcular_formas.model.Quadrado;
import br.sp.senai.jandira.calcular_formas.model.Retangulo;
import br.sp.senai.jandira.calcular_formas.model.Trapezio;
import br.sp.senai.jandira.calcular_formas.model.Triangulo;

public class main {
	
	public static void main (String[] args) {
		
		Menu.criarMenu();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual é a altura do retângulo? ");
		double valorAltura = leitor.nextDouble();
		
		System.out.print("Qual é a base do retângulo? ");
		double valorBase = leitor.nextDouble();
		
		Retangulo r1 = new Retangulo();
		
		r1.setBase(valorBase);
		r1.setAltura(valorAltura);
		r1.mostrarDados();
		
		Circunferencia c1 = new Circunferencia();
		
		c1.setRaio(25);
		c1.mostrarDados();
		
		Quadrado q1 = new Quadrado();
		
		q1.setLado(4);
		q1.mostrarDados();
		
		
		Triangulo t1 = new Triangulo();
		
		t1.setBase(2);
		t1.setAltura(4);
		t1.mostrarDados();
		
		Trapezio t2 = new Trapezio();
		
		t2.setBaseMenor(10);
		t2.setBaseMaior(5);
		t2.setAltura(8);
		t2.mostrarDados();
	}
}
