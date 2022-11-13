package fabricaIngressosFM;

public class Vip extends Ingresso {
	private String custo = "R$50";
	public Vip(String tipoIngresso, String custo) {
		this.tipoIngresso = ("Vip");
		this.custo = custo;
	}
	public String getCusto() {
		return custo;
	}
	public void setCusto(String custo) {
		this.custo = custo;
	}
}
