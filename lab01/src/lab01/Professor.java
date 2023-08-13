package lab01;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private final int professor_registro;
    private String instituto;
    private ArrayList<Livro> livros_alugados;

    // Construtor
    public Professor(String nome, long cpf, int professor_registro, String instituto) {
        super(nome, cpf);
        this.professor_registro = professor_registro;
        this.instituto = instituto;
        this.livros_alugados = new ArrayList<>();
    }
}