package biblioteca.models.membro.Funcionarios;


import biblioteca.controllers.sistema.Relatorio;

public interface Gerencia {
	void gerenciarInfoObras();
	void aplicarMultas();
	void ajustarMulta();
	Relatorio gerarRelatorio();
}
