package pessoas.Membros;

import java.util.ArrayList;

import obras.Obra;

public class Professor extends Membros {
    private final int professorRegistro;
    private String instituto;
    private ArrayList<Obra> obrasAlugadas;

    // Construtor
    public Professor(String nome, long cpf, int professor_registro, String instituto) {
        super(nome, cpf);
        this.professorRegistro = professor_registro;
        this.instituto = instituto;
        this.obrasAlugadas = new ArrayList<Obra>();
    }

    // Getters & Setters
    public int getProfessor_registro() {
        return this.professorRegistro;
    }

    public String getInstituto() {
        return this.instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public ArrayList<Obra> getObrasAlugadas() {
        return this.obrasAlugadas;
    }

    public void setLivros_alugados(ArrayList<Obra> livros_alugados) {
        this.obrasAlugadas = livros_alugados;
    }

}