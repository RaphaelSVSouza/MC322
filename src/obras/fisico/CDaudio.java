package obras.fisico;

import java.util.List;

public class CDaudio extends ExemplarFisico {
    private final List<String> listaDeFaixas;
    private final int duracaoTotal;
    
    public CDaudio(String titulo, String autor, String editora, int ano, String genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		List<String> listaDeFaixas, int duracaoTotal) {
    	super(titulo, autor, editora, ano, genero, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
    	this.listaDeFaixas = listaDeFaixas;
    	this.duracaoTotal = duracaoTotal;
    }
    
    // Getters & Setters
    
    public int getDuracaoTotal() {
        return duracaoTotal;
    }
    
    public List<String> getListaDeFaixas() {
    	return listaDeFaixas;
    }
}
