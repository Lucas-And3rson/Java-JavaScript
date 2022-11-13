package horarioSingleton;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		ArrayList<horarioOficial> horario = new ArrayList<horarioOficial>();
		int opcao = 0;
		do {
			System.out.println("Escolha o que deseja fazer:");
			System.out.println("[1] - Adicionar horário de Brasília");
			System.out.println("[2] - Mostrar horário oficial do Brasil");
			System.out.println("[3] - Sair");
			System.out.print("Opção: ");
			opcao = in.nextInt();
			in.nextLine();
			
		switch (opcao) {
		case 1: {
			System.out.println("Qual o Horário  de Brasília?");
			String horarioDeBrasilia = in.nextLine();
			horarioOficial horarioOficial = new horarioOficial(horarioDeBrasilia);
			horario.add(horarioOficial);
			break;
		}
		case 2: {
			for (horarioOficial horarioOficial : horario){
				System.out.println(horarioOficial.dizerHorario());
			}
			break;
		}
		}
		}while(opcao != 3);
		in.close();
	}
}
