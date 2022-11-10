package encapsulamento;

public class Paciente {
	private String nome;
	private String cpf;
	private int idade;
	private String endere�o;
	
	public Paciente (String nome, String cpf, int idade, String endere�o) {
		this.nome = nome;
		this.idade = idade;
		this.endere�o = endere�o;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
}
