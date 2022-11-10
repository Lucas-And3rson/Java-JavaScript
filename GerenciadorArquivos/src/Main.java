
public class Main {
	
	public static void main(String[] args) {
		Computador pc = new Computador();
		Particao cDoisPontos = new Particao();
		pc.adicionar(cDoisPontos);
		cDoisPontos.adicionar(new Imagem("img1"));
		cDoisPontos.adicionar(new Som("som1"));
		cDoisPontos.adicionar(new Video("video1"));
		Pasta p = new Pasta("pasta1");
		p.adicionar(new Imagem("img2"));
		p.adicionar(new Imagem("img3"));
		Compactado c = new Compactado("compactado1");
		c.adicionar(new Som("som2"));
		p.adicionar(c);
		cDoisPontos.adicionar(p);
		cDoisPontos.adicionar(new Compactado("compactado2"));
		cDoisPontos.exibirTodosArmazenaveis();
	}
}
