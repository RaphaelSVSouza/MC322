package biblioteca.controllers.atividades;

import biblioteca.controllers.excecoes.ExcecaoItemNaoDisponivel;
import biblioteca.controllers.excecoes.ExcecaoLimiteEmprestimoExcedido;
import biblioteca.controllers.excecoes.ExcecaoMembroComMultas;
import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;
import biblioteca.models.utils.ItemBiblioteca;

public class EmprestimoService<T extends ItemMultimidia> {
	public Emprestimo<T> emprestarItem(T item, ItemBiblioteca<T> itens, Membro membro) {
    	try {
    		// verifica se o membro ja excedeu o limite de empréstimos
    		if (membro.getNumEmprestimos() >= membro.getMaxEmprestimos()) {
    			throw new ExcecaoLimiteEmprestimoExcedido();
    		}
    		
            // Verificar se o item está na lista de itens reservados
            if (itens.getReservas().possuiReserva(item)) {
                throw new ExcecaoItemNaoDisponivel();
            }
            
            // Verificar se o item já está sob empréstimo
            if (itens.getItensEmprestados().possuiEmprestimo(item)) {
            	throw new ExcecaoItemNaoDisponivel();
            }
            
            // verifica se há multas no histórico do membro
            if (membro.getMontanteMulta() > membro.getMultaAtraso()) {
            	throw new ExcecaoMembroComMultas();
            }
    	} 
    	catch (ExcecaoLimiteEmprestimoExcedido e) {
    		System.out.println(e.getMessage());
    		return null;
    	} 
    	catch (ExcecaoItemNaoDisponivel e) {
    		System.out.println(e.getMessage());
    		return null;
		} 
    	catch (ExcecaoMembroComMultas e) {
			System.out.println(e.getMessage());
    		return null;
		}
    	
    	membro.setNumEmprestimos(membro.getNumEmprestimos()+1);
        Emprestimo<T> emprestimo = new Emprestimo<>(item, membro);
        itens.getItensEmprestados().addEmprestimo(emprestimo);
        System.out.println(emprestimo.getItem().getTitulo() + " emprestado para " + membro.getNome() +
                            " até " + emprestimo.getDataDevolucao());
        itens.setNumeroDeItensEmprestados(itens.getNumeroDeItensEmprestados()+1);;
        return emprestimo;
    }
}
