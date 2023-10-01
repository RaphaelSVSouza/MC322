package biblioteca.models.membros.academicos;

public class Professor extends Academico {
	private int numEmprestimos;
	private double montanteMulta;
    static private int maxEmprestimos = 7;
    static private int prazoDevolucao = 30;
    static private double multaAtraso = 0.50;
	
	public Professor(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
		numEmprestimos = 0;
		montanteMulta = 0;
	}
	
	public int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	Professor.maxEmprestimos = maxEmprestimos;
    }

    @Override
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	Professor.prazoDevolucao = prazoDevolucao;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	Professor.multaAtraso = multaAtraso;
    }

	@Override
	public int getNumEmprestimos() {
		return numEmprestimos;
	}
	
	@Override
	public void setNumEmprestimos(int numEmprestimos) {
		this.numEmprestimos = numEmprestimos;
	}

	@Override
	public double getMontanteMulta() {
		return montanteMulta;
	}

	@Override
	public void setMontanteMulta(double montanteMulta) {
		this.montanteMulta = montanteMulta;
	}
}
