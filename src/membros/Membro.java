package membros;

public abstract class Membro {
    private final String nome;
    private final long idFaculdade;
    private final String endereco;
    private final String contato;
    private final String dataDeRegistro;

    // Construtor
    public Membro(String nome, long idFaculdade, String endereco, String contato,
    		String dataDeRegistro) {
        this.nome = nome;
        this.idFaculdade = idFaculdade;
        this.endereco = endereco;
        this.contato = contato;
        this.dataDeRegistro = dataDeRegistro;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }
    
    public long getIdFaculdade() {
        return idFaculdade;
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
}