package obras;

public class Dissertacao extends Obra {
    private final String universidade;
    private final String doi;

    //Construtores
    public Dissertacao(int tombo, String tipo, String assunto, String registro, String titulo, String autor,
            int ano, String idioma, int numExemplares, int numEmprestados,
            int numDePaginas, String localDePublicacao, boolean ebookStatus, String universidade, String doi) {
    	super(tombo, "Dissertacao", assunto, 
    			("DIS" + "/" + universidade + "-" + assunto + tombo),
    			titulo, autor, ano, idioma, numExemplares, numEmprestados,numDePaginas, localDePublicacao,
                ebookStatus);
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
