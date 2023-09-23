package biblioteca.models.utils;

import java.util.LinkedList;
import java.util.List;

import biblioteca.controllers.atividades.Emprestimo;
import biblioteca.models.membros.Membro;

public class ListaEmprestimos<T> {
	private List<Emprestimo<T>> lista = new LinkedList<>();
	private int numEmprestimos;
	
//	//construtor
//	public ListaEmprestimos(T item) {
//		lista = new LinkedList<>();
//	}
	
	//getters e setters
	public int getNumEmprestimos() {
		return numEmprestimos;
	}
	
	//métodos variados
	public void addEmprestimo(Emprestimo<T> emprestimo) {
		lista.add(emprestimo);
		this.numEmprestimos++;
	}

//	public List<T> getEmprestimosByMembro(Membro membro) {
//		for ()
//	}
}