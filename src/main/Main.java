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
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
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
    	
    	LivroFisico livro3 = new LivroFisico(
                1,              // ID
                "O Senhor dos Anéis", // Título
                "J.R.R. Tolkien",    // Autor
                "Editora XYZ",        // Editora
                1954,                 // Ano
                GeneroLiterario.AVENTURA, // Gênero
                "Uma grande aventura em um mundo de fantasia.", // Sinopse
                "/caminho/para/capa1.jpg", // Caminho da capa
                100,                  // Número total de cópias
                20,                   // Número de cópias disponíveis
                Estado.BOM,           // Conservação
                "978-85-00000-00-1",  // ISBN
                1,                    // Edição
                1                     // Localização
            );

            // Instanciando o segundo livro
            LivroFisico livro4 = new LivroFisico(
                2,              // ID
                "Dom Quixote",  // Título
                "Miguel de Cervantes", // Autor
                "Editora ABC",  // Editora
                1605,           // Ano
                GeneroLiterario.CLASSICO, // Gênero
                "As aventuras do cavaleiro enlouquecido Dom Quixote.", // Sinopse
                "/caminho/para/capa2.jpg", // Caminho da capa
                150,            // Número total de cópias
                30,             // Número de cópias disponíveis
                Estado.EXCELENTE,   // Conservação
                "978-85-11111-11-1",  // ISBN
                2,              // Edição
                2               // Localização
            );

            // Instanciando o terceiro livro
            LivroFisico livro5 = new LivroFisico(
                3,              // ID
                "1984",         // Título
                "George Orwell",// Autor
                "Editora DEF",  // Editora
                1949,           // Ano
                GeneroLiterario.LITERATURA_ESTRANGEIRA, // Gênero
                "Um mundo distópico controlado pelo Grande Irmão.", // Sinopse
                "/caminho/para/capa3.jpg", // Caminho da capa
                120,            // Número total de cópias
                40,             // Número de cópias disponíveis
                Estado.MEDIO,// Conservação
                "978-85-22222-22-2",  // ISBN
                1,              // Edição
                3               // Localização
            );

            
            
            
        Class<?> minhaClasse = livro1.getClass(); // Acesso direto a classe
        Class<?> minhaClasseSame = Class.forName("LivroFisico.livro1"); // Pelo nome da classe
            
            
        Method[] metodos = minhaClasse.getMethods();
        for (Method metodo : metodos) {
            System.out.println("Nome do método: " + metodo.getName());
        }
            
            
//    	ItemBiblioteca<LivroFisico> livros = new ItemBiblioteca<>();
//    	livros.addItem(livro1);
//    	livros.addItem(livro2);
//    	
//    	
//        // Emprestimo de um item multimidia
//        Emprestimo<LivroFisico> emprestimo1 = livros.emprestarItem(livro1, graduando1);
//        Emprestimo<LivroFisico> emprestimo2 = livros.emprestarItem(livro1, graduando2); // tentativa de empréstimo de algo não disponível (já emprestado)
//        Emprestimo<LivroFisico> emprestimo12 = livros.emprestarItem(livro2, graduando1);
//        Emprestimo<LivroFisico> emprestimo13 = livros.emprestarItem(livro3, graduando1);
//        Emprestimo<LivroFisico> emprestimo14 = livros.emprestarItem(livro4, graduando1);
//        Emprestimo<LivroFisico> emprestimo15 = livros.emprestarItem(livro5, graduando1);
//        
//        
//        // Reserva de um item multimidia
//        livros.reservarItem(livro2, graduando2);
//        livros.emprestarItem(livro2,graduando1); // tentativa de reservar um item já reservado
//
//        // Devolução de um item multimidia
//        livros.devolverItem(emprestimo1, false);
//        livros.emprestarItem(livro1, graduando2); // empréstimo de um item que já foi devolvido
    }
}