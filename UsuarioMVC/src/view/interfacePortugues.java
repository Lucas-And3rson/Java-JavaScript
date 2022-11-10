package view;

import java.util.Scanner;

public class interfacePortugues {
	
	public void imprimirPortugues() {
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a sua data de nascimento (Mês/Ano): ");
		String dataNascimento = in.nextLine();
		System.out.println("Digite o seu login: ");
		String login= in.nextLine();
		System.out.println("Digite a sua senha: ");
		String senha= in.nextLine();
	}
}
