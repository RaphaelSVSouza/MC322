package biblioteca.controllers.atividades;

import java.time.LocalDate;

import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;

public class Renovacao { // Associação das classes Membro e ItemMultimidia

    private ItemMultimidia obraRenovada;
    private Membro membroRenovacao;
    private LocalDate dataRenovacao;

    public Renovacao(ItemMultimidia obraRenovada, Membro membroRenovacao, LocalDate dataRenovacao) {
        this.obraRenovada = obraRenovada;
        this.membroRenovacao = membroRenovacao;
        this.dataRenovacao = dataRenovacao;
    }

    public ItemMultimidia getObraRenovada() {
        return this.obraRenovada;
    }

    public void setObraRenovada(ItemMultimidia obraRenovada) {
        this.obraRenovada = obraRenovada;
    }

    public Membro getMembroRenovacao() {
        return this.membroRenovacao;
    }

    public void setMembroRenovacao(Membro membroRenovacao) {
        this.membroRenovacao = membroRenovacao;
    }

    public LocalDate getDataRenovacao() {
        return this.dataRenovacao;
    }

    public void setDataRenovacao(LocalDate dataRenovacao) {
        this.dataRenovacao = dataRenovacao;
    }


}
