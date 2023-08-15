package lab01;

public class TCC extends Obra {
    
    private final String chamada_tcc;
    
    // Construtor
    public TCC(String tipo, String assunto, String isbn, String titulo, 
            String autor, String universidade, int ano, int numDePaginas, String chamada_tcc) {

        super(tipo, assunto, isbn, titulo, autor, universidade, null, ano, 0, 0, numDePaginas);
        this.chamada_tcc = tipo + "/" + universidade + assunto + isbn; 
    }
    
    // Getter
    public String getChamada_tcc() {
        return this.chamada_tcc;
    }

}

