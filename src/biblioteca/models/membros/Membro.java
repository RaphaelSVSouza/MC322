package biblioteca.models.membros;

import java.util.List;
import java.util.LinkedList;
import biblioteca.controllers.atividades.Emprestimo;

public abstract class Membro {
    private final String nome;
    private final long id;
    private final String endereco;
    private final String contato;
    private final String dataDeRegistro;
    
    private List<Emprestimo> emprestimos = new LinkedList<>();

    // Construtor
    public Membro(String nome, long idFaculdade, String endereco, String contato,
    		String dataDeRegistro) {
        this.nome = nome;
        this.id = idFaculdade;
        this.endereco = endereco;
        this.contato = contato;
        this.dataDeRegistro = dataDeRegistro;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }
    
    public long getId() {
        return id;
    }
    
    public String getEndereco() {
    	return endereco;
    }
    
    public String getContato() {
    	return contato;
    }
    
    public String getDataDeRegistro() {
    	return dataDeRegistro;
    }

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void adicionarEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}
	
	public void removerEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.remove(emprestimo);
	}
	
	//métodos abstratos
	
	public abstract int getPrazoDevolucao();
}