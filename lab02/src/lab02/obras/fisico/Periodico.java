package obras.fisico;

public class Periodico extends ExemplarFisico {
    private final String issn; 
    private final String tituloAnterior; //separado de
    private String tituloPosterior; //continuado por

    //Construtores
    public Periodico(int tombo, String tipo, String assunto, String registro, String titulo, 
    		String autor, int ano, String idioma, int numExemplares, int numEmprestados,
    		int numDePaginas, String localDePublicacao, boolean ebookStatus, String issn, String tituloAnterior, String tituloPosterior) {
        super(tombo, "Periodico", assunto, ("PER" + "/" + assunto + issn + "-" + tombo),
        		titulo, autor, ano, idioma, numExemplares, numEmprestados,
        		numDePaginas, localDePublicacao, ebookStatus);
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
