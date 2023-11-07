package biblioteca.models.membros.funcionarios;

import biblioteca.controllers.atividades.Relatorio;

public class Adiministrador extends Funcionario implements Gerencia{
	public Adiministrador(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
}
