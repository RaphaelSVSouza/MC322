package biblioteca.views;

import java.util.List;

import biblioteca.models.obras.Obra;

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<Obra> itens);
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
}