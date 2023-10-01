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
	private int quantidadeDePessoas;
	private StatusReserva statusReserva;
	private Sala sala;
	
	public ReservaSalas(Sala sala, int quantidadeDePessoas, LocalDate dataReserva,
			LocalTime horaInicio, LocalTime horaFim) {
		this.sala = sala;
		this.setQuantidadeDePessoas(quantidadeDePessoas);
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
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}

	//classes internas
    public class Sala {
    	private String nome;
    	private int capacidadeMaxima;
    	
		public Sala(String nome, int capacidadeMaxima) {
			this.nome = nome;
			this.capacidadeMaxima = capacidadeMaxima;
		}
    	
		//getters e setters
	    public String getNome() {
	        return nome;
	    }
	    
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

		public int getCapacidadeMaxima() {
			return capacidadeMaxima;
		}

		public void setCapacidadeMaxima(int capacidadeMaxima) {
			this.capacidadeMaxima = capacidadeMaxima;
		}
    }
    
	public class SalaIndividual extends Sala {
		private boolean possuiComputador;
		
		public SalaIndividual(String nome, int capacidadeMax, boolean possuiComputador) {
			super(nome, capacidadeMax);
			this.possuiComputador = possuiComputador;
		}
		
		//getters e setters
	    public boolean isPossuiComputador() {
	        return possuiComputador;
	    }

	    public void setPossuiComputador(boolean possuiComputador) {
	        this.possuiComputador = possuiComputador;
	    }
	}
	
	public class SalaGrupo extends Sala{
	    private boolean possuiEquipamentoApresentacao;

	    public SalaGrupo(String nome, int capacidadeMaxima, boolean possuiEquipamentoApresentacao) {
	    	super(nome, capacidadeMaxima);
	        this.possuiEquipamentoApresentacao = possuiEquipamentoApresentacao;
	    }

	    // getters e setters
	    public boolean isPossuiEquipamentoApresentacao() {
	        return possuiEquipamentoApresentacao;
	    }

	    public void setPossuiEquipamentoApresentacao(boolean possuiEquipamentoApresentacao) {
	        this.possuiEquipamentoApresentacao = possuiEquipamentoApresentacao;
	    }
	}
	
	public class SalaSilenciosa extends Sala{
	    private boolean possuiCabinesIndividuais;

	    public SalaSilenciosa(String nome, int capacidadeMax, boolean possuiCabinesIndividuais) {
	        super(nome, capacidadeMax);
	        this.possuiCabinesIndividuais = possuiCabinesIndividuais;
	    }

	    //getters e setters)

	    public boolean isPossuiCabinesIndividuais() {
	        return possuiCabinesIndividuais;
	    }

	    public void setPossuiCabinesIndividuais(boolean possuiCabinesIndividuais) {
	        this.possuiCabinesIndividuais = possuiCabinesIndividuais;
	    }
	}
	
	public class SalaMultimidia extends Sala{
	    private List<Equipamento> equipamentos;

	    public SalaMultimidia(String nome, int capacidadeMax) {
	        super(nome, capacidadeMax);
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
