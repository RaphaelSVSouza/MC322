package biblioteca.models.utils;

import java.util.LinkedList;
import biblioteca.models.membros.Membro;
import java.util.List;

import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.controllers.atividades.*;
import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.controllers.atividades.Reserva;
import biblioteca.models.membros.Membro;
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
    
    public List<T> getreservas() {
        return reservas;
    }

    public void setreservas(List<T> reservas) {
        this.reservas = reservas;
    }

    public List<T> getItensEmprestados() {
        return emprestimos;
    }

    public void setItensEmprestados(List<T> emprestimos) {
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
        // Verificar se o item está na lista de itens reservados
        if (reservas.possuiReserva(item)) {
            System.out.println(item + " já está reservado e não pode ser emprestado.");
            return null;
        }

        if (emprestimos.possuiEmprestimo(item)){
            System.out.println(item + " sob empréstimo até " + emprestimo.getItem().getDataDevolucao());
            return null;
        }

        Emprestimo<T> emprestimo = new Emprestimo<>(item, membro);
        emprestimos.addEmprestimo(emprestimo);
        System.out.println(emprestimo.getItem() + " emprestado para " + membro.getNome() +
                            " até " + emprestimo.getDataDevolucao());
        this.numeroDeItensEmprestados++;
        return emprestimo;
    }

    public boolean reservarItem(T item, Membro membro) {
        Reserva<T> reserva = new Reserva<>(item, membro);
        if (reservas.possuiReserva(reserva)) {
            System.out.println("O item já está reservado");
            return false;
        }

        reservas.addReserva(reserva, membro);
        System.out.println(item + " reservado para " + membro.getNome());

    }

	public boolean devolverItem(T item, Membro membro) {
        if(emprestimos.possuiEmprestimo(item) && emprestimos.getCliente(item) == membro) {
            emprestimos.removerEmprestimo(item);
            System.out.println(item + " devolvido por " + membro.getNome());
            return true;
        }
        
        System.out.println(item + " não pode ser devolvido");
		return false;
	}


}

