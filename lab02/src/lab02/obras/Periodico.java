package obras;

public class Periodico extends Obra {
    private final String issn; 
    private final String tituloAnterior; //separado de
    private String tituloPosterior; //continuado por

    //Construtores
    public Periodico(int tombo, String assunto, String titulo,
                     String autor, int ano, String localDePublicacao, String idioma,
                     int numDePaginas, int numExemplares, int numEmprestados,
                     boolean ebookStatus, String issn, String tituloAnterior, String tituloPosterior) {
        super(tombo, "Periodico", assunto, 
        		("PER" + "/" + assunto + issn + "-" + tombo),
        		titulo, autor, ano, localDePublicacao, idioma,
              numDePaginas, numExemplares, numEmprestados, ebookStatus);
        this.issn = issn;
        this.tituloAnterior = tituloAnterior;
        this.tituloPosterior = tituloPosterior;
    }

    //Getters & Setters
    public String getIssn() {
        return issn;
    }

    public String getTituloAnterior() {
        return tituloAnterior;
    }

    public String getTituloPosterior() {
        return tituloPosterior;
    }

    public void setTituloPosterior(String tituloPosterior) {
        this.tituloPosterior = tituloPosterior;
    }
}
