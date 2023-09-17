package biblioteca.controllers.atividades;

public class Comentario {
    private int membroId;
    private int itemId;
    private String texto;

    public Comentario(int membroId, int itemId, String texto) {
        this.membroId = membroId;
        this.itemId = itemId;
        this.texto = texto;
    }

    public int getMembroId() {
        return membroId;
    }

    public void setMembroId(int membroId) {
        this.membroId = membroId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Comentario [membroId=" + membroId + ", itemId=" + itemId + ", texto=" + texto + "]";
    }
}