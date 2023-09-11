package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;
import biblioteca.models.membros.academicos.Academico;
import biblioteca.models.obras.Obra;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<Obra> itens;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<Obra> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Academico membro, Obra item) {
        // Lógica de empréstimo
        return true;
    }

    @Override
    public boolean devolverItem(Academico membro, Obra item) {
        // Lógica de devolução
        return true;
    }
}