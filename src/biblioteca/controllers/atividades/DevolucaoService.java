package biblioteca.controllers.atividades;

import biblioteca.controllers.excecoes.ExcecaoItemDanificado;
import biblioteca.controllers.excecoes.ExcecaoItemNaoEmprestado;
import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;
import biblioteca.models.utils.ItemBiblioteca;

public class DevolucaoService<T extends ItemMultimidia> {
	public boolean devolverItem(Emprestimo<T> emprestimo, ItemBiblioteca<T> itens, boolean precisaDeManutencao) {
        T item = emprestimo.getItem();
        Membro membro = emprestimo.getMembro();
        
        try {
        	// verifica se houve o emprestimo
            if (! (itens.getItensEmprestados().possuiEmprestimo(item) && itens.getItensEmprestados().getCliente(item) == membro)) {
            	throw new ExcecaoItemNaoEmprestado();
            }
            
            // verifica se o livro precisa de manutencao
            if (precisaDeManutencao) {
            	throw new ExcecaoItemDanificado();
            }
        }
        catch (ExcecaoItemNaoEmprestado e) {
        	e.getMessage();
        	return false;
        } catch (ExcecaoItemDanificado e) {
        	e.getMessage();
        	return false;
		}
    
        itens.getItensEmprestados().removerEmprestimo(emprestimo);
        System.out.println(item.getTitulo() + " devolvido por " + membro.getNome());
        return true;
    }
}
