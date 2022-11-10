package encapsulamento;

import java.util.ArrayList;
import java.util.Iterator;

public class PacienteRepositorio {
	private ArrayList<Paciente> repositorioPacientes;
	
	public PacienteRepositorio() {
		this.repositorioPacientes = new ArrayList<Paciente>();
	}
	
	public Paciente procurar(String cpf) {
		Iterator<Paciente> iter = this.repositorioPacientes.iterator();
		while(iter.hasNext()) {
			Paciente p = iter.next();
			if(p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	public boolean inserir(Paciente paciente, boolean prucurar) {
		if(prucurar) {
			if(procurar(paciente.getCpf()) != null) {
				return false;
			}
		}
		this.repositorioPacientes.add(paciente);
		return true;
	}
	
	public boolean remover(String cpf) {
		Iterator<Paciente> iter = this.repositorioPacientes.iterator();
		
		while (iter.hasNext()) {
			Paciente p = iter.next();
			if(p.getCpf().equals(cpf)) {
				iter.remove();
				return true;
			}
		}
		return false;
	}
	
	public void alterar(Paciente paciente) {
		if(procurar(paciente.getCpf()) != null) {
			remover(paciente.getCpf());
			inserir(paciente, false);
		}
	}
}
