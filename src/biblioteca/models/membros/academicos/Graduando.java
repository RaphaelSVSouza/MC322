package biblioteca.models.membros.academicos;

public class Graduando extends Academico {
	private int numEmprestimos;
	static private int maxEmprestimos = 3;
    static private int prazoDevolucao = 15;
    static private double multaAtraso = 1.00;
	
	public Graduando(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
		numEmprestimos = 0;
	}
	
	public int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	Graduando.maxEmprestimos = maxEmprestimos;
    }

    @Override
    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	Graduando.prazoDevolucao = prazoDevolucao;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	Graduando.multaAtraso = multaAtraso;
    }

	@Override
	public int getNumEmprestimos() {
		return numEmprestimos;
	}
	
	@Override
	public void setNumEmprestimos(int numEmprestimos) {
		this.numEmprestimos = numEmprestimos;
	}
}
