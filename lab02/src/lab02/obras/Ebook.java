package obras;

public class Ebook extends ExemplarEletronico {
    private final String isbn;
    private final int edicao;
    private final String editora;
    private final int volume;
	
	//Construtor
	public Ebook(int tombo, String tipo, String assunto, String registro, String titulo, String autor, 
			     int ano, String idioma, int numExemplares, int numEmprestados, int megabytesDoArquivo,
			     String isbn, int edicao, String editora, int volume) {
		super(tombo, tipo, assunto, registro, titulo, autor, ano, idioma,
			  numExemplares, numEmprestados, megabytesDoArquivo);
        this.isbn = isbn;
        this.edicao = edicao;
        this.editora = editora;
        this.volume = volume;
	}
	
	//Getters & Setters
    public String getIsbn() {
        return isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getEditora() {
        return editora;
    }

    public int getVolume() {
        return volume;
    }
    
    //Outros métodos
    
}
