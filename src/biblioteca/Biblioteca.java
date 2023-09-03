package biblioteca;

import java.util.ArrayList;
import biblioteca.sistema.Emprestimo;
import biblioteca.sistema.Relatorio;
import obras.Obra;
import obras.fisico.*;
import obras.eletronico.*;
import pessoas.Aluno;
import pessoas.Funcionario;
import pessoas.Membros;
import pessoas.Professor;

public class Biblioteca {
	private final String nome; //nome da biblioteca
	private EstanteFisica[] estantesFisicas;
	private EstanteVirtual estanteVirtual;

    // Construtor
    public Biblioteca(String nome, int numEstantesFisicas) {
    	//relação de composição entre Biblioteca e as estantes

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
    

  	//Outros métodos     
    public void addObraFisica(ExemplarFisico obra, int indexEstante) { // Adiciona uma obra a biblioteca
        if (indexEstante >= 0 && indexEstante < estantesFisicas.length) {
        	estantesFisicas[indexEstante].addObraFisica(obra);
        }
    	
    	relatorio.obraAdicionada(obra);
    }
    
    public void addObraEletronica(Ebook obra, String url) { // Adiciona uma obra a biblioteca
        estantesVirtuais.addObraEletronica(obra);
    	relatorio.obraAdicionada(obra);
    }

    public Emprestimo emprestar(Obra obra, Membros membros) { // Empresta uma obra a uma pessoa com a data a ser devolvida
        return relatorio.realizarEmprestimo(obra, membros);
    }

    public void devolucao(Emprestimo emprestimo) {  // Devolve um item ao acervo da biblioteca, e aplica multa ao membro caso esteja atrasado
        relatorio.registrarDevolucao(emprestimo);
    }

}    