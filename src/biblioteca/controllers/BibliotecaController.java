package biblioteca.controllers;

import java.util.List;
import biblioteca.models.membros.Membro;
import biblioteca.models.obras.Obra;
import biblioteca.views.BibliotecaView;

public interface BibliotecaController {
    List<Obra> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, Obra item);
    boolean devolverItem(Membro membro, Obra item);
}