package obras;

public class Livro extends ExemplarFisico {
    private final String isbn;
    private final int edicao;
    private final String editora;
    private final int volume;

    //construtor
    public Livro(int tombo, String isbn, String assunto, String titulo,
                String autor, int ano, String localDePublicacao, String idioma,
                int numDePaginas, int edicao, String editora, int volume, 
                boolean ebookStatus, int numExemplares, int numEmprestados) {
        super(tombo, "Livro", assunto, (assunto + isbn + "-" + tombo), titulo, 
        		autor, ano, idioma, numExemplares, numEmprestados,
        		numDePaginas, localDePublicacao, ebookStatus);
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
}
