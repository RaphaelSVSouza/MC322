package lab01;

import java.util.ArrayList;

public class Artigo extends Obra {
    
    private ArrayList<Obra> referencias;

    public Artigo(String tipo, String assunto, String isbn, String titulo, String autor, String universidade, int ano, 
    int edicao, String editora, int numDePaginas, boolean ebook) {

        super(tipo, assunto, isbn, titulo, autor, universidade, null, ano, 0, numDePaginas, numDePaginas);
        this.referencias = new ArrayList<Obra>();
    }

    //Getters & Setters
    public ArrayList<Obra> getReferencias() {
        return this.referencias;
    }

    public void setReferencias(ArrayList<Obra> referencias) {
        this.referencias = referencias;
    }

}
