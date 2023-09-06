package membros.Funcionarios;

import biblioteca.sistema.Relatorio;
import membros.Membro;
import membros.Academico.*;
import membros.Funcionarios.*;
import repositorios.RepositorioMembros;

public class Adiministrador extends Funcionario implements Gerencia{
	public Adiministrador(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
	
	public void cadastrarMembros(Membro membro) {
		if (membro instanceof Graduando) {
	        Graduando graduando = (Graduando) membro;
	        RepositorioMembros.adicionarGraduando(graduando);
	    } else if (membro instanceof PosGraduando) {
	        PosGraduando posGraduando = (PosGraduando) membro;
	        RepositorioMembros.adicionarPosGraduando(posGraduando); // Supondo que exista um método correspondente para PosGraduando.
	    } else if (membro instanceof Professor) {
	        Professor professor = (Professor) membro;
	        RepositorioMembros.adicionarProfessor(professor); // Supondo que exista um método correspondente para Professor.
	    } else if (membro instanceof Adiministrador) {
	        Adiministrador administrador = (Adiministrador) membro;
	        RepositorioMembros.adicionarAdiministrador(administrador); // Supondo que exista um método correspondente para Administrador.
	    } else if (membro instanceof Atendente) {
	        Atendente atendente = (Atendente) membro;
	        RepositorioMembros.adicionarAtendente(atendente); // Supondo que exista um método correspondente para Atendente.
	    } else if (membro instanceof Gerente) {
	        Gerente gerente = (Gerente) membro;
	        RepositorioMembros.adicionarGerente(gerente); // Supondo que exista um método correspondente para Gerente.
	    }
        
	}

	@Override
	public void gerenciarInfoObras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarMulta() {
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
	
	public void cadastrarObras() {
		// TODO
	}
}
