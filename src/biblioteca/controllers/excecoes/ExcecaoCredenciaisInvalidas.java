package biblioteca.controllers.excecoes;

public class ExcecaoCredenciaisInvalidas extends Exception {

    public ExcecaoCredenciaisInvalidas() {
        super("Credenciais de login inválidas. Por favor, verifique seus dados.");
    }
}
