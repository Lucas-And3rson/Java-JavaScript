import java.util.ArrayList;

public class SequencialIterator implements Iterator{
	
	private ArrayList<Numero> listaNumeros;
	private int index;
	
	public SequencialIterator(ArrayList<Numero> listaNumeros) {
		this.listaNumeros = listaNumeros;
		index = 0;
	}

	@Override
	public Numero next() {
		Numero n = this.listaNumeros.get(index);
		index++;
		return n;
	}

	@Override
	public boolean hasNext() {
		if(listaNumeros.size() == 0){
			return false;
		}
		if(index >= listaNumeros.size()){
			return false;
		}
		return true;
	}

}
