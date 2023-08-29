package biblioteca;

import java.util.ArrayList;
import biblioteca.sistema.Emprestimo;
import biblioteca.sistema.Relatorio;
import obras.Obra;
import obras.fisico.*;
import obras.eletronico.*;
import pessoas.Funcionario;
import pessoas.Membros.Aluno;
import pessoas.Membros.Professor;
import pessoas.Membros.Membros;

public class Biblioteca {
	private final String nome; //nome da biblioteca
	private EstanteFisica[] estantesFisicas;
	private EstanteVirtual[] estantesVirtuais;
	private Relatorio relatorio;

    
    // Construtor
    public Biblioteca(String nome, int numEstantesFisicas, int numEstantesVirtuais) {
    	this.nome = nome;
    	
    	//relação de composição entre Biblioteca e Relatorio
    	relatorio = new Relatorio(); 
        
    	//relação de composição entre Biblioteca e as estantes
    	estantesFisicas = new EstanteFisica[numEstantesFisicas];
    	for (int i=0; i<numEstantesFisicas; i++) {
    		estantesFisicas[i] = new EstanteFisica();
    	}
    	estantesVirtuais = new EstanteVirtual[numEstantesVirtuais];
    	for (int i=0; i<numEstantesVirtuais; i++) {
    		estantesVirtuais[i] = new EstanteVirtual();
    	}
    }

    //Getters & Setters
    public String getNome() {
    	return this.nome;
    }
    
	public Estante[] getEstantesFisicas() {
		return this.estantesFisicas;
	}
	
	public Estante[] getEstantesVirtuais() {
		return this.estantesVirtuais;
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
    public void addObraFisica(ExemplarFisico obra, int indexEstante) { // Adiciona uma obra a biblioteca
        if (indexEstante >= 0 && indexEstante < estantesFisicas.length) {
        	estantesFisicas[indexEstante].addObraFisica(obra);
        }
    	
    	relatorio.obraAdicionada(obra);
    }
    
    public void addObraEletronica(ExemplarEletronico obra, int indexEstante) { // Adiciona uma obra a biblioteca
        if (indexEstante >= 0 && indexEstante < estantesVirtuais.length) {
        	estantesVirtuais[indexEstante].addObraEletronica(obra);
        } else {
        	System.out.println("Número da estante inválido.");
        }
    	
    	relatorio.obraAdicionada(obra);
    }

    public Emprestimo emprestar(Obra obra, Membros membros) { // Empresta uma obra a uma pessoa com a data a ser devolvida
        return relatorio.realizarEmprestimo(obra, membros);
    }

    public void devolucao(Emprestimo emprestimo) {  // Devolve um item ao acervo da biblioteca, e aplica multa ao membro caso esteja atrasado
        relatorio.registrarDevolucao(emprestimo);
    }

}    