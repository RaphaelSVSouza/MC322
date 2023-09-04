package biblioteca.sistema;

import java.time.LocalDate;
import java.util.List;
import obras.Obra;
import pessoas.*;
import pessoas.Membros.*;
import pessoas.Funcionarios.*;

public class Emprestimo { 
    private final LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private final Obra obra;
    private final Pessoa pessoa; 
    private List<Renovacao> renovacoes;

    // Construtor
    public Emprestimo(Obra obra, Pessoa pessoa, LocalDate dataEmprestimo) {
        this.dataEmprestimo = LocalDate.now();
        
        if (pessoa instanceof Graduando) {
        	this.dataDevolucao = dataEmprestimo.plusDays(Graduando.getPrazoDevolucao());
        } else if (pessoa instanceof PosGraduando) {
        	this.dataDevolucao = dataEmprestimo.plusDays(PosGraduando.getPrazoDevolucao());
        } else if (pessoa instanceof Professor) {
        	this.dataDevolucao = dataEmprestimo.plusDays(Professor.getPrazoDevolucao());
        } else if (pessoa instanceof Funcionario) {
        	this.dataDevolucao = dataEmprestimo.plusDays(Funcionario.getPrazoDevolucao());
        } 
        
        this.obra = obra;
        this.pessoa = pessoa;
    }


    // Getters & Setters
    public Pessoa getPessoaEmprestimo() {
        return this.pessoa;
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

    public Obra getObra() {
        return this.obra;
    }

    public List<Renovacao> getRenovacoes() {
        return this.renovacoes;
    }

    public void setRenovacoes(List<Renovacao> renovacoes) {
        this.renovacoes = renovacoes;
    }
}
