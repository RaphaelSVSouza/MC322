package biblioteca.controllers.excecoes;

public class ExcecaoLimiteEmprestimoExcedido extends Exception {

	public ExcecaoLimiteEmprestimoExcedido() {
		super("Desculpe, limite de emprestimos excedido.");
	}
}