package biblioteca.models.repositorios;

import java.util.Map;
import java.util.TreeMap;
import biblioteca.models.obras.Obra;

public class RepositorioObras {
	Map<Integer, Obra> obras = new TreeMap<>();
	
	public void adicionarObra(Obra obra) {
		obras.put(obra.getId(), obra);
	}
	
	public Obra getObraById(int id) {
		return obras.get(id); 
	}
}
