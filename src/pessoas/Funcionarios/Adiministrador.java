package pessoas.Funcionarios;

import biblioteca.sistema.Relatorio;

public class Adiministrador extends Funcionario implements GerenciaAvancada{
	public Adiministrador(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}

	@Override
	public void gerenciarInfoObras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarMultas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarMulta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Relatorio gerarRelatorio() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void cadastrarMembros() {
		// TODO 
	}
	
	public void cadastrarObras() {
		// TODO
	}
}
