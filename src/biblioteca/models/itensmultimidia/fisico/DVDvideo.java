package biblioteca.models.itensmultimidia.fisico;

import java.util.List;

public class DVDvideo extends ExemplarFisico {
	private final List<String> elenco;
	private final int duracao; //em minutos
	private String legendaEaudios_path; 
	private final GeneroFilme genero;
	
	public DVDvideo(int id, String titulo, String autor, String editora, int ano, GeneroFilme genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		List<String> elenco, int duracao, String legendaEaudios_path) {
		super(id, titulo, autor, editora, ano, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
		this.elenco = elenco;
		this.duracao = duracao;
		this.legendaEaudios_path = legendaEaudios_path;
		this.genero = genero;
	}
	
	// getters & setters
    public GeneroFilme getGenero() {
        return genero;
    }
	
	public List<String> getElenco() {
	    return elenco;
	}

	public int getDuracao() {
	    return duracao;
	}

	public String getLegendaEaudios_path() {
	    return legendaEaudios_path;
	}

	public void setLegendaEaudios_path(String legendaEaudios_path) {
	    this.legendaEaudios_path = legendaEaudios_path;
	}
}
