package biblioteca.sistema;

import java.time.LocalDate;
import obras.Obra;
import pessoas.Pessoa;

public class Renovacao { // Associação das classes Membro e Obra

    private Obra obraRenovada;
    private Pessoa pessoaRenovacao;
    private LocalDate dataRenovacao;

    public Renovacao(Obra obraRenovada, Pessoa pessoaRenovacao, LocalDate dataRenovacao) {
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

    public Pessoa getPessoaRenovacao() {
        return this.pessoaRenovacao;
    }

    public void setMembroRenovacao(Pessoa membroRenovacao) {
        this.pessoaRenovacao = membroRenovacao;
    }

    public LocalDate getDataRenovacao() {
        return this.dataRenovacao;
    }

    public void setDataRenovacao(LocalDate dataRenovacao) {
        this.dataRenovacao = dataRenovacao;
    }


}
