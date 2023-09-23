package biblioteca.models.equipamentos;

public class Equipamento {
    private String nome;
    private CategoriaEquipamento tipo;

    public Equipamento(String nome, CategoriaEquipamento tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaEquipamento getTipo() {
        return tipo;
    }

    public static class Informatica extends Equipamento {
        public Informatica(String nome) {
            super(nome, CategoriaEquipamento.INFORMATICA);
        }
    }

    public static class Audiovisual extends Equipamento {
        public Audiovisual(String nome) {
            super(nome, CategoriaEquipamento.AUDIOVISUAL);
        }
    }

    public static class Impressao extends Equipamento {
        public Impressao(String nome) {
            super(nome, CategoriaEquipamento.IMPRESSAO);
        }
    }
}
