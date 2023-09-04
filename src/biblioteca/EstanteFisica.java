package biblioteca;

import obras.fisico.ExemplarFisico;

public class EstanteFisica extends Estante{	
	private final int indexEstante;
	ExemplarFisico[] obrasFisicas;
	
	//Construtor
	public EstanteFisica(int indexEstante) {
		this.indexEstante = indexEstante;
		obrasFisicas = new ExemplarFisico[50];
	}
	
	//Getters & Setters
    public ExemplarFisico[] getObrasFisicas() {
        return obrasFisicas;
    }

    public void setObras(ExemplarFisico[] obrasFisicas) {
        this.obrasFisicas = obrasFisicas;
    }
    
    public int getIndesEstante() {
    	return indexEstante;
    }
	
	//Outros métodos
    public void addObraFisica(ExemplarFisico obra) {
    	for (int i = 0; i < obra.getNumTotalCopias(); i++) {
	    	if (getNumObras() < obrasFisicas.length) {
	    		obrasFisicas[getNumObras()] = obra;
	    		setNumObras(getNumObras()+1);
	    	}
	    	else {
	    		System.out.println("Estante cheia! o livro não foi adicionado.");
    	}
    	}
    }
}