package pessoas;

public class Servidor extends Pessoa{
    private String funcao;

    // Construtor
    public Servidor(String nome, long cpf, String funcao){
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