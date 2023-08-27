package biblioteca.sistema;

import obras.Obra;
import pessoas.Membros.Membros;

public class Reserva {
    private Obra obra;
    private Membros membros;
    private boolean reservado;

    public Reserva(Obra obra, Membros membros) {
        this.obra = obra;
        this.membros = membros;
        this.reservado = true;
    }

    public Obra getObra() {
        return this.obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Membros getMembros() {
        return this.membros;
    }

    public void setPessoa(Membros membros) {
        this.membros = membros;
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
