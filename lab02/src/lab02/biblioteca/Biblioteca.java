package biblioteca;

import java.util.ArrayList;

import obras.*;
import pessoas.*;

public class Biblioteca {
	private Obra[] obras;
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    // Construtor
    public Biblioteca(int max_obras) {
        this.obras = new Livro[max_obras];
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    //Getters & Setters
    public Obra[] getObras() {
        return this.obras;
    }

    public void setLivros(Obra[] obras) {
        this.obras = obras;
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