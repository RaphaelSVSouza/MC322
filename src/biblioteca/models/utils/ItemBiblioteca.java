package biblioteca.models.utils;

import java.util.LinkedList;
import java.util.List;

import biblioteca.models.itensmultimidia.ItemMultimidia;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private List<T> itensReservados;
    private List<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    public ItemBiblioteca() {
        this.itensReservados = new LinkedList<>();
        this.itensEmprestados = new LinkedList<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDeItensReservados = 0;
    }

    // Métodos getters e setters para os atributos
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

    public void setNumeroDeItensReservados(int numeroDeItensReservados) {
        this.numeroDeItensReservados = numeroDeItensReservados;
    }

    // Outros métodos da classe
}

