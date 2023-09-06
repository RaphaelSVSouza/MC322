package biblioteca;

import obras.Obra;
import java.util.ArrayList;

public class EstanteVirtual extends Estante {	
	ArrayList<Obra> ebooks;
	
	//Construtor
	public EstanteVirtual() {
		ebooks = new ArrayList<Obra>();
	}
	
	//Outros métodos
    public void addObraEletronica(Obra obra){
    	ebooks.add(obra);
    	setNumObras(getNumObras()+1);
    }
}