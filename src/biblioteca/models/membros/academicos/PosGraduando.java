package biblioteca.models.membros.academicos;

public class PosGraduando extends Academico {
    static private int maxEmprestimos = 5;
    static private int prazoDevolucao = 20;
    static private double multaAtraso = 1.00;
	
	public PosGraduando(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
	
	public static int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	PosGraduando.maxEmprestimos = maxEmprestimos;
    }

    public static int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	PosGraduando.prazoDevolucao = prazoDevolucao;
    }

    public static double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	PosGraduando.multaAtraso = multaAtraso;
    }
}
