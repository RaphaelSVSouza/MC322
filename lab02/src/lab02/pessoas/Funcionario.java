package pessoas;

public class Funcionario extends Pessoa{
    private String funcao;

    // Construtor
    public Funcionario(String nome, long cpf, String funcao){
        super(nome, cpf);
        this.funcao = funcao;
    }

    //Getters & Setters
    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}