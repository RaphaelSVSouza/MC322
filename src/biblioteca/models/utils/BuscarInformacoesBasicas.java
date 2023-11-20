package biblioteca.models.utils;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.itensmultimidia.ItemMultimidia;

public class BuscarInformacoesBasicas implements Busca{
	
	private List<ItemMultimidia> itens;

    public BuscarInformacoesBasicas(List<ItemMultimidia> itens) {
        this.itens = itens;
    }
	
    public List<ItemMultimidia> executar(String termo) {
    	List<ItemMultimidia> resultados = new ArrayList<>();

        for (ItemMultimidia item : itens) {
            // Condição de busca (pode ser por título, autor, gênero, etc.)
        	if (String.valueOf(item.getId()).contains(termo) ||
                    item.getTitulo().toLowerCase().contains(termo.toLowerCase()) ||
                    item.getAutor().toLowerCase().contains(termo.toLowerCase()) ||
                    item.getEditora().toLowerCase().contains(termo.toLowerCase()) ||
                    String.valueOf(item.getAno()).contains(termo) ||
                    item.getSinopse().toLowerCase().contains(termo.toLowerCase())) {
                    resultados.add(item);
                }
        }

        return resultados;
    }
}

