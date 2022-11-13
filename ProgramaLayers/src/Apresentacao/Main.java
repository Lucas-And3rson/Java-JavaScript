package Apresentacao;

public class Main {
	
	private static InterfaceGrafica ig;

	public static void main(String[] args) {
		int opcao = 0;
		ig = new InterfaceGrafica();
		do {
			ig.Menu();
			opcao = ig.getOpcao();
			executarOpcao(opcao);
		}while (opcao != 4);
			System.out.println("FIM");


	}
	private static void executarOpcao(int opcao) {
		switch(opcao) {

		case 1:
			System.out.println("Lucas");
			System.out.println("João");
			System.out.println("Ana");
			System.out.println("Carlos");
			System.out.println("Ester");
			break;
		case 2:
			System.out.println("Digite aqui o nome do novo aluno:");
			
			break;
		case 3:
			System.out.println("Digite o email do aluno que deseja enviar um SMS");
			System.out.print("Email: ");
			
			break;
		case 4:
			System.out.println("Deseja mesmo sair?");
			
			break;
		}
	}

}
