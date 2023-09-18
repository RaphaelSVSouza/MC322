package biblioteca.models.repositorios;

import java.util.Set;
import java.util.HashSet;
import biblioteca.models.obras.Obra.Categoria;;

public class RepositorioOutros {
	Set<Categoria> categorias = new HashSet<>();
	
    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }
}
