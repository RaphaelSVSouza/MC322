package biblioteca.controllers.excecoes;

public class ExcecaoItemNaoDisponivel extends Exception {

    public ExcecaoItemNaoDisponivel() {
        super("Desculpe, o item solicitado não está disponível no momento.");
    }
}
