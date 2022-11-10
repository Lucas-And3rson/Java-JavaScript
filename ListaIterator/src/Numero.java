
public class Numero {
	
	private int numero;
	private boolean par;
	public Numero(int numero){
		this.numero = numero;
		this.par = false;
	}
	
	public Numero(int numero, boolean par){
		this.numero = numero;
		this.par = par;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString(){
		if(par){
			return "Número " + numero + " (PAR)";
		}else {
			return "Número " + numero + " (IMPAR)";
		}
		}

	public boolean isPar() {
		return par;
	}
	
	public void setPar(boolean par) {
		this.par = par;
	}
}
