package br.sp.senai.jandira.calcular_formas.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio*raio);
		return area;
	}
	
	public void mostrarDados() {
		double area = calcularArea();
		System.out.println("=====================");
		System.out.println("Circunferência");
		System.out.println("---------------------");
		System.out.printf("Área: %s \n", area);
	}
}
