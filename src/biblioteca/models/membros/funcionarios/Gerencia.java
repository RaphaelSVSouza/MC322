package biblioteca.models.membros.funcionarios;


import biblioteca.controllers.atividades.Relatorio;

public interface Gerencia {
	void gerenciarInfoObras();
	void aplicarMultas();
	void ajustarMulta();
	Relatorio gerarRelatorio();
}
