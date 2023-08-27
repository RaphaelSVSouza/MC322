package biblioteca.sistema;

import java.time.LocalDate;
import obras.Obra;
import pessoas.Membros.Membros;

public class Renovacao { // Associação das classes Membro e Obra

    private Obra obraRenovada;
    private Membros membroRenovacao;
    private LocalDate dataRenovacao;


    public Renovacao(Obra obraRenovada, Membros membroRenovacao, LocalDate dataRenovacao) {
        this.obraRenovada = obraRenovada;
        this.membroRenovacao = membroRenovacao;
        this.dataRenovacao = dataRenovacao;
    }

    public Obra getObraRenovada() {
        return this.obraRenovada;
    }

    public void setObraRenovada(Obra obraRenovada) {
        this.obraRenovada = obraRenovada;
    }

    public Membros getMembroRenovacao() {
        return this.membroRenovacao;
    }

    public void setMembroRenovacao(Membros membroRenovacao) {
        this.membroRenovacao = membroRenovacao;
    }

    public LocalDate getDataRenovacao() {
        return this.dataRenovacao;
    }

    public void setDataRenovacao(LocalDate dataRenovacao) {
        this.dataRenovacao = dataRenovacao;
    }


}
