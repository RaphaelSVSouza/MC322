package obras;

public class TCC extends Obra {
    private final String universidade;
    private final String cursoDeFormacao;

    //Construtores
    public TCC(int tombo, String assunto, String titulo,
               String autor, int ano, String localDePublicacao, String idioma,
               int numDePaginas, int numExemplares, int numEmprestados,
               boolean ebookStatus, String universidade, String cursoDeFormacao) {
        super(tombo, "TCC", assunto, 
        		("TCC" + "/" + universidade + "-" + assunto + tombo), 
        		titulo, autor, ano, localDePublicacao, idioma,
              numDePaginas, numExemplares, numEmprestados, ebookStatus);
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
