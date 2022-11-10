import java.util.ArrayList;

public class Postagem {
	private ArrayList<Interacao> interacoes;
	
	public Postagem() {
		setInteracoes(new ArrayList<Interacao>());
	}
	
	public ArrayList<Interacao> getInteracoes(){
		return interacoes;
	}
	
	public void setInteracoes(ArrayList<Interacao> interacoes) {
		this.interacoes = interacoes;
	}
}
