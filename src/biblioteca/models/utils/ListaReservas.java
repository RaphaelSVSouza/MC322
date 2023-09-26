package biblioteca.models.utils;

import java.util.Iterator;
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
    public void addReserva(Reserva<T> reserva) {
        reservas.add(reserva);
        this.numReservas++;
    }

    public boolean removerReserva(T item, Membro membro) {
        Iterator<Reserva<T>> iterator = reservas.iterator();
        while (iterator.hasNext()) {
            Reserva<T> reserva = iterator.next();
            if (reserva.getItem().equals(item) && reserva.getMembro().equals(membro)) {
                iterator.remove();
                this.numReservas--;
                return true;
            }
        }
        
        return false;
    }
    

    public boolean possuiReserva(T item) {
        for (Reserva<T> reserva : reservas) {
            if (reserva.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }
} 
