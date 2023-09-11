package biblioteca.models.eventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import biblioteca.models.equipamentos.Equipamento;

public class EventosBiblioteca {
    private String topico;
    private LocalDate data;
    private String local;
    private final TipoDeEvento tipo;

    public EventosBiblioteca(String topico, LocalDate data, String local, TipoDeEvento tipo) {
        this.topico = topico;
        this.data = data;
        this.local = local;
        this.tipo = tipo;
    }

    // Getters & Setters
    public String getTopico() {
        return topico;
    }        

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }
    
    public TipoDeEvento getTipoDeEvento() {
    	return tipo;
    }
    
    //classes internas
    public class Workshop {
        private String instrutor;            
        private String info; // Texto que armazena informações sobre o instrutor e o workshop
        private LocalTime horario;
        private List<String> materiaisNecessarios;

        public Workshop(String instrutor, String info, String materiais, LocalTime horario) {
            this.instrutor = instrutor;
            this.info = info;
            this.materiaisNecessarios = new ArrayList<>();
            this.horario = horario;
        }

        // Getters & setters
        public String getInfo() {
            return info;
        }

        public String getInstrutor() {
            return instrutor;
        }

        public List<String> getMateriais() {
            return materiaisNecessarios;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void setInstrutor(String instrutor) {
            this.instrutor = instrutor;
        }

	    public void adicionarMaterial(String material) {
	    	materiaisNecessarios.add(material);
	    }

	    public void removerMaterial(String material) {
	    	materiaisNecessarios.remove(material);
	    }
        
        public LocalTime getHorario() {
            return horario;
        }

        public void setHorario(LocalTime horario) {
            this.horario = horario;
        }
    }

    public class Palestra {
        private String palestrante;
        private LocalTime horario;

        public Palestra(String palestrante, LocalTime horario) {
            this.palestrante = palestrante;
            this.horario = horario;
        }

        // Getters & Setters
        public String getPalestrante() {
            return palestrante;
        }
        
        public void setPalestrante(String palestrante) {
            this.palestrante = palestrante;
        }
        
        public LocalTime getHorario() {
            return horario;
        }

        public void setHorario(LocalTime horario) {
            this.horario = horario;
        }
    }

    public class Exposicao {
        private String detalhes;
        private String expositores;
        private int duracao; //em minutos
        
        public Exposicao(String detalhes, String expositores, int duracao) {
            this.detalhes = detalhes;
            this.expositores = expositores;
            this.duracao = duracao;
        }

        // Getters & Setter
        public String getDetalhes() {
            return detalhes;
        }

        public int getDuracao() {
            return duracao;
        }

        public String getExpositores() {
            return expositores;
        }

        public void setDetalhes(String detalhes) {
            this.detalhes = detalhes;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }

        public void setExpositores(String expositores) {
            this.expositores = expositores;
        }
    }
    
}
