package obras.fisico;

public class Outro extends ExemplarFisico {
    private String tipoRecurso;
    private String formato;
    private int localizacao;

    public Outro(String titulo, String autor, String editora, int ano, String genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		String tipoRecurso, String formato, int localizacao) {
    	super(titulo, autor, editora, ano, genero, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
        this.tipoRecurso = tipoRecurso;
        this.formato = formato;
        this.localizacao = localizacao;
    }

    // Getters & Setters
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
