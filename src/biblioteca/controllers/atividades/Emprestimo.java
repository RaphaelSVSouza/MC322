package biblioteca.controllers.atividades;

import java.time.LocalDate;
import java.util.List;
import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;

public class Emprestimo { 
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private final ItemMultimidia item;
    private final Membro membro; 
    private List<Renovacao> renovacoes;

    // Construtor
    public Emprestimo(ItemMultimidia item, Membro membro) {
        this.dataEmprestimo = LocalDate.now();
        this.membro = membro;
        this.dataDevolucao = dataEmprestimo.plusDays(membro.getPrazoDevolucao());
        this.item = item; 
    }


    // Getters & Setters
    public Membro getMembroEmprestimo() {
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

    public ItemMultimidia getItem() {
        return this.item;
    }

    public List<Renovacao> getRenovacoes() {
        return this.renovacoes;
    }

    public void setRenovacoes(List<Renovacao> renovacoes) {
        this.renovacoes = renovacoes;
    }
}
