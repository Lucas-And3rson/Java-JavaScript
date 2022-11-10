import java.util.ArrayList;

public class ParesIterator implements Iterator{
	
	private ArrayList<Numero> numerosPares;
	private int indexNumerosPares;
	
	public ParesIterator(ArrayList<Numero> ListaNumeros) {
		ArrayList<Numero> todosNumeros = ListaNumeros;
	
		numerosPares = new ArrayList<>();
		separarNumeros(todosNumeros);
		indexNumerosPares = 0;
	}

	@Override
	public Numero next() {
		Numero n = null;
		if(hasNextPares()){
			n = numerosPares.get(indexNumerosPares);
			indexNumerosPares++;
		}
		return n;
	}
	
	private boolean hasNextPares(){
		if(numerosPares.size() == 0){
			return false;
		}
		if(indexNumerosPares >= numerosPares.size()){
			return false;
		}
		return true;
	}

	@Override
	public boolean hasNext() {
		if(hasNextPares()){
			return true;
		}
		return false;
	}
	
	private void separarNumeros(ArrayList<Numero> todosNumeros) {
		for (Numero numero : todosNumeros) {
			if(numero.isPar()){
				numerosPares.add(numero);
			}
			}
		
	}

}
