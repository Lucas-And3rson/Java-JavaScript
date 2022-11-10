import java.util.ArrayList;

public class ListaNumeros implements Collection{
	
	private ArrayList<Numero> listaDeNumeros;
	
	public ListaNumeros(){
		listaDeNumeros = new ArrayList<>();
	}
	
	public void addNumero(Numero n){
		this.listaDeNumeros.add(n);
	}

	public Numero getNumero(int index){
		return listaDeNumeros.get(index);
	}
	
	public ArrayList<Numero> getListaNumeros(){
		return this.listaDeNumeros;
	}
	
	public Iterator getIterator(int tipo){
		if(tipo == 0){
			return new ImparesIterator(listaDeNumeros);
		}else if(tipo == 1){
			return new ParesIterator(listaDeNumeros);
		}
		return new SequencialIterator(listaDeNumeros);		
	}
	

}

