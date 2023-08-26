package obras;

public class Tese extends ExemplarFisico {
    private final String universidade;
    private final String doi;

    //Construtores
    public Tese(int tombo, String tipo, String assunto, String registro, String titulo, 
    		String autor, int ano, String idioma, int numExemplares, int numEmprestados,
    		int numDePaginas, String localDePublicacao, boolean ebookStatus, String universidade, String doi) {
        super(tombo, "Tese", assunto, ("TES" + "/" + universidade + "-" + assunto + tombo),
        	  titulo, autor, ano, idioma, numExemplares, numEmprestados,
        	  numDePaginas, localDePublicacao, ebookStatus);
        this.universidade = universidade;
        this.doi = doi;
    }

    //Getters & Setters
    public String getUniversidade() {
        return universidade;
    }

    public String getDoi() {
        return doi;
    }
}
