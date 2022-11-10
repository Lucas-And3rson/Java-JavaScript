import java.util.ArrayList;

public class Pagina {
	
	private ArrayList<Desenhavel> desenhaveis;
	
	public Pagina(){
		desenhaveis = new ArrayList<>();
	}
	
	public void adicionar(Desenhavel desenhavel) {
		desenhaveis.add(desenhavel);
	}

	public void exibirTodosDesenhaveis() {
		for (Desenhavel desenhavel : desenhaveis) {
			desenhavel.exibirConteudo();
		}
		
	}
}
