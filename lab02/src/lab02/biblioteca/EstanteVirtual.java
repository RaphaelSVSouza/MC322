package biblioteca;

import obras.Obra;
import java.util.ArrayList;

public class EstanteVirtual extends Estante {	
	ArrayList<Obra> obrasEletronicas;
	
	//Construtor
	public EstanteVirtual() {
		obrasEletronicas = new ArrayList<Obra>();
	}
	
	//Outros métodos
    public void addObraEletronica(Obra obra){
    	obrasEletronicas.add(obra);
    	setNumObrasEletronicas(getNumObrasEletronicas()+1);
    }
}