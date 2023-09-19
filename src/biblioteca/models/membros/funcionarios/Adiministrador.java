package biblioteca.models.membros.funcionarios;

import biblioteca.controllers.atividades.Relatorio;

public class Adiministrador extends Funcionario implements Gerencia{
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
		return null;
		// TODO Auto-generated method stub
	}
	
	public void cadastrarMembros() {
		// TODO 
	}
	
	public void cadastrarObras() {
		// TODO
	}
}
