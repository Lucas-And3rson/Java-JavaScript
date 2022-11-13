package horarioSingleton;

import horarioSingleton.horarioDeBrasilia;

public class horarioOficial {
	
	private horarioDeBrasilia horarioBrasilia;
	
	public horarioOficial (String horarioBrasilia) {
		this.horarioBrasilia = horarioDeBrasilia.getInstance(horarioBrasilia);
	}
	public String dizerHorario(){
		String dizer = "O hor�rio oficial � " + this.horarioBrasilia.gethorarioDeBrasilia() + ".";
		return dizer;
	}
	public void atualizarhorarioDeBrasilia(String horarioBrasiliaStr) {
		horarioBrasilia.sethorarioDeBrasilia(horarioBrasiliaStr);
	}
}
