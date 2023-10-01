package biblioteca.models.utils;

import java.util.LinkedList;
import biblioteca.models.membros.Membro;
import java.util.List;
import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.controllers.atividades.Reserva;
import biblioteca.controllers.excecoes.*;

public class ItemBiblioteca<T extends ItemMultimidia> {
	private List<T> itens;
    private ListaReservas<T> reservas;
    private ListaEmprestimos<T> emprestimos;
    private int numeroDeItensEmprestados;
    private int numeroDereservas;

    public ItemBiblioteca() {
    	this.itens = new LinkedList<>();
        this.reservas = new ListaReservas<>();
        this.emprestimos = new ListaEmprestimos<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDereservas = 0;
    }

    // getters e setters
	public List<T> getItens() {
		return itens;
	}
    
    public ListaReservas<T> getReservas() {
        return reservas;
    }

    public void setreservas(ListaReservas<T> reservas) {
        this.reservas = reservas;
    }

    public ListaEmprestimos<T> getItensEmprestados() {
        return emprestimos;
    }

    public void setItensEmprestados(ListaEmprestimos<T> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }

    public void setNumeroDeItensEmprestados(int numeroDeItensEmprestados) {
        this.numeroDeItensEmprestados = numeroDeItensEmprestados;
    }

    public int getNumeroDereservas() {
        return numeroDereservas;
    }

    // Outros métodos da classe
    public void addItem(T item) {
        this.itens.add(item);
    }
    
    
    public Emprestimo<T> emprestarItem(T item, Membro membro) {
    	try {
    		// verifica se o membro ja excedeu o limite de empréstimos
    		if (membro.getNumEmprestimos() >= membro.getMaxEmprestimos()) {
    			throw new ExcecaoLimiteEmprestimoExcedido();
    		}
    		
            // Verificar se o item está na lista de itens reservados
            if (reservas.possuiReserva(item)) {
                throw new ExcecaoItemNaoDisponivel();
            }
            
            // Verificar se o item já está sob empréstimo
            if (emprestimos.possuiEmprestimo(item)) {
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
        emprestimos.addEmprestimo(emprestimo);
        System.out.println(emprestimo.getItem().getTitulo() + " emprestado para " + membro.getNome() +
                            " até " + emprestimo.getDataDevolucao());
        this.numeroDeItensEmprestados++;
        return emprestimo;
    }

    public boolean reservarItem(T item, Membro membro) {
        Reserva<T> reserva = new Reserva<>(item, membro);
        if (reservas.possuiReserva(item)) {
            System.out.println("O item já está reservado");
            return false;
        }

        reservas.addReserva(reserva);
        System.out.println(item.getTitulo() + " reservado para " + membro.getNome());
        return true;
    }

    public boolean devolverItem(Emprestimo<T> emprestimo, boolean precisaDeManutencao) {
        T item = emprestimo.getItem();
        Membro membro = emprestimo.getMembro();
        
        try {
        	// verifica se houve o emprestimo
            if (! (emprestimos.possuiEmprestimo(item) && emprestimos.getCliente(item) == membro)) {
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
    
        emprestimos.removerEmprestimo(emprestimo);
        System.out.println(item.getTitulo() + " devolvido por " + membro.getNome());
        return true;
    }

}

