
public abstract class Carro {
		
		protected String modelo;
		protected String versao;
		protected String cor;
		
		public void imprimirDocumento(){
			System.out.println("=== Documento ===");
			System.out.println("");
			System.out.println("x-----------------x");
			System.out.println("|Modelo: " + this.modelo );
			System.out.println("|Versão: " + this.versao);
			System.out.println("|Cor: " + this.cor);
			System.out.println("x-----------------x");
			System.out.print("Está pronto o seu documento!");
			System.out.println("");
		}
}
