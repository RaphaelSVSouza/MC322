package biblioteca.models.eventos;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventosBiblioteca {
    private String topico;
    private LocalDate data;
    private String local;

    public EventosBiblioteca(String topico, LocalDate data, String local) {
        this.topico = topico;
        this.data = data;
        this.local = local;
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
    
    //classes internas
    public class Workshop {
        private String instrutor;            
        private String info; // Texto que armazena informações sobre o instrutor e o workshop
        private LocalTime horario;
        private String materiais;

        public Workshop(String instrutor, String info, String materiais, LocalTime horario) {
            this.instrutor = instrutor;
            this.info = info;
            this.materiais = materiais;
            this.horario = horario;
        }

        // Getters & setters
        public String getInfo() {
            return info;
        }

        public String getInstrutor() {
            return instrutor;
        }

        public String getMateriais() {
            return materiais;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public void setInstrutor(String instrutor) {
            this.instrutor = instrutor;
        }

        public void setMateriais(String materiais) {
            this.materiais = materiais;
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
        private String duracao;
        
        public Exposicao(String detalhes, String expositores, String duracao) {
            this.detalhes = detalhes;
            this.expositores = expositores;
            this.duracao = duracao;
        }

        // Getters & Setter
        public String getDetalhes() {
            return detalhes;
        }

        public String getDuracao() {
            return duracao;
        }

        public String getExpositores() {
            return expositores;
        }

        public void setDetalhes(String detalhes) {
            this.detalhes = detalhes;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }

        public void setExpositores(String expositores) {
            this.expositores = expositores;
        }
    }
    
}
