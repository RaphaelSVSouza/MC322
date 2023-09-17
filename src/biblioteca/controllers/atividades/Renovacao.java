package biblioteca.controllers.atividades;

import java.time.LocalDate;

import biblioteca.models.membros.Membro;
import biblioteca.models.obras.Obra;

public class Renovacao { // Associação das classes Membro e Obra

    private Obra obraRenovada;
    private Membro pessoaRenovacao;
    private LocalDate dataRenovacao;

    public Renovacao(Obra obraRenovada, Membro pessoaRenovacao, LocalDate dataRenovacao) {
        this.obraRenovada = obraRenovada;
        this.pessoaRenovacao = pessoaRenovacao;
        this.dataRenovacao = dataRenovacao;
    }

    public Obra getObraRenovada() {
        return this.obraRenovada;
    }

    public void setObraRenovada(Obra obraRenovada) {
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
