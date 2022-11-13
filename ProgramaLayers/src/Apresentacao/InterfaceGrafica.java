package Apresentacao;

import java.util.Scanner;

public class InterfaceGrafica {
	
	private int opcao;
	private Scanner in;
	
	public InterfaceGrafica() {
		this.in = new Scanner(System.in);
		this.opcao = 0;
	}
	
	public void Menu() {
		System.out.println("Escoha uma das opções abaixo:");
		System.out.println("1 - Visualizar alunos");
		System.out.println("2 - Armazenar um novo aluno");
		System.out.println("3 - Enviar SMS");
		System.out.println("4 - Sair");
		System.out.print("Opção: ");

	}
	
	public int getOpcao(){
		opcao = this.in.nextInt();
		in.close();
		return opcao;
	}
}
