package biblioteca.controllers.excecoes;

public class ExcecaoItemDuplicado extends Exception {

    public ExcecaoItemDuplicado() {
        super("Este item já está cadastrado na base de dados.");
    }
}
