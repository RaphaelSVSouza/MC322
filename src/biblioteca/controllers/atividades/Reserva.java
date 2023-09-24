package biblioteca.controllers.atividades;

import biblioteca.models.membros.Membro;;

public class Reserva<T> {
    private T item; 
    private Membro membro;

    public Reserva(Membro membro, T item) {
        this.item = item;
        this.membro = membro;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Membro getMembros() {
        return this.membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    
}
