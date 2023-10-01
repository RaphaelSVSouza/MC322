package biblioteca.models.membros;

public abstract class Membro {
    private final String nome;
    private final long id;
    private final String endereco;
    private final String contato;
    private final String dataDeRegistro;

    // Construtor
    public Membro(String nome, long idFaculdade, String endereco, String contato,
    		String dataDeRegistro) {
        this.nome = nome;
        this.id = idFaculdade;
        this.endereco = endereco;
        this.contato = contato;
        this.dataDeRegistro = dataDeRegistro;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }
    
    public long getId() {
        return id;
    }
    
    public String getEndereco() {
    	return endereco;
    }
    
    public String getContato() {
    	return contato;
    }
    
    public String getDataDeRegistro() {
    	return dataDeRegistro;
    }
	
	//métodos abstratos
	
	public abstract int getPrazoDevolucao();
	public abstract int getNumEmprestimos();
	public abstract int getMaxEmprestimos();
	public abstract double getMontanteMulta();
	public abstract void setMontanteMulta(double montanteMulta);
	public abstract double getMultaAtraso();
	public abstract void setNumEmprestimos(int numEmprestimos);
}