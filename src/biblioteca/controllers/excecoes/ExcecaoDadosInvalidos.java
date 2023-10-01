package biblioteca.controllers.excecoes;

public class ExcecaoDadosInvalidos extends Exception {

    public ExcecaoDadosInvalidos() {
        super("Os dados fornecidos para o item são inválidos.");
    }
}
