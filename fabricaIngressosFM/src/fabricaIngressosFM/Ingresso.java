package fabricaIngressosFM;

public abstract class Ingresso {
	
	protected String tipoIngresso;
	protected String Custo;
	
	 public void imprimirIngresso(){
		 System.out.println("---INGRESSO---");;
		 System.out.println("Valor do ingresso " + this.tipoIngresso + " �: " + this.Custo);
		 System.out.println("-------------");}

}
