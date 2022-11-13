public class FabricaPersonFM {	
	
	public Personagem criarPersonagem(String classesCampeoes, String estilo, String ataque){
		if(!classesCampeoesExistente(classesCampeoes)){
			return null;
		}
		if(!estiloExistente(estilo)){
			return null;
		}
		if(!ataqueExistente(ataque)){
			return null;
		}
		if(classesCampeoes.equals("Scorpion")){
			return new Scorpion(estilo, ataque);
		}else if(classesCampeoes.equals("Subzero")){
			return new Subzero(estilo, ataque);
		}else if(classesCampeoes.equals("Mileena")) {
			return new Mileena(estilo, ataque);
		}
		return new NoobSaibot(estilo, ataque);
	}

	private boolean classesCampeoesExistente(String classesCampeoes) {
		for (ClassesCampeoes cc : ClassesCampeoes.values()) {
			if(cc.toString().equals(classesCampeoes)){
				return true;
			}
		}
		return false;
	}
	
	private boolean estiloExistente(String estilo) {
		for (Estilo e : Estilo.values()) {
			if(e.toString().equals(estilo)){
				return true;
			}
		}
		return false;
	}
	private boolean ataqueExistente(String ataque) {
		for (Ataque a : Ataque.values()) {
			if(a.toString().equals(ataque)){
				return true;
			}
		}
		return false;
	}
}