
public abstract class NaoComposto implements Desenhavel{
	
	protected String fragmento;
	
	public NaoComposto(String fragmento) {
		this.fragmento = fragmento;
	}
	
	@Override
	public void exibirConteudo() {
		System.out.println(this.fragmento);
	}
}
