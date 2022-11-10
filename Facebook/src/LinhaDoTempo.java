import java.util.ArrayList;

public class LinhaDoTempo {
	
	private ArrayList<Postagem> postagens;
	
	public LinhaDoTempo() {
		setPostagens(new ArrayList<Postagem>());
	}

	public ArrayList<Postagem> getPostagens(){
		return postagens;
	}
	
	public void setPostagens(ArrayList<Postagem> postagens) {
		this.postagens = postagens;
	}
}
