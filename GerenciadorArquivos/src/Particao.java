import java.util.ArrayList;

public class Particao {
	
	private ArrayList<Armazenavel> armazenaveis;
	
	public Particao(){
		armazenaveis = new ArrayList<>();
	}
	
	public void adicionar(Armazenavel armazenavel) {
		armazenaveis.add(armazenavel);
	}

	public void exibirTodosArmazenaveis() {
		for (Armazenavel armazenavel : armazenaveis) {
			armazenavel.exibirConteudo();
		}
		
	}
}
