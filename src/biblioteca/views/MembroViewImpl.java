package biblioteca.views;

import java.util.List;

import biblioteca.controllers.MembroController;
import biblioteca.models.membros.academicos.Academico;

public class MembroViewImpl implements MembroView {
    private MembroController membroController;

    public MembroViewImpl(MembroController controller) {
        membroController = controller;
    }

    @Override
    public void mostrarListaMembros(List<Academico> membros) {
        // Implementação da exibição da lista de membros
    }

    @Override
    public void mostrarDetalhesMembro(Academico membro) {
        // Implementação da exibição dos detalhes de um membro
    }
}