package biblioteca.controllers;

import java.util.List;

import biblioteca.models.membros.academicos.Academico;
import biblioteca.models.obras.Obra;
import biblioteca.views.BibliotecaView;

public interface BibliotecaController {
    List<Obra> consultarItensDisponiveis();
    boolean emprestarItem(Academico membro, Obra item);
    boolean devolverItem(Academico membro, Obra item);
}