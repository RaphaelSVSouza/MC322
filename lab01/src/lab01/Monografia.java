package lab01;

public class Monografia extends Obra{
    private final String reflexao; // foco do tema escolhido para a monografia
    private final String chamada;


    public Monografia(String tipo, String assunto, String isbn, String titulo, 
    String autor, String universidade, int ano, int pagina, 
    int numDePaginas,String reflexao, String chamada) {

        super(tipo, assunto, isbn, titulo, autor, universidade, 
        null, ano, 0, 0, numDePaginas);
        this.reflexao = reflexao;
        this.chamada = universidade + assunto + isbn;
    }

    public String getReflexao() {
        return this.reflexao;
    }


    public String getChamada() {
        return this.chamada;
    }

}