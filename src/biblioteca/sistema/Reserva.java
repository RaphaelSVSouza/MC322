package biblioteca.sistema;

import obras.Obra;
import pessoas.Pessoa;

public class Reserva {
    private Obra obra; 
    private Pessoa pessoa;
    private boolean reservado;

    public Reserva(Obra obra, Pessoa pessoa) {
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

    public Pessoa getMembros() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
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
