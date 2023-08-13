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
}