package biblioteca.models.estantes;

import java.util.ArrayList;

import biblioteca.models.itensmultimidia.ItemMultimidia;

public class EstanteVirtual extends Estante {	
	ArrayList<ItemMultimidia> urls;
	
	//Construtor
	public EstanteVirtual() {
		urls = new ArrayList<ItemMultimidia>();
	}
	
	//Outros métodos
    public void addObraEletronica(ItemMultimidia obra){
    	urls.add(obra);
    	setNumObras(getNumObras()+1);
    }
}