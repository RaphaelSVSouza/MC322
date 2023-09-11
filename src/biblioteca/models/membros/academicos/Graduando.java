package biblioteca.models.membros.academicos;

public class Graduando extends Academico {
	static private int maxEmprestimos = 3;
    static private int prazoDevolucao = 15;
    static private double multaAtraso = 1.00;
	
	public Graduando(String nome, long idFaculdade, String endereco, String contato,
			String dataDeRegistro) {
		super(nome, idFaculdade, endereco, contato, dataDeRegistro);
	}
	
	public static int getMaxEmprestimos() {
        return maxEmprestimos;
    }

    public static void setMaxEmprestimos(int maxEmprestimos) {
    	Graduando.maxEmprestimos = maxEmprestimos;
    }

    public static int getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public static void setPrazoDevolucao(int prazoDevolucao) {
    	Graduando.prazoDevolucao = prazoDevolucao;
    }

    public static double getMultaAtraso() {
        return multaAtraso;
    }

    public static void setMultaAtraso(double multaAtraso) {
    	Graduando.multaAtraso = multaAtraso;
    }
}
