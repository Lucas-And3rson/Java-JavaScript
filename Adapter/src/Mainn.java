
public class Mainn {

	public static void mainn(String[] args) { 	
		
		VideoMP4 videoMP4 = new VideoMP4("a1ve5x14af7c2%2@1fv1"); 
		System.out.println("O vídeo MP4 antes da conversão possui tamanho " + videoMP4.getTamanho() + " MB"); 	
		CompactadorMP4 compactadorMP4 = new CompactadorMP4(videoMP4); 	
		videoMP4 = compactadorMP4.compactarVideo(); 
		System.out.println("O vídeo MP4 depois da conversão possui tamanho " + videoMP4.getTamanho() + " MB"); 
		
		VideoAVI videoAVI = new VideoAVI("8a1va$5asdf2F*43!f]%2@1fv1"); 
		System.out.println("O vídeo AVI antes da conversão possui tamanho " + videoAVI.getTamanho() + " MB"); 
		CompactadorAVI compactadorAVI = new CompactadorAVI(videoAVI); 	
		videoAVI = compactadorAVI.compactarVideo(); 
		System.out.println("O vídeo AVI depois da conversão possui tamanho " + videoAVI.getTamanho() + " MB"); 

		}
	
}
