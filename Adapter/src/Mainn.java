
public class Mainn {

	public static void mainn(String[] args) { 	
		
		VideoMP4 videoMP4 = new VideoMP4("a1ve5x14af7c2%2@1fv1"); 
		System.out.println("O v�deo MP4 antes da convers�o possui tamanho " + videoMP4.getTamanho() + " MB"); 	
		CompactadorMP4 compactadorMP4 = new CompactadorMP4(videoMP4); 	
		videoMP4 = compactadorMP4.compactarVideo(); 
		System.out.println("O v�deo MP4 depois da convers�o possui tamanho " + videoMP4.getTamanho() + " MB"); 
		
		VideoAVI videoAVI = new VideoAVI("8a1va$5asdf2F*43!f]%2@1fv1"); 
		System.out.println("O v�deo AVI antes da convers�o possui tamanho " + videoAVI.getTamanho() + " MB"); 
		CompactadorAVI compactadorAVI = new CompactadorAVI(videoAVI); 	
		videoAVI = compactadorAVI.compactarVideo(); 
		System.out.println("O v�deo AVI depois da convers�o possui tamanho " + videoAVI.getTamanho() + " MB"); 

		}
	
}
