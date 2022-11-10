package view;

import java.util.Scanner;

public class interfaceIngles {
	
	public void imprimirIngles() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your birth date (Month/Year): ");
		String dataNascimento = in.nextLine();
		System.out.println("Enter your login: ");
		String login= in.nextLine();
		System.out.println("Enter your password: ");
		String senha= in.nextLine();
	}
}
