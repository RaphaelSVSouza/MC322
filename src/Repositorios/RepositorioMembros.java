package Repositorios;

import java.util.ArrayList;
import java.util.List;

import pessoas.Membros.*;

public class RepositorioMembros {
    private List<Graduando> graduandos = new ArrayList<>();
    private List<PosGraduando> posGraduandos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public void adicionarGraduando(Graduando graduando) {
        graduandos.add(graduando);
    }

    public void adicionarPosGraduando(PosGraduando posGraduando) {
        posGraduandos.add(posGraduando);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Graduando> getGraduandos() {
        return graduandos;
    }

    public List<PosGraduando> getPosGraduandos() {
        return posGraduandos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}
