
public class CompactadorMP4 { 	

	private VideoMP4 video;

	public CompactadorMP4(VideoMP4 video) { 		
		this.video = video;
}
	public VideoMP4 compactarVideo() { 		
		String dados = video.getDados();
		dados = dados.substring(0, dados.length() / 2); 		
		return new VideoMP4(dados);
		}
}
