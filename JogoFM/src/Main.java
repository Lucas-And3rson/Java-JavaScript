import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		do {
			System.out.println("Digite a classe de campeão: ");
			String ClassesCampeoes = in.nextLine();
			System.out.println("Digite o estilo: ");
			String Estilo = in.nextLine();
			System.out.println("Digite o ataque: ");
			String Ataque = in.nextLine();
			FabricaPersonFM fabrica = new FabricaPersonFM();
			Personagem personagem = fabrica.criarPersonagem(ClassesCampeoes, Estilo, Ataque);
			if(personagem == null) {
				System.out.println("Não temos esse personagem!");
			}else {
				personagem.imprimirPersonagem();
			}
		}while(true);

	}

}
