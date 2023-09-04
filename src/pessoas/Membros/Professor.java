package pessoas.Membros;

public class Professor extends Membro {
    static private int maxEmprestimos = 7;
    static private int prazoDevolucao = 30;
    static private double multaAtraso = 0.50;
	
	public Professor(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
	
	public static int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	Professor.maxEmprestimos = maxEmprestimos;
    }

    public static int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	Professor.prazoDevolucao = prazoDevolucao;
    }

    public static double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	Professor.multaAtraso = multaAtraso;
    }
}
