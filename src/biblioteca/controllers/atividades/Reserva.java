package biblioteca.controllers.atividades;

import biblioteca.models.membros.Membro;;

public class Reserva<T> {
    private T item; 
    private Membro pessoa;
    private boolean reservado;

    public Reserva(Membro pessoa, T item) {
        this.item = item;
        this.pessoa = pessoa;
        this.reservado = true;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Membro getMembros() {
        return this.pessoa;
    }

    public void setPessoa(Membro pessoa) {
        this.pessoa = pessoa;
    }

    public boolean isReservado() {
        return this.reservado;
    }

    public boolean getReservado() {
        return this.reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void cancelarReserva() {
        this.reservado = false;
    }
    
}
