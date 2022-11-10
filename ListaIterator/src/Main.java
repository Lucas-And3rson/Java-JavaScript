
public class Main {

	public static void main(String[] args) {
		
		ListaNumeros lista = new ListaNumeros();
		int numero = 1;
	
		lista.addNumero(new Numero(numero));
		numero++;
		lista.addNumero(new Numero(numero, true));
		numero++;
		lista.addNumero(new Numero(numero));
		numero++;
		lista.addNumero(new Numero(numero, true));
		numero++;
		lista.addNumero(new Numero(numero));
		numero++;
		lista.addNumero(new Numero(numero, true));
		numero++;
		lista.addNumero(new Numero(numero));
		numero++;
		lista.addNumero(new Numero(numero, true));
		numero++;
		lista.addNumero(new Numero(numero));
		numero++;
		lista.addNumero(new Numero(numero, true));
		
		System.out.println("<<<Lista dos números impares>>>");
		Iterator i = lista.getIterator(0);
		while(i.hasNext()){
			Numero n = i.next();
			System.out.println(n.toString());
		}
		
		System.out.println("<<<Lista dos números pares>>>");
		i = lista.getIterator(1);
		while(i.hasNext()){
			Numero n = i.next();
			System.out.println(n.toString());
		}
		
		System.out.println("<<<Sequencia da lista>>>");
		i = lista.getIterator(2);
		while(i.hasNext()){
			Numero c = i.next();
			System.out.println(c.toString());
		}
	}

}
