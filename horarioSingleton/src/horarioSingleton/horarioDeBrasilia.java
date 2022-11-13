package horarioSingleton;

public class horarioDeBrasilia {
	
	private String mensagem;
	private static horarioDeBrasilia instanciaUnica = null;
	
	private horarioDeBrasilia(String mensagem) {
		this.mensagem = mensagem;
	}
	public synchronized static horarioDeBrasilia getInstance(String mensagem) {
		if(instanciaUnica == null) {
			instanciaUnica = new horarioDeBrasilia(mensagem);
		}
		return instanciaUnica;
	}
	public String gethorarioDeBrasilia() {
		return mensagem;
	}
	public void sethorarioDeBrasilia(String mensagem) {
		 this.mensagem = mensagem;
	}
}
