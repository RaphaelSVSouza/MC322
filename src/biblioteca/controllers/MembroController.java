package biblioteca.controllers;

import java.util.List;

import biblioteca.models.membros.academicos.Academico;
import biblioteca.views.MembroView;

public interface MembroController {
    List<Academico> listarMembros();
    Academico buscarMembroPorIdentificacao(String identificacao);
}