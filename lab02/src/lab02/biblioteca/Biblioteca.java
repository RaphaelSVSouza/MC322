package biblioteca;

import java.util.ArrayList;

import biblioteca.sistema.Emprestimo;
import biblioteca.sistema.Relatorio;
import obras.Obra;
import pessoas.Funcionario;
import pessoas.Membros.Aluno;
import pessoas.Membros.Professor;
import pessoas.Membros.Membros;

public class Biblioteca {
	private final String nome; //nome da biblioteca
	private Estante[] estantes;
	private Relatorio relatorio;

    
    // Construtor
    public Biblioteca(String nome, int numEstantes) {
    	this.nome = nome;
    	
    	//relação de composição entre Biblioteca e Relatorio
    	relatorio = new Relatorio(); 
        
    	//relação de composição entre Biblioteca e Estante
    	estantes = new Estante[numEstantes];
    	for (int i=0; i<numEstantes; i++) {
    		estantes[i] = new Estante();
    	}
    }

    //Getters & Setters
    public String getNome() {
    	return this.nome;
    }

    public int getNumArtigos() {
        return relatorio.getNumArtigos();
    }

    public int getNumDissertacoes() {
        return relatorio.getNumDissertacoes();
    }

    public int getNumLivros() {
        return relatorio.getNumLivros();
    }

    public int getNumPeriodicos() {
        return relatorio.getNumPeriodicos();
    }

    public int getNumTCCs() {
        return relatorio.getNumTCCs();
    }

    public int getNumTeses() {
        return relatorio.getNumTeses();
    }

    public ArrayList<Professor> getProfessores() {
        return relatorio.getProfessores();
    }

    public ArrayList<Aluno> getAlunos() {
        return relatorio.getAlunos();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return relatorio.getFuncionarios();
    }
    

  	//Outros métodos     
    public void addObra(Obra obra) { // Adiciona uma obra a biblioteca
        relatorio.obraAdicionada(obra);
    }

    public void emprestar(Obra obra, Membros membros) { // Empresta uma obra a uma pessoa com a data a ser devolvida
        relatorio.realizarEmprestimo(obra, membros);
    }

    public void devolucao(Emprestimo emprestimo) {  // Devolve um item ao acervo da biblioteca, e aplica multa ao membro caso esteja atrasado
        relatorio.registrarDevolucao(emprestimo);
    }

}    