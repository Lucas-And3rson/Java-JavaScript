package controller;

import model.Calculadora;

public class controladora {
	
	private Calculadora c;
	
	public controladora() {
		this.c = new Calculadora();
	}
	public double somar(int n1, int n2) {
		double resultado = c.somar(n1, n2);
		return resultado;
	}
	public double subtrair(int n1, int n2) {
		double resultado = c.subtrair(n1, n2);
		return resultado;
	}
	public double multiplicar(int n1, int n2) {
		double resultado = c.multiplicar(n1, n2);
		return resultado;
	}
	public double dividir(int n1, int n2) {
		double resultado = c.dividir(n1, n2);
		return resultado;
	}

}
