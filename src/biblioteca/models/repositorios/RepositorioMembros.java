package biblioteca.models.repositorios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import biblioteca.models.membros.Membro;

public class RepositorioMembros {
    private List<Membro> membros = new ArrayList<>();

    public void adicionarMembro(Membro membro) {
    	membros.add(membro);
    }

    public void removerMembro(Membro membro) {
    	membros.add(membro);
    }

    public Membro getMembroById(long id) {
        Iterator<Membro> iterator = membros.iterator();
        
        while(iterator.hasNext()) {
        	Membro current = iterator.next();
        	if (current.getId() == id) {
        		return current;
        	}
        }
        return null;
    }
}
