package view;

import java.util.Scanner;

import controller.controladora;
import view.interfaceIngles;
public class interfacePrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int opcao = 0;
		System.out.println("Escolha sua língua (choose your language): ");
		System.out.println("[1] - English");
		System.out.println("[2] - Português");
		opcao = in.nextInt();
		in.nextLine();
		
		switch (opcao) {
		case 1: {
			System.out.println("Enter your birth date (Month/Year): ");
			String dataNascimento = in.nextLine();
			System.out.println("Enter your login: ");
			String login= in.nextLine();
			System.out.println("Enter your password: ");
			String senha= in.nextLine();
			if (senha == dataNascimento) {
				System.out.println("Wrong login or password!");
			}else {
				System.out.println("Login sucessfully!");
			}
			
			break;
		}
		case 2: {
			System.out.println("Digite a sua data de nascimento (Mês/Ano): ");
			String dataNascimento = in.nextLine();
			System.out.println("Digite o seu login: ");
			String login = in.nextLine();
			System.out.println("Digite a sua senha: ");
			String senha= in.nextLine();
			if (senha == dataNascimento) {
				System.out.println("Login ou senha errada!");
			}else {
				System.out.println("Login realizado com sucesso!");
			}
			break;
		}
		
		}
	}

}
