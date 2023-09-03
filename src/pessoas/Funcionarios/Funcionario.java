package pessoas.Funcionarios;

import pessoas.Pessoa;

public class Funcionario extends Pessoa implements AtividadesBasicas{
	public Funcionario(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}

	@Override
	public void realizarEmprestimo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarDevolucao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarRenovacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarReserva() {
		// TODO Auto-generated method stub
		
	}
}
