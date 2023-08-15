package lab01;

public class Livro extends Obra{

    private final String registro_livro;
    private int numExemplares;
    private int numEmprestados;
    private boolean ebook; // verifica se tem disponivel como ebook

    // Construtor

    public Livro(String tipo, String assunto, String isbn, String titulo, String autor, int ano, 
    int edicao, String editora, int numDePaginas, int numExemplares, int numEmprestados, boolean ebook) {
        super(tipo, assunto, isbn, titulo, autor, null, editora, ano, edicao, numDePaginas, numDePaginas);
        this.registro_livro = assunto + isbn;
        this.numExemplares = numExemplares;
        this.numEmprestados = numEmprestados;
        this.ebook = ebook;
    }

    //Getters & Setters
    public String getRegistro_livro() {
        return this.registro_livro;
    }


    public int getNumExemplares() {
        return this.numExemplares;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public int getNumEmprestados() {
        return this.numEmprestados;
    }

    public void setNumEmprestados(int numEmprestados) {
        this.numEmprestados = numEmprestados;
    }

    public boolean isEbook() {
        return this.ebook;
    }

    public boolean getEbook() {
        return this.ebook;
    }

    public void setEbook(boolean ebook) {
        this.ebook = ebook;
    }

}