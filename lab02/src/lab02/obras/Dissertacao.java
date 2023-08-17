package obras;

import java.util.ArrayList;

public class Dissertacao extends Obra {

    private ArrayList<Obra> referencias_artigos;
    private final String chamada_dissetacao;

    public Dissertacao(String tipo, String assunto, String isbn, String titulo, 
    String autor, String universidade, int ano, int numDePaginas, String chamada_dissetacao) {
        
        super(tipo, assunto, isbn, titulo, autor, universidade, null, ano, 0, numDePaginas, numDePaginas);
        this.chamada_dissetacao = tipo + "/" + universidade + assunto + isbn;
        this.referencias_artigos = new ArrayList<Obra>();
    }

    public String getChamada_dissetacao() {
        return this.chamada_dissetacao;
    }

    public ArrayList<Obra> getReferencias_artigos() {
        return this.referencias_artigos;
    }

    public void setReferencias_artigos(ArrayList<Obra> referencias_artigos) {
        this.referencias_artigos = referencias_artigos;
    }

}
