package biblioteca.models.utils;

import java.util.LinkedList;
import java.util.List;

import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.models.membros.Membro;

public class ListaEmprestimos<T> {
	private List<Emprestimo<T>> emprestimos = new LinkedList<>();
	private int numEmprestimos;
	
	// Getters
	public int getNumEmprestimos() {
		return numEmprestimos;
	}

	public List<Emprestimo<T>> getEmprestimos() {
		return emprestimos;
	}	

	//métodos variados
	public void addEmprestimo(Emprestimo<T> emprestimo) {
		emprestimos.add(emprestimo);
		this.numEmprestimos++;
	}

	public boolean removerEmprestimo(Emprestimo<T> emprestimo) {
		this.numEmprestimos--;	
		return emprestimos.remove(emprestimo);
	}

	public boolean possuiEmprestimo(T item) {
		for (Emprestimo<T> emprestimo : emprestimos) {
			if (emprestimo.getItem().equals(item) && emprestimo.isAtivo()) {
				return true;
			}
		}
		return false;
	}

	public Membro getCliente(T item) {
		for(Emprestimo<T> emprestimo: emprestimos) {
			if(emprestimo.getItem().equals(item)) {
				return emprestimo.getMembro();
			}
		}
		return null;
	}

}
