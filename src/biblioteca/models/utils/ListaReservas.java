package biblioteca.models.utils;

import java.util.LinkedList;
import java.util.List;
import biblioteca.controllers.atividades.Reserva;
import biblioteca.models.membros.Membro;
public class ListaReservas<T> {
    private List<Reserva<T>> reservas = new LinkedList<>();
    private int numReservas;

    //Getters & Setters
    public int getNumReservasnumReservas() {
        return this.numReservas;
    }   

    public void setNumReservasnumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    public List<Reserva<T>> getreservas() {
        return this.reservas;
    }

    public void setreservas(List<Reserva<T>> reservas) {
        this.reservas = reservas;
    }

    // Métodos variados
    public void addReserva(T reserva) {
        reservas.add(reserva);
        this.numReservas++;
    }

    public boolean removerReserva(T reserva) {
        this.numReservas--;
        return reservas.remove(reserva);
    }

    public boolean possuiReserva(T reserva) {
        return reservas.contains(reserva);
    }
} 
