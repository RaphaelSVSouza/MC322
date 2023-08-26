package obras;

public class ExemplarFisico extends Obra {
    private final int numDePaginas;
    private final String localDePublicacao;
    private boolean ebookStatus;

    public ExemplarFisico(int tombo, String tipo, String assunto, String registro, String titulo, 
    		String autor, int ano, String idioma, int numExemplares, int numEmprestados,
    		int numDePaginas, String localDePublicacao, boolean ebookStatus) {
        super(tombo, tipo, assunto, registro, titulo, autor, ano, idioma, numExemplares, numEmprestados);
        this.numDePaginas = numDePaginas;
        this.localDePublicacao = localDePublicacao;
        this.ebookStatus = ebookStatus;
    }
    
    public int getNumDePaginas() {
        return numDePaginas;
    }

    public String getLocalDePublicacao() {
        return localDePublicacao;
    }

    public boolean isEbookStatus() {
        return ebookStatus;
    }

    public void setEbookStatus(boolean ebookStatus) {
        this.ebookStatus = ebookStatus;
    }
}
