package lab01;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private final int registro_aluno; // matrícula/RA
    private String faculdade; // instituto do curso do aluno
    private boolean suspenso; // multa calculada em dias
    private int tempo_multa;
    private String modalidade; // graduação ou pós-graduação
    private ArrayList<Livro> livros_alugados;

 // Construtor
    public Aluno(String nome, long cpf, int registro_aluno, String faculdade,  boolean suspenso, int tempo_multa, String modalidade) {
        super(nome, cpf);
        this.registro_aluno = registro_aluno;
        this.faculdade = faculdade;
        this.suspenso = suspenso;
        this.tempo_multa = tempo_multa;
        this.modalidade = modalidade;
        this.livros_alugados = new ArrayList<>();
    }

    //Getters & Setters
    public int getRegistro_aluno() {
        return this.registro_aluno;
    }

    public String getFaculdade() {
        return this.faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public boolean isSuspenso() {
        return this.suspenso;
    }

    public boolean getSuspenso() {
        return this.suspenso;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public int getTempo_multa() {
        return this.tempo_multa;
    }

    public void setTempo_multa(int tempo_multa) {
        this.tempo_multa = tempo_multa;
    }

    public String getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public ArrayList<Livro> getLivros_alugados() {
        return this.livros_alugados;
    }

    public void setLivros_alugados(ArrayList<Livro> livros_alugados) {
        this.livros_alugados = livros_alugados;
    }

}