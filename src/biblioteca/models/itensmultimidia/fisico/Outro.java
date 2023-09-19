package biblioteca.models.itensmultimidia.fisico;

public class Outro extends ExemplarFisico {
    private String tipoRecurso;
    private String formato;
    private int localizacao;
    private final String genero;

    public Outro(int id, String titulo, String autor, String editora, int ano, String genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		String tipoRecurso, String formato, int localizacao) {
    	super(id, titulo, autor, editora, ano, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
        this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        this.localizacao = localizacao;
        this.genero = genero;
    }

    // Getters & Setters
    public String getGenero() {
        return genero;
    }
    
    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public String getFormato() {
        return formato;
    }

    public int getLocalizacao() {
        return localizacao;
    }
    
    public void setLocalizacao(int localizacao) {
    	this.localizacao = localizacao;
    }
}
