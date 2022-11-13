package fabricaIngressosFM;
public class fabricaIngresso{

	public Ingresso criarIngresso(String tipoIngressso){
		
	if(!tipoIngresssoExistente(tipoIngressso)){
		return null;
	}
	if(tipoIngressso.equals("Popular")){
		return custoPopular();
	}else if(tipoIngressso.equals("Vip")){
		return custoVip();
	}else if(tipoIngressso.equals("Gold")){
		return custoGold();
	}
	return null;
}

private Ingresso custoGold() {
		return custoGold();
	}

private Ingresso custoVip() {
		return custoVip();
	}

private Ingresso custoPopular() {
		return custoPopular();
	}

private boolean tipoIngresssoExistente(String tipoIngressso){
	for (tipoIngresso ti : tipoIngresso.values()) {
		if(ti.toString().equals(tipoIngressso)){
			return true;
		}
	}
	return false;
}
}