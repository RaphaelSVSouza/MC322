package lab01;

import java.util.ArrayList;

public class Tese extends Obra {

    private ArrayList<Obra> referencias_artigos;

    public Tese(String tipo, String assunto, String isbn, String titulo, 
    String autor, String universidade, int ano, int numDePaginas) {

        super(tipo, assunto, isbn, titulo, autor, universidade, 
        null, ano, 0, 0, numDePaginas);
        this.referencias_artigos = new ArrayList<Obra>();
    }

    public ArrayList<Obra> getReferencias_artigos() {
        return this.referencias_artigos;
    }

    public void setReferencias_artigos(ArrayList<Obra> referencias_artigos) {
        this.referencias_artigos = referencias_artigos;
    }

}
