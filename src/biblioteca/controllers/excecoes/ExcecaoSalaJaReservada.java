package biblioteca.controllers.excecoes;

public class ExcecaoSalaJaReservada extends Exception {

    public ExcecaoSalaJaReservada() {
        super("A sala já está reservada no horário solicitado.");
    }
}
