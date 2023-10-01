package biblioteca.controllers.excecoes;

public class ExcecaoPermissaoNegada extends Exception {

    public ExcecaoPermissaoNegada() {
        super("Você não tem permissão para acessar essa funcionalidade.");
    }
}
