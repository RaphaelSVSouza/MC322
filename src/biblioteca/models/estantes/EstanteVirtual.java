package biblioteca.models.estantes;

import java.util.ArrayList;

import biblioteca.models.obras.Obra;

public class EstanteVirtual extends Estante {	
	ArrayList<Obra> urls;
	
	//Construtor
	public EstanteVirtual() {
		urls = new ArrayList<Obra>();
	}
	
	//Outros métodos
    public void addObraEletronica(Obra obra){
    	urls.add(obra);
    	setNumObras(getNumObras()+1);
    }
}