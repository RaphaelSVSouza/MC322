package obras.fisico;

import obras.Obra;

public class ExemplarFisico extends Obra {
	private int numTotalCopias;
	private int numCopiasDisponiveis;
	private Estado conservacao;
	
	//construtor
    public ExemplarFisico(String titulo, String autor, String editora, int ano, String genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao) {
        super(titulo, autor, editora, ano, genero, sinopse, capa_path);
        this.numTotalCopias = numTotalCopias;
        this.numCopiasDisponiveis = numCopiasDisponiveis;
        this.conservacao = conservacao;
    }
    
    //getters & setters
    public int getNumTotalCopias() {
        return numTotalCopias;
    }

    public void setNumTotalCopias(int numTotalCopias) {
        this.numTotalCopias = numTotalCopias;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void setNumCopiasDisponiveis(int numCopiasDisponiveis) {
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    public Estado getConservacao() {
        return conservacao;
    }

    public void setConservacao(Estado conservacao) {
        this.conservacao = conservacao;
    }
}
