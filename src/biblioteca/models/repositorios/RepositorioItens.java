package biblioteca.models.repositorios;

import java.util.Map;
import java.util.TreeMap;

import biblioteca.models.itensmultimidia.ItemMultimidia;

public class RepositorioItens {
	Map<Integer, ItemMultimidia> obras = new TreeMap<>();
	
	public void adicionarObra(ItemMultimidia obra) {
		obras.put(obra.getId(), obra);
	}
	
	public ItemMultimidia getObraById(int id) {
		return obras.get(id); 
	}
}
