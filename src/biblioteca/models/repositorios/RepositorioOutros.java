package biblioteca.models.repositorios;

import java.util.Set;

import biblioteca.models.itensmultimidia.ItemMultimidia.Categoria;

import java.util.HashSet;;

public class RepositorioOutros {
	Set<Categoria> categorias = new HashSet<>();
	
    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }
}
