package br.sp.senai.jandira.calcular_formas;

import br.sp.senai.jandira.calcular_formas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formas.model.Retangulo;

public class main {
	
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		
		r1.setBase(14);
		r1.setAltura(13);
		r1.mostrarDados();
		
		Circunferencia c1 = new Circunferencia();
		
		c1.setRaio(25);
		c1.mostrarDados();
	}
}
