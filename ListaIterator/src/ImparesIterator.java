import java.util.ArrayList;

public class ImparesIterator implements Iterator{
	
	private ArrayList<Numero> numerosImpares;
	private int indexNumerosImpares;
	
	public ImparesIterator(ArrayList<Numero> ListaNumeros) {
		ArrayList<Numero> todosNumeros = ListaNumeros;
		numerosImpares = new ArrayList<>();
		separarNumeros(todosNumeros);
		indexNumerosImpares = 0;
	}

	@Override
	public Numero next() {
		Numero n = null;
		if(hasNextImpares()){
			n = numerosImpares.get(indexNumerosImpares);
			indexNumerosImpares++;
		}
		return n;
	}
	
	private boolean hasNextImpares(){
		if(numerosImpares.size() == 0){
			return false;
		}
		if(indexNumerosImpares >= numerosImpares.size()){
			return false;
		}
		return true;
	}

	@Override
	public boolean hasNext() {
		if(hasNextImpares()){
			return true;
		}
		return false;
	}
	
	private void separarNumeros(ArrayList<Numero> todosNumeros) {
		for (Numero numero : todosNumeros) {
			
			if(numero.isPar()){
				
			}else{
				numerosImpares.add(numero);
			}
			}
	}

}