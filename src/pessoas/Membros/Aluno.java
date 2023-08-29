package pessoas.Membros;

import java.util.ArrayList;
import obras.Obra;

public class Aluno extends Membros {
    private final int registro_aluno; // matrícula/RA
    private String faculdade; // instituto do curso do aluno 
    private int tempoMulta; // multa calculada em dias
    private String modalidade; // graduação ou pós-graduação
    private ArrayList<Obra> obrasAlugadas;

    //Construtores
    public Aluno(String nome, long cpf, int registro_aluno, String faculdade, int tempo_multa, String modalidade) {
        super(nome, cpf);
        this.registro_aluno = registro_aluno;
        this.faculdade = faculdade;
        this.tempoMulta = tempo_multa;
        this.modalidade = modalidade;
        this.obrasAlugadas = new ArrayList<Obra>();
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



    public int getTempo_multa() {
        return this.tempoMulta;
    }

    public void setTempo_multa(int tempo_multa) {
        this.tempoMulta = tempo_multa;
    }

    public String getModalidade() {
        return this.modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public ArrayList<Obra> getLivros_alugados() {
        return this.obrasAlugadas;
    }

    public void setLivros_alugados(ArrayList<Obra> livros_alugados) {
        this.obrasAlugadas = livros_alugados;
    }

}