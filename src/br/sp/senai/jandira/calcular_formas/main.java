package br.sp.senai.jandira.calcular_formas;

import br.sp.senai.jandira.calcular_formas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formas.model.Quadrado;
import br.sp.senai.jandira.calcular_formas.model.Retangulo;
import br.sp.senai.jandira.calcular_formas.model.Trapezio;
import br.sp.senai.jandira.calcular_formas.model.Triangulo;

public class main {
	
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		
		r1.setBase(14);
		r1.setAltura(13);
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
