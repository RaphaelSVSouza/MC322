package biblioteca.controllers.atividades;

import biblioteca.models.itensmultimidia.ItemMultimidia;
import biblioteca.models.membros.Membro;
import biblioteca.models.utils.ItemBiblioteca;

	public class ReservaService<T extends ItemMultimidia> {
	public boolean reservarItem(T item, ItemBiblioteca<T> itens, Membro membro) {
        Reserva<T> reserva = new Reserva<>(item, membro);
        if (itens.getReservas().possuiReserva(item)) {
            System.out.println("O item já está reservado");
            return false;
        }

        itens.getReservas().addReserva(reserva);
        System.out.println(item.getTitulo() + " reservado para " + membro.getNome());
        return true;
    }
}
