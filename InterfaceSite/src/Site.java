import java.util.ArrayList;

public class Site {
	
	private ArrayList<Pagina> paginas;
	
	public Site(){
		paginas = new ArrayList<>();
	}

	public void adicionar(Pagina cDoisPontos) {
		paginas.add(cDoisPontos);
		
	}
}
