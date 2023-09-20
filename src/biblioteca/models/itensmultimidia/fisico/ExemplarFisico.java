package biblioteca.models.itensmultimidia.fisico;

import biblioteca.models.itensmultimidia.ItemMultimidia;

public class ExemplarFisico extends ItemMultimidia {
	private int numTotalCopias;
	private int numCopiasDisponiveis;
	private Estado conservacao;
	
	//construtor
    public ExemplarFisico(int id, String titulo, String autor, String editora, int ano,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao) {
        super(id, titulo, autor, editora, ano, sinopse, capa_path);
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
