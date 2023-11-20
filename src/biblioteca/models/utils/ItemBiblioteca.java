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

}

