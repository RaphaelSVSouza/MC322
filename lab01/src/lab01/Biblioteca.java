package lab01;

import java.util.ArrayList;

public class Biblioteca {
	private Livro[] livros;
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    // Construtor
    public Biblioteca(int max_livros) {
        this.livros = new Livro[max_livros];
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.funcionarios = new ArrayList<Funcionario>();
    }
}