
public class Main {
	
	public static void main(String[] args) {
		Site st = new Site();
		Pagina cDoisPontos = new Pagina();
		st.adicionar(cDoisPontos);
		cDoisPontos.adicionar(new Figura("fig1"));
		cDoisPontos.adicionar(new Texto("txt1"));
		cDoisPontos.adicionar(new FragmentoTexto("ftxt1"));
		cDoisPontos.exibirTodosDesenhaveis();
	}
}
