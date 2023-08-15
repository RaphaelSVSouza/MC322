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
        this.livros_alugados = new ArrayList<Livro>();
    }

    public int getProfessor_registro() {
        return this.professor_registro;
    }


    public String getInstituto() {
        return this.instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public ArrayList<Livro> getLivros_alugados() {
        return this.livros_alugados;
    }

    public void setLivros_alugados(ArrayList<Livro> livros_alugados) {
        this.livros_alugados = livros_alugados;
    }

}