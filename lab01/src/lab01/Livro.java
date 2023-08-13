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
    
}