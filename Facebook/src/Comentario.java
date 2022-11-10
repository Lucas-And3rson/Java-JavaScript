
public class Comentario extends Composta{
	private String mensagem;
	
	public Comentario(String comentario) {
		super();
		mensagem = comentario;
	}
	
	public String getMensagem() {
		return mensagem;
	}
}
