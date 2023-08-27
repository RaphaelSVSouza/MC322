import biblioteca.*;
import obras.*;
import obras.fisico.Artigo;
import obras.fisico.Livro;
import pessoas.*;
import pessoas.Membros.Aluno;
import pessoas.Membros.Professor;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Cesar Lattes", 100);

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
		biblioteca.addObra(livro1);
		
		Livro livro2 = new Livro(
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
		biblioteca.addObra(livro2);
		
        Artigo artigo1 = new Artigo(
        		//perceba a associação entre Livro e Biblioteca para receber NumArtigos
        		biblioteca.getNumArtigos(), // tombo
                "Bioinfo",      // assunto
                "Avanços em Sequenciamento de DNA",  // titulo
                "João Silva",           // autor
                2023,                   // ano
                "Português",            // idioma
                50,                     // numExemplares
                10,                     // numEmprestados
                15,                     // numDePaginas
                "Campinas",      	// localDePublicacao
                true,                   // ebookStatus
                "Nature Genetics",      // fonte
                "10.1234/abcd",         // doi
                "UNICAMP" 			    // universidade
            );
        
        biblioteca.addObra(artigo1);

		Professor prof1 = new Professor("Marcos", 51234714809L, 123456, "IC");
		
		Aluno aluno1 = new Aluno("Leticia", 32992907898L, 254175, "IFGW", false, 0, "Graduação");

		Funcionario func1 = new Funcionario("Luciano", 93297242809L, "gerente");
		
		System.out.println("Seja bem vindo(a) à biblioteca " + biblioteca.getNome()+"!");
		
		System.out.println(livro1.getRegistro()); 
		System.out.println(livro2.getRegistro()); 
		
		System.out.println(artigo1.getRegistro());
	}

}