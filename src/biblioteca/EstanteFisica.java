package biblioteca;

import obras.fisico.ExemplarFisico;

public class EstanteFisica extends Estante {	
	ExemplarFisico[] obrasFisicas;
	
	//Construtor
	public EstanteFisica() {
		obrasFisicas = new ExemplarFisico[50];
	}
	
	//Getters & Setters
    public ExemplarFisico[] getObrasFisicas() {
        return obrasFisicas;
    }

    public void setObras(ExemplarFisico[] obrasFisicas) {
        this.obrasFisicas = obrasFisicas;
    }
	
	//Outros métodos
    public void addObraFisica(ExemplarFisico obra) {
    	for (int i = 0; i < obra.getNumExemplares(); i++) {
	    	if (getNumObrasFisicas() < obrasFisicas.length) {
	    		obrasFisicas[getNumObrasFisicas()] = obra;
	    		setNumObrasFisicas(getNumObrasFisicas()+1);
	    		System.out.println("exemplar número " + i + " adicionado!");
	    	}
	    	else {
	    		System.out.println("Estante cheia! o livro não foi adicionado.");
    	}
    	}
    }
}