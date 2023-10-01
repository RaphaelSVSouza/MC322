package biblioteca.models.membros.academicos;

public class PosGraduando extends Academico {
	private int numEmprestimos;
	private double montanteMulta;
    static private int maxEmprestimos = 5;
    static private int prazoDevolucao = 20;
    static private double multaAtraso = 1.00;
	
	public PosGraduando(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
		numEmprestimos = 0;
		montanteMulta = 0;
	}
	
	public int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	PosGraduando.maxEmprestimos = maxEmprestimos;
    }

    @Override
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	PosGraduando.prazoDevolucao = prazoDevolucao;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	PosGraduando.multaAtraso = multaAtraso;
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
