import java.util.ArrayList;

public abstract class Composta {
	private ArrayList<Interacao> interacoes;
	
	public Composta() {
		setInteracoes(new ArrayList<Interacao>());
	}

	public ArrayList<Interacao> getInteracoes(){
		return interacoes;
	}
	
public void setInteracoes(ArrayList<Interacao> interacoes) {
		this.interacoes = interacoes;
	}
}
