package biblioteca.models.utils;

import java.util.LinkedList;
import biblioteca.models.membros.Membro;
import java.util.List;

import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.controllers.atividades.*;

public class ItemBiblioteca<T extends ItemMultimidia> {
	private List<T> itens;
    private List<T> itensReservados;
    private List<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    public ItemBiblioteca() {
    	this.itens = new LinkedList<>();
        this.itensReservados = new LinkedList<>();
        this.itensEmprestados = new LinkedList<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDeItensReservados = 0;
    }

    // getters e setters
	public List<T> getItens() {
		return itens;
	}
    
    public List<T> getItensReservados() {
        return itensReservados;
    }

    public void setItensReservados(List<T> itensReservados) {
        this.itensReservados = itensReservados;
    }

    public List<T> getItensEmprestados() {
        return itensEmprestados;
    }

    public void setItensEmprestados(List<T> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    public int getNumeroDeItensEmprestados() {
        return numeroDeItensEmprestados;
    }

    public void setNumeroDeItensEmprestados(int numeroDeItensEmprestados) {
        this.numeroDeItensEmprestados = numeroDeItensEmprestados;
    }

    public int getNumeroDeItensReservados() {
        return numeroDeItensReservados;
    }

    // Outros métodos da classe
    public void addItem(T item) {
        this.itens.add(item);
    }
    
    public void addItemReservados(int numeroDeItensReservados) {
        this.numeroDeItensReservados = numeroDeItensReservados + 1;
    }
    
    public boolean reservarItem(T item, Membro membro) {
    	
    	return true;
    }
    
    public Emprestimo<T> emprestarItem(T item, Membro membro) {
        Emprestimo<T> emprestimo = new Emprestimo<>(item, membro);
        System.out.println(emprestimo.getItem() + " emprestado para " + membro.getNome() +
                            " até " + emprestimo.getDataDevolucao());
        return emprestimo;
    }

	public boolean devolverItem(T item, Membro membro) {
	
	
		return true;
	}


}

