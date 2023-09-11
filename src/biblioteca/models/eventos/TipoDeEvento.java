package biblioteca.models.eventos;

public enum TipoDeEvento {
    
    WORKSHOP("Workshop"),
    PALESTRA("Palestra"),
    EXPOSICAO("exposicao");

    private String evento;

    TipoDeEvento(String evento) {
        this.evento = evento;
    }

    public String getEvento() {
        return this.evento;
    }
    
}
