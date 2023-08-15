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

    public Livro[] getLivros() {
        return this.livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}