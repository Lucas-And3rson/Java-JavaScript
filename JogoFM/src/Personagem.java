
public abstract class Personagem {
	
	 protected String ClassesCampeoes;
	 protected String Estilo;
	 protected String Ataque;
	 
	 public void imprimirPersonagem(){
		 System.out.println("---Personagem---");
		 System.out.println("Classe do Campeão: " + this.ClassesCampeoes);
		 System.out.println("Estilo: " + this.Estilo);
		 System.out.println("Ataque: " + this.Ataque);
		 System.out.println("---Personagem---");
	 }

}
