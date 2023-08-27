package biblioteca.sistema;

import java.time.LocalDate;

public class Renovacao {

    private Emprestimo emprestimo; // relação de agregação entre empréstimo-renovação
    private LocalDate dataRenovacao;

    public Renovacao(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        this.dataRenovacao = LocalDate.now();
    }

    public Emprestimo getEmprestimo() {
        return this.emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public LocalDate getDataRenovacao() {
        return this.dataRenovacao;
    }

    public void setDataRenovacao(LocalDate dataRenovcao) {
        this.dataRenovacao = dataRenovcao;
    }
    
    


}
