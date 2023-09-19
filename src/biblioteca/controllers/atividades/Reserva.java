package biblioteca.controllers.atividades;

import biblioteca.models.itensmultimidia.*;
import biblioteca.models.membros.Membro;;

public class Reserva {
    private ItemMultimidia obra; 
    private Membro pessoa;
    private boolean reservado;

    public Reserva(ItemMultimidia obra, Membro pessoa) {
        this.obra = obra;
        this.pessoa = pessoa;
        this.reservado = true;
    }

    public ItemMultimidia getObra() {
        return this.obra;
    }

    public void setObra(ItemMultimidia obra) {
        this.obra = obra;
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
