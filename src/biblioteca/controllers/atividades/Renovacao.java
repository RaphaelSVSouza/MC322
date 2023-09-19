package biblioteca.controllers.atividades;

import java.time.LocalDate;

import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;

public class Renovacao { // Associação das classes Membro e Obra

    private ItemMultimidia obraRenovada;
    private Membro pessoaRenovacao;
    private LocalDate dataRenovacao;

    public Renovacao(ItemMultimidia obraRenovada, Membro pessoaRenovacao, LocalDate dataRenovacao) {
        this.obraRenovada = obraRenovada;
        this.pessoaRenovacao = pessoaRenovacao;
        this.dataRenovacao = dataRenovacao;
    }

    public ItemMultimidia getObraRenovada() {
        return this.obraRenovada;
    }

    public void setObraRenovada(ItemMultimidia obraRenovada) {
        this.obraRenovada = obraRenovada;
    }

    public Membro getPessoaRenovacao() {
        return this.pessoaRenovacao;
    }

    public void setMembroRenovacao(Membro membroRenovacao) {
        this.pessoaRenovacao = membroRenovacao;
    }

    public LocalDate getDataRenovacao() {
        return this.dataRenovacao;
    }

    public void setDataRenovacao(LocalDate dataRenovacao) {
        this.dataRenovacao = dataRenovacao;
    }


}
