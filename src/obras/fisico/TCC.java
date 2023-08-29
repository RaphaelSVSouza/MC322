package obras.fisico;

public class TCC extends ExemplarFisico {
    private final String universidade;
    private final String cursoDeFormacao;

    //Construtores
    public TCC(int tombo, String tipo, String assunto, String registro, String titulo, 
    		String autor, int ano, String idioma, int numExemplares, int numEmprestados,
    		int numDePaginas, String localDePublicacao, boolean ebookStatus, String universidade, String cursoDeFormacao) {
        super(tombo, "TCC", assunto, ("TCC" + "/" + universidade + "-" + assunto + tombo),
        		titulo, autor, ano, idioma, numExemplares, numEmprestados,
        		numDePaginas, localDePublicacao, ebookStatus);
        this.universidade = universidade;
        this.cursoDeFormacao = cursoDeFormacao;
    }

    //Getters & Setters
    public String getUniversidade() {
        return universidade;
    }

    public String getCursoDeFormacao() {
        return cursoDeFormacao;
    }
}
