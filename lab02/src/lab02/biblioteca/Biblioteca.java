package biblioteca;

import java.util.ArrayList;

import pessoas.*;

public class Biblioteca {
	private final String nome; //nome da biblioteca
	
	private Estante[] estantes;
	//variaveis de controle para gerar o tombo automaticamente:
	private int numArtigos, numDissertacoes, numLivros, numPeriodicos, numTCCs, numTeses;
	
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Funcionario> funcionarios;
    
    // Construtor
    public Biblioteca(String nome, int numEstantes) {
    	this.nome = nome;
        
    	estantes = new Estante[numEstantes];
    	for (int i=0; i<numEstantes; i++) {
    		estantes[i] = new Estante();
    	}
    	
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    //Getters & Setters
    public String getNome() {
    	return this.nome;
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

    public int getNumArtigos() {
        return numArtigos;
    }

    public void setNumArtigos(int numArtigos) {
        this.numArtigos = numArtigos;
    }

    public int getNumDissertacoes() {
        return numDissertacoes;
    }

    public void setNumDissertacoes(int numDissertacoes) {
        this.numDissertacoes = numDissertacoes;
    }

    public int getNumLivros() {
        return numLivros;
    }

    public void setNumLivros(int numLivros) {
        this.numLivros = numLivros;
    }

    public int getNumPeriodicos() {
        return numPeriodicos;
    }

    public void setNumPeriodicos(int numPeriodicos) {
        this.numPeriodicos = numPeriodicos;
    }

    public int getNumTCCs() {
        return numTCCs;
    }

    public void setNumTCCs(int numTCCs) {
        this.numTCCs = numTCCs;
    }

    public int getNumTeses() {
        return numTeses;
    }

    public void setNumTeses(int numTeses) {
        this.numTeses = numTeses;
    }
}