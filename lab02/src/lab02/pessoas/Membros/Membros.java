package pessoas.Membros;

import java.time.LocalDate;

import pessoas.Pessoa;

public class Membros extends Pessoa {
    private LocalDate dataSuspensaoInicio;
    private LocalDate dataSuspensaoFim;
    private boolean suspenso;

    public Membros(String nome, long cpf) {
        super(nome, cpf);
    }
    
    public LocalDate getDataSuspensaoInicio() {
        return this.dataSuspensaoInicio;
    }

    public void setDataSuspensaoInicio(LocalDate dataSuspensaoInicio) {
        this.dataSuspensaoInicio = dataSuspensaoInicio;
    }

    public LocalDate getDataSuspensaoFim() {
        return this.dataSuspensaoFim;
    }

    public void setDataSuspensaoFim(LocalDate dataSuspensaoFim) {
        this.dataSuspensaoFim = dataSuspensaoFim;
    }

    public boolean isSuspenso() {
        return this.suspenso;
    }

    public boolean getSuspenso() {
        return this.suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }
}
