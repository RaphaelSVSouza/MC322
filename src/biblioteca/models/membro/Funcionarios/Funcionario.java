package biblioteca.models.membro.Funcionarios;

import biblioteca.models.membros.Membro;

public class Funcionario extends Membro implements Atividades{
    static private int maxEmprestimos = 4;
    static private int prazoDevolucao = 20;
    static private double multaAtraso = 0.75;
	
	public Funcionario(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
	
	public static int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	Funcionario.maxEmprestimos = maxEmprestimos;
    }

    public static int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	Funcionario.prazoDevolucao = prazoDevolucao;
    }

    public static double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	Funcionario.multaAtraso = multaAtraso;
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
