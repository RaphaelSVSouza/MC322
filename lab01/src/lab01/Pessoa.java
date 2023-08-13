package lab01;

public class Pessoa {
    private final String nome;
    private final long cpf;

    // Construtor
    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Getters & Setters
    public String getNome() {
        return nome;
    }
    
    public long getCPF() {
        return cpf;
    }
}