import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("--------- DOCUMENTA��O DO SEU CARRO ----------");
			System.out.println("");
			System.out.println("x----------------------------------------------x");
			System.out.println("|-> Modelos: Cruze, Onix                       |");
			System.out.println("|-> Vers�es: LT, LTS, PLUS                     |");
			System.out.println("|-> Cores: Preto, Prata, Branco, Vermelho, Azul|");
			System.out.println("x----------------------------------------------x");
			System.out.println("");
			
			System.out.print("Digite o modelo: ");
			String modelo = in.nextLine();
			System.out.print("Digite a vers�o: ");
			String versao = in.nextLine();
			System.out.print("Digite a cor: ");
			String cor = in.nextLine();
			FabricaDeCarro fabrica = new FabricaDeCarro(); 
			Carro carro = fabrica.criarCarro(modelo, versao, cor);
			if(carro == null){
				System.out.println("Esse carro n�o � fabricado");
			}else{
				carro.imprimirDocumento();				
			}
			
		}while(true);
		

	}
}
