package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.membros.academicos.Academico;

public class MembroControllerImpl implements MembroController {
    private List<Academico> membros;

    public MembroControllerImpl() {
        membros = new ArrayList<>();
    }

    @Override
    public List<Academico> listarMembros() {
        return membros;
    }

    @Override
    public Academico buscarMembroPorIdentificacao(String identificacao) {
        // Lógica de busca
        return null;
    }
}