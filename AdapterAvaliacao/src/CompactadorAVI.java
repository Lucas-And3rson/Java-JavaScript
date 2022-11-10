
public class CompactadorAVI {
	private VideoAVI video;

	public CompactadorAVI(VideoAVI video) { 		
		this.video = video;
}
	public VideoAVI compactarVideo() { 		
		String dados = video.getDados();
		dados = dados.substring(0, dados.length() / 2); 		
		return new VideoAVI(dados);
		}
}
