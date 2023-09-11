package biblioteca.views;

import java.util.List;

import biblioteca.models.membros.academicos.Academico;

public interface MembroView {
    void mostrarListaMembros(List<Academico> membros);
    void mostrarDetalhesMembro(Academico membro);
}