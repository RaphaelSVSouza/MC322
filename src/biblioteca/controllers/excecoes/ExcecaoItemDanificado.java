package biblioteca.controllers.excecoes;

public class ExcecaoItemDanificado extends Exception {

    public ExcecaoItemDanificado() {
        super("O item está danificado e precisa de manutenção antes da devolução.");
    }
}
