package biblioteca.controllers.excecoes;

public class ExcecaoItemNaoEmprestado extends Exception {

    public ExcecaoItemNaoEmprestado() {
        super("Você não pode devolver um item que não foi emprestado por você.");
    }
}
