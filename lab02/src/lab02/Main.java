import biblioteca.*;
import obras.*;
import obras.fisico.Artigo;
import obras.fisico.Livro;
import pessoas.*;
import pessoas.Membros.Aluno;
import pessoas.Membros.Professor;
import biblioteca.sistema.*;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Cesar Lattes", 100, 3);
		System.out.println("Seja bem vindo(a) à biblioteca " + biblioteca.getNome()+"!");

		Livro livro1 = new Livro(
				//perceba a associação entre Livro e Biblioteca para receber NumLivros
			    biblioteca.getNumLivros(),    // tombo
			    "9788574803999",              // isbn
			    "ROM",                        // assunto
			    "Clásssicos: Dom Casmurro",   // titulo
			    "Machado de Assis",           // autor
			    2010,                         // ano
			    "Rio de Janeiro",             // localDePublicacao
			    "Português",                  // idioma
			    401,                          // numDePaginas
			    2,                            // edicao
			    "Editora do Saber",           // editora
			    1,                            // volume
			    false,                        // ebookStatus
			    3,                            // numExemplares
			    0                             // numEmprestados
			);
		biblioteca.addObraFisica(livro1, 0);
		
		Livro livro2 = new Livro(
				//perceba a associação entre Livro e Biblioteca para receber NumLivros
			    biblioteca.getNumLivros(),    // tombo
			    "9786586253986",              // isbn
			    "BIO",                        // assunto
			    "Introdução a Bioinformática",// titulo
			    "Sergio Russo Matioli",           // autor
			    2021,                         // ano
			    "Campinas",             // localDePublicacao
			    "Português",                  // idioma
			    176,                          // numDePaginas
			    1,                            // edicao
			    "UNICAMP",           // editora
			    3,                            // volume
			    true,                        // ebookStatus
			    1,                            // numExemplares
			    0                             // numEmprestados
			);
		biblioteca.addObraFisica(livro2, 0);
		
        Artigo artigo1 = new Artigo(
        		//perceba a associação entre Livro e Biblioteca para receber NumArtigos
        		biblioteca.getNumArtigos(), // tombo
                "Bioinfo",      // assunto
                "Avanços em Sequenciamento de DNA",  // titulo
                "João Silva",           // autor
                2023,                   // ano
                "Português",            // idioma
                10,                     // numExemplares
                10,                     // numEmprestados
                15,                     // numDePaginas
                "Campinas",      	// localDePublicacao
                true,                   // ebookStatus
                "Nature Genetics",      // fonte
                "10.1234/abcd",         // doi
                "UNICAMP" 			    // universidade
            );
        
        biblioteca.addObraFisica(artigo1, 80);

		Professor prof1 = new Professor("Marcos", 51234714809L, 123456, "IC");
		
		Aluno aluno1 = new Aluno("Leticia", 32992907898L, 254175, "IFGW", 0, "Graduação");

		Funcionario func1 = new Funcionario("Luciano", 93297242809L, "gerente");
			
		System.out.println("Algumas obras:");
		System.out.println(livro1.getRegistro()); 
		System.out.println(livro2.getRegistro()); 
		System.out.println(artigo1.getRegistro());
		
		Emprestimo emprestimo1 = biblioteca.emprestar(livro1, aluno1);
	}

}