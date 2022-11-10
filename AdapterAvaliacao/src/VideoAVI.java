
public class VideoAVI {
	private String dados;
	//Simula os bits do vídeo 	
	private int tamanho;
	public VideoAVI(String dados) { 	
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
