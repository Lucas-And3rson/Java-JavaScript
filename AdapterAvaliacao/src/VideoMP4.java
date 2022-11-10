
public class VideoMP4 {
	private String dados;
	private int tamanho; 	 	
	public VideoMP4(String dados) { 	
		this.setDados(dados);
	tamanho = dados.length();
	} 	
	public String getDados() { 		
	return dados;
	} 	
	public void setDados(String dados) { 	
		this.dados = dados;
	} 	
	public int getTamanho() { 		
	return tamanho; 	
	} 	
}
