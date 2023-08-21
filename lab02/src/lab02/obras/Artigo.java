package obras;

public class Artigo extends Obra {
    private final String fonte; //revista, qual página e capítulo da revista, etc..
    private final String doi;
    private final String universidade;

    //Construtores
    public Artigo(int tombo, String assunto, String titulo,
                 String autor, int ano, String localDePublicacao, String idioma,
                 int numDePaginas, int numExemplares, int numEmprestados, boolean ebookStatus,
                 String fonte, String doi, String universidade) {
        super(tombo, "Artigo", assunto, 
        		("ART" + "/" + universidade + "-" + assunto + tombo), 
        		titulo, autor, ano, localDePublicacao, idioma,
              numDePaginas, numExemplares, numEmprestados, ebookStatus);
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
