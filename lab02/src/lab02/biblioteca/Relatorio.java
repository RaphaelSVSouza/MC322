package biblioteca;

import java.util.ArrayList;

import obras.*;
import pessoas.Aluno;
import pessoas.Funcionario;
import pessoas.Professor;

public class Relatorio {
	//variaveis de controle para gerar o tombo automaticamente:
	private int numArtigos, numDissertacoes, numLivros, numPeriodicos, numTCCs, numTeses;
	
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Funcionario> funcionarios;
	
	//Construtor
	public Relatorio(){
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.funcionarios = new ArrayList<Funcionario>();
	}
	
    public int getNumArtigos() {
        return numArtigos;
    }

    public int getNumDissertacoes() {
        return numDissertacoes;
    }
    
    public int getNumLivros() {
        return numLivros;
    }

    public void add1Livro(int numLivros) {
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
    
    
    public ArrayList<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    
    //Outros métodos 
    public void obraAdicionada(Obra obra) {
        if (obra instanceof Artigo) {
            numArtigos++;
        } else if (obra instanceof Dissertacao) {
            numDissertacoes++;
        } else if (obra instanceof Livro) {
            numLivros++;
        } else if (obra instanceof Periodico) {
            numPeriodicos++;
        } else if (obra instanceof TCC) {
            numTCCs++;
        } else if (obra instanceof Tese) {
            numTeses++;
        }
    }
}
