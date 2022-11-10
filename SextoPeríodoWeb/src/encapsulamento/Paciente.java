package encapsulamento;

public class Paciente {
	private String nome;
	private String cpf;
	private int idade;
	private String endereço;
	
	public Paciente (String nome, String cpf, int idade, String endereço) {
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	
}
