package biblioteca.sistema;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import obras.Obra;
import pessoas.Membros.Aluno;
import pessoas.Membros.Membros;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Obra obra;
    private Membros membros;
    private List<Renovacao> renovacoes;


    // Construtor
    public Emprestimo(Obra obra, Membros membro) {
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = calcularDevolucao(membro);
        this.obra = obra;
        this.membros = membro;
    }


    // Getters & Setters
    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Obra getObra() {
        return this.obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Membros getMembros() {
        return this.membros;
    }

    public void setMembros(Membros membros) {
        this.membros = membros;
    }

    public List<Renovacao> getRenovacoes() {
        return this.renovacoes;
    }

    public void setRenovacoes(List<Renovacao> renovacoes) {
        this.renovacoes = renovacoes;
    }
    

    // Método para calcular a data de devolução
    public LocalDate calcularDevolucao(Membros membros) {
        if (membros instanceof Aluno) {
            Aluno aluno = (Aluno) membros;
            int tempoMultaAluno = aluno.getTempo_multa();
            return dataEmprestimo.plusDays(tempoMultaAluno); // Adiciona o tempo de multa em dias
        }
        return dataEmprestimo.plusMonths(1); // Caso seja um professor, o tempo de empréstimo é de 1 mês1); //
    }

    // Método para realizar a devolução
    public void registrarDevolucao() {
        this.dataDevolucao = LocalDate.now();
        LocalDate dataAtual = dataDevolucao;
        if (dataEmprestimo.isBefore(dataDevolucao)) {
            // Calcula a data de suspensão
            long diasAtraso = ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);

            if (diasAtraso > 0) { // se o numero for positivo, então houve atraso
                LocalDate dataSuspensaoInicio = dataAtual;
                LocalDate dataSuspensaoFim = dataSuspensaoInicio.plusDays(diasAtraso * 3); // 3 dias de suspensão por dia de atraso

                membros.setDataSuspensaoInicio(dataSuspensaoInicio);
                membros.setDataSuspensaoFim(dataSuspensaoFim);

                System.out.println("Devolução atrasada. Suspensão de " + (diasAtraso * 3) + " dias.");
            }

        } else {
            System.out.println("Devolução dentro do prazo.");
        }
    }

    // Método para Renovar um item
    public void realizarRenovacao() {
        
        if (membros.isSuspenso()) {
            System.out.println("Pessoa suspensa.");
            return;
        }

        if (renovacoes.size() < 3) {
            LocalDate newDevolucao = calcularDevolucao(membros);
            dataDevolucao = newDevolucao;
            renovacoes.add(new Renovacao(this));
            System.out.println("Item renovado.");
        }

        else {
            System.out.println("Não foi possivel renovar. Limite excedido");
        }
    }
}
