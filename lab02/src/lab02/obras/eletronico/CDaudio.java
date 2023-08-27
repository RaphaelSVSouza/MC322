package obras.eletronico;

public class CDaudio extends ExemplarEletronico {

	
	//Construtor
	public CDaudio(int tombo, String tipo, String assunto, String registro, String titulo, String autor, 
			       int ano, String idioma, int numExemplares, int numEmprestados, int megabytesDoArquivo) {
		super(tombo, tipo, assunto, registro, titulo, autor, ano, idioma,
				numExemplares, numEmprestados, megabytesDoArquivo);
	}
}
