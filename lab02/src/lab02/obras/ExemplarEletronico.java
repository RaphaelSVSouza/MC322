package obras;

public class ExemplarEletronico extends Obra {
	private int megabytesDoArquivo;
	
	//Construtor
	public ExemplarEletronico(int tombo, String tipo, String assunto, String registro, String titulo, String autor, 
			int ano, String idioma, int numExemplares, int numEmprestados, int megabytesDoArquivo) {
		super(tombo, tipo, assunto, registro, titulo, autor, ano, idioma,
				numExemplares, numEmprestados);
		this.megabytesDoArquivo = megabytesDoArquivo;
	}
	
	//Getters & Setters
	public int getMegabytesDoArquivo() {
		return this.megabytesDoArquivo;
	}
	
	public void setMegabytesDoArquivo(int megabytesDoArquivo) {
		this.megabytesDoArquivo = megabytesDoArquivo;
	}
	
	//Outros métodos
	
}
