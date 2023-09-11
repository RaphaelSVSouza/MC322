package biblioteca.models.equipamentos;

public class Equipamento {
    // Classes internas
    public static class Informatica {
        private String nome;
        private final CategoriaEquipamento tipo;

        public Informatica(String nome, CategoriaEquipamento tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

        // Getters e Setters para os atributos
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public CategoriaEquipamento getTipo() {
            return tipo;
        }
    }

    public static class Audiovisual {
        private String nome;
        private final CategoriaEquipamento tipo;

        public Audiovisual(String nome) {
            this.nome = nome;
            this.tipo = CategoriaEquipamento.AUDIOVISUAL;
        }

        // Getters e Setters para os atributos
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public CategoriaEquipamento getTipo() {
            return tipo;
        }
    }

    public static class Impressao {
        private String nome;
        private final CategoriaEquipamento tipo;

        public Impressao(String nome) {
            this.nome = nome;
            this.tipo = CategoriaEquipamento.IMPRESSAO;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public CategoriaEquipamento getTipo() {
            return tipo;
        }
    }
}

