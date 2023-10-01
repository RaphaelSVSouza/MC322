package biblioteca.controllers.excecoes;

public class ExcecaoMembroComMultas extends Exception {

    public ExcecaoMembroComMultas() {
        super("Desculpe, você possui multas pendentes e não pode realizar um empréstimo.");
    }
}
