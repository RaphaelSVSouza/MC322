package biblioteca.models.membros.academicos;

import biblioteca.models.membros.Membro;

public class Academico extends Membro {
	
	public Academico(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}

}
