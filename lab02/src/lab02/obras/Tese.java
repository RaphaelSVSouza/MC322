package obras;

public class Tese extends Obra {
    private final String universidade;
    private final String doi;

    //Construtores
    public Tese(int tombo, String assunto, String titulo,
                String autor, int ano, String localDePublicacao, String idioma,
                int numDePaginas, int numExemplares, int numEmprestados,
                boolean ebookStatus, String universidade, String doi) {
        super(tombo, "Tese", assunto, 
        		("TES" + "/" + universidade + "-" + assunto + tombo), 
        		titulo, autor, ano, localDePublicacao, idioma,
              numDePaginas, numExemplares, numEmprestados, ebookStatus);
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
