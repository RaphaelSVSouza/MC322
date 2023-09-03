import biblioteca.*;
import obras.*;
import obras.fisico.*;
import pessoas.*;
import biblioteca.sistema.*;

public class Main {

	public static void main(String[] args) {

		EstanteFisica[] estantesFisicas = new EstanteFisica[14];
    	for (int i=0; i<14; i++) {
    		estantesFisicas[i] = new EstanteFisica(i);
    	}
    	EstanteVirtual estanteVirtual = new EstanteVirtual();

		LivroFisico livro1 = new Livro(
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
		// add na estante pelo adm
		
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
		// add na estante pelo adm
		
        
	}

}