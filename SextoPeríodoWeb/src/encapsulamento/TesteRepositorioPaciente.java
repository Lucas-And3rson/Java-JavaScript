package encapsulamento;

public class TesteRepositorioPaciente {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Lucas", "123.432.567-23", 40, "Av. Joao Campus");
		Paciente p2 = new Paciente("Anderson", "323.432.567-23", 20, "Rua do melão");
		Paciente p3 = new Paciente("Alves", "333.432.567-23", 30, "Rua da melancia");
		
		PacienteRepositorio rp = new PacienteRepositorio();
		System.out.println(rp.inserir(p1, true));
		System.out.println(rp.inserir(p2, true));
		System.out.println(rp.inserir(p3, true));
		
		Paciente teste = rp.procurar("123.432.567-23");
		System.out.println(teste.getCpf());
		System.out.println(teste.getEndereço());
		System.out.println(teste.getIdade());
		System.out.println(teste.getNome());
		System.out.println(rp.inserir(p1, true));
		
		System.out.println();
		
		Paciente teste1 = rp.procurar("323.432.567-23");
		System.out.println(teste1.getCpf());
		System.out.println(teste1.getEndereço());
		System.out.println(teste1.getIdade());
		System.out.println(teste1.getNome());
		System.out.println(rp.inserir(p2, true));
		
		//a mesma coisa com o terceiro paciente!
	}
}
