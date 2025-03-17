package br.sp.senai.jandira.calcular_formas.model;

public class Triangulo {
	
	private double base;
	private double altura;

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double area = base * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		double area = calcularArea();

		System.out.println("=====================");
		System.out.println("Triângulo");
		System.out.println("---------------------");
		System.out.printf("Base: %s \n", base);
		System.out.printf("Altura: %s \n", altura);
		System.out.printf("Área: %s \n", area);
	}
}
