package lab01;

public class Funcionario extends Pessoa{
    private String funcao;

    // Construtor
    public Funcionario(String nome, long cpf, String funcao){
        super(nome, cpf);
        this.funcao = funcao;
    }
}