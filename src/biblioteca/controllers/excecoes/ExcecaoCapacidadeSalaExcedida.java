package biblioteca.controllers.excecoes;

public class ExcecaoCapacidadeSalaExcedida extends Exception {

    public ExcecaoCapacidadeSalaExcedida() {
        super("A capacidade máxima da sala foi excedida.");
    }
}
