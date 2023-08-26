package obras;

public class Obra {
    private final int tombo;
    private final String tipo;
    private final String assunto;
    private final String registro;
    private final String titulo;
    private final String autor;
    private final int ano;
    private final String idioma;
    private int numExemplares;
    private int numEmprestados;

    //Construtores
    public Obra(int tombo, String tipo, String assunto, String registro, String titulo,
                String autor, int ano, String idioma, int numExemplares, int numEmprestados) {
        
    	this.tombo = tombo;
        
    	this.tipo = tipo;
        this.assunto = assunto;
        
        this.registro = registro;
        
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.localDePublicacao = localDePublicacao;
        this.idioma = idioma;
        this.numDePaginas = numDePaginas;
        this.numExemplares = numExemplares;
        this.numEmprestados = numEmprestados;
        this.ebookStatus = ebookStatus;
    }

    public int getTombo() {
        return tombo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getRegistro() {
        return registro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
    
    public String getLocalDePublicacao() {
        return localDePublicacao;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getNumDePaginas() {
        return numDePaginas;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public int getNumEmprestados() {
        return numEmprestados;
    }

    public void setNumEmprestados(int numEmprestados) {
        this.numEmprestados = numEmprestados;
    }

    public boolean isEbookStatus() {
        return ebookStatus;
    }

    public void setEbookStatus(boolean ebookStatus) {
        this.ebookStatus = ebookStatus;
    }
}

