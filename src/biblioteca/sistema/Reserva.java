package biblioteca.sistema;

import membros.Membro;
import obras.Obra;

public class Reserva {
    private Obra obra; 
    private Membro pessoa;
    private boolean reservado;

    public Reserva(Obra obra, Membro pessoa) {
        this.obra = obra;
        this.pessoa = pessoa;
        this.reservado = true;
    }

    public Obra getObra() {
        return this.obra;
    }

    public void setObra(Obra obra) {
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
