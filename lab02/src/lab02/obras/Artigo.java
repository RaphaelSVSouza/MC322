package obras;

public class Artigo extends ExemplarFisico {
    private final String fonte; //revista, qual página e capítulo da revista, etc..
    private final String doi;
    private final String universidade;

    //Construtores
    public Artigo(int tombo, String tipo, String assunto, String registro, String titulo, String autor,
            int ano, String idioma, int numExemplares, int numEmprestados,
            int numDePaginas, String localDePublicacao, boolean ebookStatus,
                 String fonte, String doi, String universidade) {
        super(tombo, "Artigo", assunto, 
        		("ART" + "/" + universidade + "-" + assunto + tombo), 
        		titulo, autor, ano, idioma, numExemplares, numEmprestados,numDePaginas, localDePublicacao,
               ebookStatus);
        this.fonte = fonte;
        this.doi = doi;
        this.universidade = universidade;
    }

    //Getters & Setters
    public String getFonte() {
        return fonte;
    }

    public String getDoi() {
        return doi;
    }

    public String getUniversidade() {
        return universidade;
    }
}
