package biblioteca.models.multimidia;

public class Multimidia {
	//classes internas
    public static class Audio {
        private String nome;
        private final FormatoMultimidia tipo;

        public Audio(String nome) {
            this.nome = nome;
            this.tipo = FormatoMultimidia.AUDIO;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public FormatoMultimidia getTipo() {
            return tipo;
        }
    }

    public static class Video {
        private String nome;
        private final FormatoMultimidia tipo;

        public Video(String nome) {
            this.nome = nome;
            this.tipo = FormatoMultimidia.VIDEO;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public FormatoMultimidia getTipo() {
            return tipo;
        }
    }

    public static class Software {
        private String nome;
        private final FormatoMultimidia tipo;

        public Software(String nome) {
            this.nome = nome;
            this.tipo = FormatoMultimidia.SOFTWARE;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public FormatoMultimidia getTipo() {
            return tipo;
        }
    }
}
