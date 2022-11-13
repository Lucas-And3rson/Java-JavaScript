package view;

import java.util.Scanner;

import controller.controladora;

public class interfaceTexto {
	
	private static Scanner in;
	
	public static void main (String[] args) {
		in = new Scanner(System.in);
		int opcao;
			
		do {
			imprimirTelaOpcoes();
			opcao = getOpcao();
			switch (opcao) {
			case 1:
				somar();
				break;
				
			case 2:
				subtrair();
				break;
			
			case 3:
				multiplicar();
				break;
				
			case 4:
				dividir();
				break;
				
				default:
					break;
			}
		}while(opcao != 5);
		in.close();
	}

	private static void dividir() {
		controladora controladora = new controladora();
		int n1, n2;
		System.out.println("primeiro número: ");
		n1 = in.nextInt();
		System.out.println("Segundo número: ");
		n2 = in.nextInt();
		double resultado = controladora.dividir(n1,n2);
		System.out.println("A divisão de " + n1 + " e " + n2 + " é " + resultado);
		
	}

	private static void multiplicar() {
		controladora controladora = new controladora();
		int n1, n2;
		System.out.println("primeiro número: ");
		n1 = in.nextInt();
		System.out.println("Segundo número: ");
		n2 = in.nextInt();
		double resultado = controladora.multiplicar(n1,n2);
		System.out.println("A multiplicação de " + n1 + " e " + n2 + " é " + resultado);
		
	}

	private static void subtrair() {
		controladora controladora = new controladora();
		int n1, n2;
		System.out.println("primeiro número: ");
		n1 = in.nextInt();
		System.out.println("Segundo número: ");
		n2 = in.nextInt();
		double resultado = controladora.subtrair(n1,n2);
		System.out.println("A subtração de " + n1 + " e " + n2 + " é " + resultado);
		
	}

	private static void somar() {
		controladora controladora = new controladora();
		int n1, n2;
		System.out.println("primeiro número: ");
		n1 = in.nextInt();
		System.out.println("Segundo número: ");
		n2 = in.nextInt();
		double resultado = controladora.somar(n1,n2);
		System.out.println("A soma de " + n1 + " e " + n2 + " é " + resultado);
		
	}


	private static void imprimirTelaOpcoes() {
		System.out.println("------Escolha uma operação------");
		System.out.println("[1] - Somar");
		System.out.println("[2] - Subtrair");
		System.out.println("[3] - Multiplicar");
		System.out.println("[4] - Dividir");
		System.out.println("[5] - Sair");
		System.out.println("Opção: ");
		
	}
	
    private static int getOpcao() {
		
		int opcao = in.nextInt();
		return opcao;
	}

}
