package main;

import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.models.equipamentos.Equipamento;
import biblioteca.models.equipamentos.Equipamento.Informatica;
import biblioteca.models.estantes.EstanteFisica;
import biblioteca.models.utils.*;
import biblioteca.models.estantes.EstanteVirtual;
import biblioteca.models.itensmultimidia.fisico.Estado;
import biblioteca.models.itensmultimidia.fisico.GeneroLiterario;
import biblioteca.models.itensmultimidia.fisico.LivroFisico;
import biblioteca.models.membros.academicos.Graduando;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		EstanteFisica[] estantesFisicas = new EstanteFisica[14];
    	for (int i=0; i<14; i++) {
    		estantesFisicas[i] = new EstanteFisica(i);
    	}
    	EstanteVirtual estanteVirtual = new EstanteVirtual();
    	
    	Graduando graduando1 = new Graduando(
    		    "João Silva", 
    		    12345, 
    		    "Rua da Universidade, 123", 
    		    "joao.silva@email.com", 
    		    "2023-09-23"
    		);

    	Graduando graduando2 = new Graduando(
    		    "Maria Santos", 
    		    54321, 
    		    "Avenida da Faculdade, 456", 
    		    "maria.santos@email.com", 
    		    "2023-09-23"
    		);
    	
    	LivroFisico livro1 = new LivroFisico(
    		    1, 
    		    "Aventuras Fantásticas", 
    		    "Autor 1", 
    		    "Editora XYZ", 
    		    2023, 
    		    GeneroLiterario.AVENTURA, 
    		    "Sinopse do livro 1", 
    		    null, // Sem capa
    		    100, 
    		    50, 
    		    Estado.BOM, 
    		    "1234567890", 
    		    1, 
    		    101
    		);

    	LivroFisico livro2 = new LivroFisico(
    		    2, 
    		    "Romance Épico", 
    		    "Autor 2", 
    		    "Editora ABC", 
    		    2022, 
    		    GeneroLiterario.ROMANCE, 
    		    "Sinopse do livro 2", 
    		    null, 
    		    75, 
    		    25, 
    		    Estado.MEDIO, 
    		    "0987654321", 
    		    2, 
    		    202
    		);

    	ItemBiblioteca<LivroFisico> livros = new ItemBiblioteca<>();
    	livros.addItem(livro1);
    	livros.addItem(livro2);
    	
    	Equipamento.Informatica equipamentoInformatica = new Equipamento.Informatica("Notebook");
        Equipamento.Audiovisual equipamentoAudiovisual = new Equipamento.Audiovisual("Projetor");
    	
    	Emprestimo<LivroFisico> emprestimoItem1 = livros.emprestarItem(livro1, graduando1);
    	Emprestimo<LivroFisico> emprestimoItem2 = livros.emprestarItem(livro2, graduando2);
        
        Emprestimo<Equipamento.Informatica> emprestimoEquip1 = new Emprestimo<>(equipamentoInformatica, graduando1);
    	
        ListaEmprestimos<LivroFisico> livrosEmprestados = new ListaEmprestimos<>();
        livrosEmprestados.addEmprestimo(emprestimoItem1);
		livrosEmprestados.addEmprestimo(emprestimoItem2);
        
        ListaEmprestimos<Equipamento.Informatica> EquipInfoEmprestados = new ListaEmprestimos<>();
        livrosEmprestados.addEmprestimo(emprestimoItem1);
        	
        
	}
}