package biblioteca.models.salas;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import biblioteca.models.equipamentos.*;

public class ReservaSalas {
	private LocalDate dataReserva;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private StatusReserva statusReserva;
	
	public ReservaSalas(LocalDate dataReserva, LocalTime horaInicio,
			LocalTime horaFim) {
		this.dataReserva = dataReserva;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.statusReserva = StatusReserva.PENDENTE;
	}
	
	//getters e setters
	public StatusReserva getStatusReserva() {
		return statusReserva;
	}
	
	public void setStatusReserva(StatusReserva status) {
		this.statusReserva = status;
	}
	
    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }
	
	//classes internas
	public class SalaIndividual {
		private final String nome;
		private boolean possuiComputador;
		
		public SalaIndividual(String nome, boolean possuiComputador) {
			this.nome = nome;
			this.possuiComputador = possuiComputador;
		}
		
		//getters e setters
	    public String getNome() {
	        return nome;
	    }

	    public boolean isPossuiComputador() {
	        return possuiComputador;
	    }

	    public void setPossuiComputador(boolean possuiComputador) {
	        this.possuiComputador = possuiComputador;
	    }
	}
	
	public class SalaGrupo {
	    private int capacidadeMaxima;
	    private boolean possuiEquipamentoApresentacao;

	    public SalaGrupo(int capacidadeMaxima, boolean possuiEquipamentoApresentacao) {
	        this.capacidadeMaxima = capacidadeMaxima;
	        this.possuiEquipamentoApresentacao = possuiEquipamentoApresentacao;
	    }

	    // getters e setters
	    public int getCapacidadeMaxima() {
	        return capacidadeMaxima;
	    }

	    public void setCapacidadeMaxima(int capacidadeMaxima) {
	        this.capacidadeMaxima = capacidadeMaxima;
	    }

	    public boolean isPossuiEquipamentoApresentacao() {
	        return possuiEquipamentoApresentacao;
	    }

	    public void setPossuiEquipamentoApresentacao(boolean possuiEquipamentoApresentacao) {
	        this.possuiEquipamentoApresentacao = possuiEquipamentoApresentacao;
	    }
	}
	
	public class SalaSilenciosa {
	    private int numeroAssentos;
	    private boolean possuiCabinesIndividuais;

	    public SalaSilenciosa(int numeroAssentos, boolean possuiCabinesIndividuais) {
	        this.numeroAssentos = numeroAssentos;
	        this.possuiCabinesIndividuais = possuiCabinesIndividuais;
	    }

	    //getters e setters)
	    public int getNumeroAssentos() {
	        return numeroAssentos;
	    }

	    public void setNumeroAssentos(int numeroAssentos) {
	        this.numeroAssentos = numeroAssentos;
	    }

	    public boolean isPossuiCabinesIndividuais() {
	        return possuiCabinesIndividuais;
	    }

	    public void setPossuiCabinesIndividuais(boolean possuiCabinesIndividuais) {
	        this.possuiCabinesIndividuais = possuiCabinesIndividuais;
	    }
	}
	
	public class SalaMultimidia {
	    private List<Equipamento> equipamentos;

	    public SalaMultimidia() {
	        this.equipamentos = new ArrayList<>();
	    }

	    public void adicionarEquipamento(Equipamento equipamento) {
	        equipamentos.add(equipamento);
	    }

	    public void removerEquipamento(Equipamento equipamento) {
	        equipamentos.remove(equipamento);
	    }

	    public List<Equipamento> getEquipamentos() {
	        return equipamentos;
	    }
	}
}
