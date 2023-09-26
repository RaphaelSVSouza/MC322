package biblioteca.controllers.atividades;

import biblioteca.models.membros.Membro;;

public class Reserva<T> {
    private T item; 
    private Membro membro;

    public Reserva(T item, Membro membro) {
        this.item = item;
        this.membro = membro;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Membro getMembro() {
        return this.membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    
}
