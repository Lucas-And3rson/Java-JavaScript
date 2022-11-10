
public abstract class NaoComposto implements Armazenavel {
	
	protected String nomeArquivo;
	
	public NaoComposto(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void exibirConteudo() {
		System.out.println(this.nomeArquivo);
	}
}
