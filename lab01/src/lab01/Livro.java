package lab01;

public class Livro {
    private final String tipo; // verifica se é um livro, artigo, monografia e etc. Além de considerar que tudo exceto livro, tem publicação online em ebook
    private final String assunto;
    private final String isbn; // Catalogo internacional para livros, artigos, monografias e etc.
    private final String registro;
    private final String titulo;
    private final String autor;
    private final String universidade; // atributo relacionado à artigos, no qual é inserido a universidade do autor principal
    private final int ano;
    private final int edicao;
    private final int numDePaginas;
    private int numExemplares;
    private int numEmprestados;
    private boolean ebook; // verifica se tem disponivel como ebook

    // Construtor
    public Livro(String tipo, String assunto, String isbn, String titulo, String autor, String universidade, int ano, 
                int edicao, int numDePaginas, int numExemplares, boolean ebook) {
        this.tipo = tipo;
        this.assunto = assunto;
        this.isbn = isbn;
        this.registro = assunto + isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.universidade = universidade;
        this.ano = ano;
        this.edicao = edicao;
        this.numDePaginas = numDePaginas;
        this.numExemplares = numExemplares;
        this.ebook = ebook;
    }

    public String getTipo() {
        return this.tipo;
    }


    public String getAssunto() {
        return this.assunto;
    }


    public String getIsbn() {
        return this.isbn;
    }


    public String getRegistro() {
        return this.registro;
    }


    public String getTitulo() {
        return this.titulo;
    }


    public String getAutor() {
        return this.autor;
    }


    public String getUniversidade() {
        return this.universidade;
    }


    public int getAno() {
        return this.ano;
    }


    public int getEdicao() {
        return this.edicao;
    }


    public int getNumDePaginas() {
        return this.numDePaginas;
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