import java.util.ArrayList;

public class Computador {
	
	private ArrayList<Particao> particoes;
	
	public Computador(){
		particoes = new ArrayList<>();
	}

	public void adicionar(Particao cDoisPontos) {
		particoes.add(cDoisPontos);
		
	}
}
