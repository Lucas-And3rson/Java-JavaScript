
public class FabricaDeCarro {
	
	public Carro criarCarro(String modelo, String versao, String cor){
		
		if(!modeloExistente(modelo)){
			return null;
		}
		
		if(!versaoExistente(versao)){
			return null;
		}
		
		if(!corExistente(cor)){
			return null;
		}
		
		if(modelo.equals("Cruze")){
			return new Cruze(versao, cor);
		}
		
		return new Onix(versao, cor);	
	}

	private boolean modeloExistente(String modelo) {
		for (Modelo m : Modelo.values()) {
			if(m.toString().equals(modelo)){
				return true;
			}
		}
		return false;
	}
	
	private boolean versaoExistente(String versao) {
		for (Versao v : Versao.values()) {
			if(v.toString().equals(versao)){
				return true;
			}
		}
		return false;
	}

	private boolean corExistente(String cor) {
		for (Cor c : Cor.values()) {
			if(c.toString().equals(cor)){
				return true;
			}
		}
		return false;
	}

}
