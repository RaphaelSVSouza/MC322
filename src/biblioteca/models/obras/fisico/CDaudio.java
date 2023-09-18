package biblioteca.models.obras.fisico;

import java.util.List;

public class CDaudio extends ExemplarFisico {
    private final List<String> listaDeFaixas;
    private final int duracaoTotal;
    private final GeneroMusical genero;
    
    public CDaudio(int id, String titulo, String autor, String editora, int ano, GeneroMusical genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		List<String> listaDeFaixas, int duracaoTotal) {
    	super(id, titulo, autor, editora, ano, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
    	this.listaDeFaixas = listaDeFaixas;
    	this.duracaoTotal = duracaoTotal;
    	this.genero = genero;
    }
    
    // Getters & Setters
    public GeneroMusical getGenero() {
        return genero;
    }
    
    public int getDuracaoTotal() {
        return duracaoTotal;
    }
    
    public List<String> getListaDeFaixas() {
    	return listaDeFaixas;
    }
}
