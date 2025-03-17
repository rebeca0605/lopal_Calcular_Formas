package br.sp.senai.jandira.calcular_formas.model;

public class Trapezio {
	
	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double area = (baseMenor + baseMaior) * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		double area = Math.round(calcularArea());

		System.out.println("=====================");
		System.out.println("Trapézio");
		System.out.println("---------------------");
		System.out.printf("Base Menor: %s \n", baseMenor);
		System.out.printf("Base Maior: %s \n", baseMaior);
		System.out.printf("Altura: %s \n", altura);
		System.out.printf("Área: %s \n", area);
		
	}

}
