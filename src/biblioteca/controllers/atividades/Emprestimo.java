package biblioteca.controllers.atividades;

import java.time.LocalDate;
import java.util.List;

import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;

public class Emprestimo<T> { 
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private final T item;
    private final Membro membro; 
    private boolean ativo;

    // Construtor
    public Emprestimo(T item, Membro membro) {
        this.dataEmprestimo = LocalDate.now();
        this.membro = membro;
        this.dataDevolucao = dataEmprestimo.plusDays(membro.getPrazoDevolucao());
        this.item = item; 
        this.ativo = true;
    }


    // Getters & Setters
    public boolean isAtivo() {
        return ativo;
    }

    public void encerrarEmprestimo() {
        this.ativo = false;
    }
    
    public Membro getMembro() {
        return this.membro;
    }
    
    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public T getItem() {
        return this.item;
    }

    // public List<Renovacao> getRenovacoes() {
    //     return this.renovacoes;
    // }

//    public void setRenovacoes(List<Renovacao> renovacoes) {
//        this.renovacoes = renovacoes;
//    }
}
