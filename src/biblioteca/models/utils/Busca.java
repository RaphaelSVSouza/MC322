package biblioteca.models.utils;

import java.util.List;
import biblioteca.models.itensmultimidia.ItemMultimidia;

public interface Busca {
	List<ItemMultimidia> executar(String termo);
}

