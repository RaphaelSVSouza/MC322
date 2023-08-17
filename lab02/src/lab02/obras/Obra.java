package obras;

public class Obra {
    private final String tipo; // indentifica se é um livro, artigo, monografia e etc. Além de considerar que tudo exceto livro, tem publicação online em ebook
    private final String assunto;
    private final String isbn; // Catalogo internacional para livros, artigos, monografias e etc.
    private final String titulo;
    private final String autor;
    private final String universidade; // atributo relacionado à artigos, no qual é inserido a universidade do autor principal
    private final String editora;
    private final int ano;
    private final int edicao;
    private final int pagina;
    private final int numDePaginas;

    // Construtor
    public Obra(String tipo, String assunto, String isbn, String titulo, 
    String autor, String universidade, String editora, int ano, 
    int edicao, int pagina, int numDePaginas) {

        this.tipo = tipo;
        this.assunto = assunto;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.universidade = universidade;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.pagina = pagina;
        this.numDePaginas = numDePaginas;
    }

    //Getters & Setters
    public String getTipo() {
        return this.tipo;
    }


    public String getAssunto() {
        return this.assunto;
    }


    public String getIsbn() {
        return this.isbn;
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


    public String getEditora() {
        return this.editora;
    }


    public int getAno() {
        return this.ano;
    }


    public int getEdicao() {
        return this.edicao;
    }


    public int getPagina() {
        return this.pagina;
    }


    public int getNumDePaginas() {
        return this.numDePaginas;
    }

}
