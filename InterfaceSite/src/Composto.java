import java.util.ArrayList;

public abstract class Composto implements Desenhavel{
	
	protected ArrayList<Desenhavel> desenhaveis;	
	protected String fragmento;
	
	public Composto(String fragmento){
		desenhaveis = new ArrayList<>();
		this.fragmento = fragmento;
	}
	
	public void adicionar(Desenhavel desenhavel) {
		desenhaveis.add(desenhavel);
	}
	
	@Override
	public void exibirConteudo() {
		System.out.println(fragmento);
		for (Desenhavel desenhavel : desenhaveis) {
			desenhavel.exibirConteudo();
		}
	}
}
