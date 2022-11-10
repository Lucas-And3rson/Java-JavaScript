import java.util.ArrayList;

public abstract class Composto implements Armazenavel{
	
	protected ArrayList<Armazenavel> armazenaveis;	
	protected String nomeArquivo;
	
	public Composto(String nomeArquivo){
		armazenaveis = new ArrayList<>();
		this.nomeArquivo = nomeArquivo;
	}
	
	public void adicionar(Armazenavel armazenavel) {
		armazenaveis.add(armazenavel);
	}
	
	@Override
	public void exibirConteudo() {
		System.out.println(nomeArquivo);
		for (Armazenavel armazenavel : armazenaveis) {
			armazenavel.exibirConteudo();
		}
	}
}
