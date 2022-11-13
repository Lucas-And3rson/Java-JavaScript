package fabricaIngressosFM;
import java.util.Scanner;

public class Main {


	public static void main(String[] args, String Custo) {
		Scanner in = new Scanner (System.in);
		do {
			System.out.println("Qual tipo de ingresso você deseja? ");
			System.out.println("- Popular");
			System.out.println("- Vip");
			System.out.println("- Gold");
			String tipoIngresso = in.nextLine();
			fabricaIngresso fabrica = new fabricaIngresso();
			Ingresso ingresso = fabrica.criarIngresso(tipoIngresso);
			if(ingresso == null) {
				System.out.println("Não temos esse ingresso!");
			}else {
				ingresso.imprimirIngresso();
			}
		}while(true);

	}

}
