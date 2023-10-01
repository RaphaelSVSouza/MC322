package biblioteca.models.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import biblioteca.controllers.atividades.Reserva;
import biblioteca.controllers.excecoes.ExcecaoSalaJaReservada;
import biblioteca.controllers.excecoes.ExcecaoCapacidadeSalaExcedida;
import biblioteca.models.membros.Membro;
import biblioteca.models.salas.ReservaSalas;

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
    	
    	try {
	        if (reserva.getItem() instanceof ReservaSalas) {
	            ReservaSalas reservaSala = (ReservaSalas) reserva.getItem();
	            
	            // verifica se excede a capacidade de pessoas
	            if (reservaSala.getQuantidadeDePessoas() > reservaSala.getSala().getCapacidadeMaxima()) {
	            	throw new ExcecaoCapacidadeSalaExcedida();
	            }
	            
	            LocalDate dataReserva = reservaSala.getDataReserva();
	            LocalTime horaInicio = reservaSala.getHoraInicio();
	            LocalTime horaFim = reservaSala.getHoraFim();
	            // Verifica se já existe reserva para essa sala no horário específico
	            for (Reserva<T> auxReserva : reservas) {
	                if (auxReserva.getItem() instanceof ReservaSalas) {
	                	ReservaSalas auxSala = (ReservaSalas) auxReserva.getItem();
	                    LocalDate auxDataReserva = auxSala.getDataReserva();
	                    LocalTime auxHoraInicio = auxSala.getHoraInicio();
	                    LocalTime auxHoraFim = auxSala.getHoraFim();
	
	                    // Verifica se a sala é a mesma e se há conflito de horário
	                    if (auxSala.getSala().equals(reservaSala) &&
	                        auxDataReserva.equals(dataReserva) &&
	                        ((horaInicio.isAfter(auxHoraInicio) && horaInicio.isBefore(auxHoraFim)) ||
	                         (horaFim.isAfter(auxHoraInicio) && horaFim.isBefore(auxHoraFim)))) {
	                        throw new ExcecaoSalaJaReservada();
	                    }
	                }
	            }
	        }
    	}
    	catch (ExcecaoSalaJaReservada e) {
    		System.out.println(e.getMessage());
    		return;
    	} 
    	catch (ExcecaoCapacidadeSalaExcedida e) {
    		System.out.println(e.getMessage());
    		return;
		}

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
