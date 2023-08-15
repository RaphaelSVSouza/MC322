package lab01;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca(100);

        Livro livro1 = new Livro("Livro", "ROM", "9788574803999",
                "Dom Casmurro", "Machado de Assis", 2023, 2, "Principis",
                400, 10, 0, false);


		Pessoa marcos = new Pessoa("Marcos", 51234714809L);
		Professor prof1 = new Professor(marcos.getNome(), marcos.getCPF(), 123456, "IC");
		
		Pessoa leticia = new Pessoa("Leticia", 32992907898L);
		Aluno aluno1 = new Aluno(leticia.getNome(), leticia.getCPF(), 254175, "IFGW", false, 0, "Graduação");

		Pessoa luciano = new Pessoa("Luciano", 93297242809L);
		Funcionario func1 = new Funcionario(luciano.getNome(), luciano.getCPF(), "gerente");
	}

}