package biblioteca.models.repositorios;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import biblioteca.controllers.atividades.*;

public class RepositorioAtividades {
	private Set<Emprestimo> emprestimos = new TreeSet<>();
	private List<Renovacao> renovacoes = new LinkedList<>();
	private List<Reserva> reservas = new LinkedList<>();
	private List<Devolucao> devolucoes = new LinkedList<>();
	
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

    public Set<Emprestimo> getEmprestimos() {
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
