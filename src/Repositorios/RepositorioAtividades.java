package Repositorios;

import java.util.ArrayList;
import java.util.List;

import biblioteca.sistema.*;

public class RepositorioAtividades {
	private List<Emprestimo> emprestimos = new ArrayList<>();
	private List<Devolucao> devolucoes = new ArrayList<>();
	private List<Renovacao> renovacoes = new ArrayList<>();
	private List<Reserva> reservas = new ArrayList<>();
	
	public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void adicionarDevolucao(Devolucao devolucao) {
        devolucoes.add(devolucao);
    }

    public void adicionarRenovacao(Renovacao renovacao) {
        renovacoes.add(renovacao);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public List<Devolucao> getDevolucoes() {
        return devolucoes;
    }

    public List<Renovacao> getRenovacoes() {
        return renovacoes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
